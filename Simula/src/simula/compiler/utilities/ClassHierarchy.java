package simula.compiler.utilities;

import java.io.IOException;
import java.lang.classfile.ClassHierarchyResolver;
import java.lang.constant.ClassDesc;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

import simula.compiler.AttributeInputStream;
import simula.compiler.AttributeOutputStream;
import simula.compiler.syntaxClass.SyntaxClass;

import java.util.Vector;

/**
 * Mail from: Adam Sotona <adam.sotona@oracle.com>  on Apr 28, 2024.
 * <p>
 * Your compiler reached the complexity where you reference generated classes
 * from other generated classes. Class-File API in certain circumstances needs
 * to know some information about the classes referenced from the generated
 * bytecode. Such information is provided in ClassHierarchyInfo using functional
 * interface ClassHierarchyResolver. By default is the information obtained from
 * system class loader. However, the classes you generate are probably not yet
 * known to the system class loader.
 * <p>
 * You should specify a custom ClassHierarchyResolver for your compiler as a
 * Class-File API option
 * `ClassFile.of(ClassFile.ClassHierarchyResolverOption.of(...))`.
 * <p>
 * Here you have multiple options how to provide the missing information using
 * combinations of ClassHierarchyResolver factory methods and custom code:
 * <p>
 * For example, if the required classes have been already generated and you can
 * provide a physical access to them, you can compose the ClassHierarchyResolver
 * this way:
 * 
 * `ClassHierarchyResolver.defaultResolver().orElse(ClassHierarchyResolver.
 * ofResourceParsing(Function<ClassDesc, InputStream>).cached())`
 * <p>
 * Or if you know all the generated classes in advance, you can provide the
 * missing info about the generated classes in a set and map form:
 * 
 * `ClassHierarchyResolver.defaultResolver().orElse(ClassHierarchyResolver.
 * of(Collection<ClassDesc> interfaces, Map<ClassDesc, ClassDesc> classToSuperClass))`
 * <p>
 * Or in a form of dynamic direct implementation of the ClassHierarchyResolver:
 * 
 * `ClassHierarchyResolver.defaultResolver().orElse(classDesc -> isInterface ? :
 * ClassHierarchyInfo.ofInterface() : ClassHierarchyInfo.ofClass(ClassDesc superClass))`
 */
public abstract class ClassHierarchy {
//	private static Map<ClassDesc, ClassDesc> classToSuperClass = new HashMap<ClassDesc, ClassDesc>();
//	private static Collection<ClassDesc> interfaces = new Vector<ClassDesc>();
	private static Map<ClassDesc, ClassDesc> classToSuperClass;
	private static Collection<ClassDesc> interfaces;

	public static void init() {
		classToSuperClass = new HashMap<ClassDesc, ClassDesc>();
		interfaces = new Vector<ClassDesc>();		
	}
	
	public static ClassHierarchyResolver getResolver() {
		ClassHierarchyResolver res = ClassHierarchyResolver.defaultResolver()
				.orElse(ClassHierarchyResolver.of(interfaces, classToSuperClass));
		return res;
	}

	public static void addClassToSuperClass(ClassDesc cld, ClassDesc sup) {
		classToSuperClass.put(cld, sup);
	}
	
	public static ClassDesc getRealSuper(ClassDesc sub) {
		ClassDesc sup = classToSuperClass.get(sub);
		if(sup == null) return null;
		if(sup.equals(RTS.CD.RTS_CLASS) || sup.equals(RTS.CD.RTS_PROCEDURE)) return null;
		return sup;
	}
	
	public static String getRealPrefix(String sub) {
		ClassDesc sup = classToSuperClass.get(ClassDesc.of(sub));
		if(sup == null) return null;
		String packageName = sup.packageName();
		if(packageName.equals("simula.runtime")) return null;
		return packageName+'.'+sup.displayName();
	}
	
	public static void xprint() {
		System.out.println("\n================= ClassHierarchy.print =================");
        for (Entry<ClassDesc, ClassDesc> entry : classToSuperClass.entrySet()) {
            ClassDesc sub = entry.getKey();
            ClassDesc sup = entry.getValue();
//            if(! sup.displayName().startsWith("RTS_")) {
	    		String subClass = sub.packageName() + '.' + sub.displayName();
	    		while(subClass.length() < 50) subClass = subClass + ' ';
	    		String superClass = sup.packageName() + '.' + sup.displayName();
	    		System.out.println("class " + subClass + " extends " + superClass);
//            }
        }
	}

	// ***********************************************************************************************
	// *** ClassHierarchy print tree
	// ***********************************************************************************************
	private static Vector<Node> allNodes;
	
	public static void print() {
		allNodes = new Vector<Node>();
		Node top = lookup("_TOP");
		top.children.add(lookup("simula.runtime.RTS_CLASS"));
		top.children.add(lookup("simula.runtime.RTS_PROCEDURE"));
        for (Entry<ClassDesc, ClassDesc> entry : classToSuperClass.entrySet()) {
            ClassDesc sub = entry.getKey();
            ClassDesc sup = entry.getValue();
    		Node supNode = lookup(sup.packageName() + '.' + sup.displayName());
    		Node subNode = lookup(sub.packageName() + '.' + sub.displayName());
    		supNode.children.add(subNode);
        }
		System.out.println("\n================= ClassHierarchy.print =================");
		lookup("simula.runtime.RTS_CLASS").print(1);
		System.out.println("\n================= Procedure List =================");
		lookup("simula.runtime.RTS_PROCEDURE").print(1);
	}
	
	private static class Node implements Comparable<Node> {
		String name;
		TreeSet<Node> children = new TreeSet<Node>();
		
		void print(int indent) {
			System.out.println(SyntaxClass.edIndent(indent) + this.name);
			for(Node child:children) child.print(indent + 1);
		}

		@Override
		public int compareTo(Node node) {
			return name.compareToIgnoreCase(node.name);
		}
	}
	
	private static Node lookup(String name) {
		for(Node node:allNodes) if(node.name.equals(name)) return(node);
		Node n = new Node(); n.name = name;
		allNodes.add(n);
		return n;
	}
	

	// ***********************************************************************************************
	// *** Attribute File I/O
	// ***********************************************************************************************
	private static final String mark = "]END ClassHierarchy";
	
	public static void writeObject(AttributeOutputStream oupt) throws IOException {
		Util.TRACE_OUTPUT("BEGIN Write ClassHierarchy: ");
        for (Entry<ClassDesc, ClassDesc> entry : classToSuperClass.entrySet()) {
            ClassDesc sub = entry.getKey();
            ClassDesc sup = entry.getValue();
    		oupt.writeString(sub.packageName());
    		oupt.writeString(sub.displayName());
    		oupt.writeString(sup.packageName());
    		oupt.writeString(sup.displayName());
        }
		oupt.writeString(mark);
	}

	public static void readObject(AttributeInputStream inpt) throws IOException {
		String next = inpt.readString();
//		while(next != null) {
		while(! next.equals(mark)) {
			ClassDesc sub = ClassDesc.of(next+'.'+inpt.readString());
			ClassDesc sup = ClassDesc.of(inpt.readString()+'.'+inpt.readString());
			addClassToSuperClass(sub, sup);
			next = inpt.readString();
		}
		Util.TRACE_INPUT("END Read ClassHierarchy: ");
//		print();
	}
	
	
}
