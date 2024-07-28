package simula.compiler.syntaxClass.declaration;

import java.io.IOException;
import java.lang.classfile.ClassFile;
import java.lang.classfile.ClassHierarchyResolver;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.instruction.SwitchCase;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Testing {
	
	public static void main(String[] args) {
		try { new Testing().buildClassFile(); } catch (IOException e) { e.printStackTrace(); }
	}
	
	abstract class ClassHierarchy {
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
	
	public byte[] buildClassFile() throws IOException {
		ClassDesc CD_ThisClass = ClassDesc.of("MyClass");
		ClassDesc CD_SuperClass = ConstantDescs.CD_Object;
		System.out.println("Begin buildClassFile: "+CD_ThisClass+" extends "+CD_SuperClass);
		ClassHierarchy.addClassToSuperClass(CD_ThisClass, CD_SuperClass);

		byte[] bytes = ClassFile.of(ClassFile.ClassHierarchyResolverOption.of(ClassHierarchy.getResolver())).build(CD_ThisClass,
				classBuilder -> {
					classBuilder
						.withMethodBody("_STM",
							MethodTypeDesc.ofDescriptor("()V"), ClassFile.ACC_PUBLIC, codeBuilder -> buildMethod_STM(codeBuilder));
				}
		);
		return(bytes);
	}


	
	private void buildMethod_STM(CodeBuilder codeBuilder) {
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		codeBuilder
			.labelBinding(begScope);
		
		System.out.println("buildMethod_STM "+begScope);
		
		Label endLabel = codeBuilder.newLabel();
		codeBuilder
			.aconst_null()
			.if_nonnull(endLabel);
		
		buildLookupSwitch(codeBuilder);
		
		codeBuilder
			.labelBinding(endLabel)
			.return_()
			.labelBinding(endScope);
	}
	
	
	private void buildLookupSwitch(CodeBuilder  codeBuilder) {
		Vector<SwitchCase> lookupSwitchCases = new Vector<SwitchCase>();
		int nCases = 3;
		for(int i=0;i<nCases;i++) {
			lookupSwitchCases.add(SwitchCase.of(i, codeBuilder.newLabel()));
		}

		// Build the LookupSwitch Instruction
		Label defaultTarget = codeBuilder.newLabel(); // beginning of the default handler block.
		Label endLabel = codeBuilder.newLabel();
		
		codeBuilder
			.iconst_0() // Index
			.lookupswitch(defaultTarget, lookupSwitchCases);
		
//		int caseBlockSize = 10000;
		int caseBlockSize = 13000;
		for(int i=0;i<nCases;i++) {
			SwitchCase sc = lookupSwitchCases.get(i);
			codeBuilder.labelBinding(sc.target());
			buildSomeCode(codeBuilder,caseBlockSize);	
		}

		codeBuilder.labelBinding(defaultTarget);
		codeBuilder.labelBinding(endLabel);
	}

	
	void buildSomeCode(CodeBuilder codeBuilder,int n) {
		for(int i=0;i<n;i++) codeBuilder.nop();
	}

}
