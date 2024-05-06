package simula.compiler.utilities;

import java.lang.classfile.ClassHierarchyResolver;
import java.lang.constant.ClassDesc;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
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
	private static Map<ClassDesc, ClassDesc> classToSuperClass = new HashMap<ClassDesc, ClassDesc>();
	private static Collection<ClassDesc> interfaces = new Vector<ClassDesc>();

	public static ClassHierarchyResolver getResolver() {
		ClassHierarchyResolver res = ClassHierarchyResolver.defaultResolver()
				.orElse(ClassHierarchyResolver.of(interfaces, classToSuperClass));
		return res;
	}

	public static void addClassToSuperClass(ClassDesc cld, ClassDesc sup) {
		classToSuperClass.put(cld, sup);
	}
}
