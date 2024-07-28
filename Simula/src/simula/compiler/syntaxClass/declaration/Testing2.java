package simula.compiler.syntaxClass.declaration;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.classfile.ClassFile;
import java.lang.classfile.ClassHierarchyResolver;
import java.lang.classfile.CodeBuilder;
import java.lang.classfile.Label;
import java.lang.classfile.constantpool.ConstantPoolBuilder;
import java.lang.classfile.instruction.SwitchCase;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import simula.compiler.utilities.Global;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

public class Testing2 {
	private Vector<SwitchCase> tableSwitchCases = new Vector<SwitchCase>();
	
	public static void main(String[] args) {
		try {
			new Testing2().buildClassFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
//		listGeneratedClassFile(bytes);
		return(bytes);
	}


	
	private void buildMethod_STM(CodeBuilder codeBuilder) {
		//ConstantPoolBuilder pool = codeBuilder.constantPool();
		Label begScope = codeBuilder.newLabel();
		Label endScope = codeBuilder.newLabel();
		codeBuilder
			.labelBinding(begScope);
		
		System.out.println("buildMethod_STM "+begScope+" +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
//		Label contLabel = codeBuilder.newLabel();
//		codeBuilder.trying(
//				blockCodeBuilder -> buildTryBlock(blockCodeBuilder),
//				catchBuilder -> catchBuilder.catching(ConstantDescs.CD_Throwable,
//						blockCodeBuilder -> buildCatchBlock(blockCodeBuilder,contLabel)));
//		codeBuilder.labelBinding(contLabel);
		buildTryBlock(codeBuilder);

		// Return
		codeBuilder
			.return_()
			.labelBinding(endScope);
	}

	private void buildTryBlock(CodeBuilder  codeBuilder) {
		Label endLabel = codeBuilder.newLabel();
		codeBuilder
		.aconst_null()
		.if_nonnull(endLabel);
		
		buildSomeCode(codeBuilder,12);
		
//		buildTableSwitch(codeBuilder);
		
		buildSomeCode(codeBuilder,50);	
		
		buildLookupSwitch(codeBuilder);
		
		codeBuilder
			.labelBinding(endLabel);

	}

	
	private void buildTableSwitch(CodeBuilder  codeBuilder) {
//        13: aload_0
//        14: getfield      #34                 // Field _JTX:I
//        17: tableswitch   { // 1 to 1
//
//                       1: 36
//                 default: 36
//            }
//        36: ...
//		for(int i=0;i<64;i++) {
		int i = 0;
			Label lab = codeBuilder.newLabel();
			tableSwitchCases.add(SwitchCase.of(i, lab));
			System.out.println("add "+i+"  "+lab);
//			CodeBuilder
//				.labelBinding(lab);
//			buildSomeCode(CodeBuilder,501);	
//		}
		
		// Build the TableSwitch Instruction
		Label defaultTarget = codeBuilder.newLabel(); // beginning of the default handler block.
		int lowValue = 1;            			 // the minimum key value.
		int highValue = tableSwitchCases.size(); // the maximum key value.
		codeBuilder
			.aload(0)
			.tableswitch(lowValue, highValue, defaultTarget, tableSwitchCases)
			.labelBinding(defaultTarget);
	
		codeBuilder
			.labelBinding(lab);

	}
	
	
	private void buildLookupSwitch(CodeBuilder  codeBuilder) {
//        63: aload_0
//        64: getfield      #27                 // Field opc_1:I
//        67: lookupswitch  { // 3
//
//                       0: 100
//
//                       1: 9805
//
//                       2: 19510
//                 default: 29215
//            }
		Vector<SwitchCase> lookupSwitchCases = new Vector<SwitchCase>();
		int nCases = 3;
		int index = 1;
//		for(SwitchWhenPart when:switchCases) {
//			 index = when.initLookupSwitchCases(index,codeBuilder);
		for(int i=0;i<nCases;i++) {
			lookupSwitchCases.add(SwitchCase.of(i, codeBuilder.newLabel()));
		}

		// Build the LookupSwitch Instruction
		Label defaultTarget = codeBuilder.newLabel(); // beginning of the default handler block.
		Label endLabel = codeBuilder.newLabel();

		System.out.println("\nSwitchStatement.buildByteCode: Build LookupSwitch Instruction: ");
		System.out.println("SwitchStatement.buildByteCode: defaultTarget = " + defaultTarget);
		System.out.println("SwitchStatement.buildByteCode: endLabel = " + endLabel);
		for(int i=0;i<lookupSwitchCases.size();i++) {
			System.out.println("SwitchStatement.buildByteCode: LookupSwitchCases("+i+") = " + lookupSwitchCases.get(i));
		}
		
		codeBuilder
			.iconst_0() // Index
			.lookupswitch(defaultTarget, lookupSwitchCases);
		
//        for(SwitchWhenPart when:switchCases) {
//        	when.buildByteCode(codeBuilder);
//        }
//        if(!has_NONE_case) {
//			codeBuilder.labelBinding(defaultTarget);
//        }

//		int caseBlockSize = 10000;
		int caseBlockSize = 13000;
		for(int i=0;i<nCases;i++) {
			SwitchCase sc = lookupSwitchCases.get(i);
			codeBuilder.labelBinding(sc.target());
			buildSomeCode(codeBuilder,caseBlockSize);	
		}

        
		codeBuilder.labelBinding(defaultTarget);
		codeBuilder.labelBinding(endLabel);
		
		System.out.println("SwitchStatement.buildByteCode: defaultTarget = " + defaultTarget);
		System.out.println("SwitchStatement.buildByteCode: endLabel = " + endLabel);
		for(int i=0;i<lookupSwitchCases.size();i++) {
			System.out.println("SwitchStatement.buildByteCode: LookupSwitchCases("+i+") = " + lookupSwitchCases.get(i));
		}

	}
	
	
	private void buildCatchBlock(CodeBuilder  codeBuilder,Label contLabel) {
		codeBuilder
			.pop()
			.goto_(contLabel)
			;
	}
	

	
	void buildSomeCode(CodeBuilder codeBuilder,int n) {
		for(int i=0;i<n;i++) {
			codeBuilder
//				.aload(0)
//				.pop();
				.nop();
		}
	}

	

	private void listGeneratedClassFile(byte[] bytes) throws IOException {
        File outputFile = new File(Global.tempClassFileDir + "\\" + Global.packetName + "\\MyClass.class");
        outputFile.getParentFile().mkdirs();
        FileOutputStream oupt = new FileOutputStream(outputFile);
        oupt.write(bytes); oupt.flush(); oupt.close();
        if(Option.verbose) System.out.println("ClassFile written to: " + outputFile + "  nBytes="+bytes.length);

        Util.doListClassFile("" + outputFile); // List generated .class file
//    	public static void doListClassFile(final String classFileName) {
        String classFileName = "" + outputFile;
    		System.out.println("\n\n******** BEGIN List ClassFile: "+classFileName + " *****************************************************");
    		try {
    			execute("javap", "-c", "-l", "-p", "-s", "-verbose", classFileName);
    		} catch (IOException e) {
    			Util.IERR("Impossible", e);
    		}
    		System.out.println("******** ENDOF List ClassFile: "+classFileName + " *****************************************************\n\n");
//    	}
        outputFile.delete();
	}

	private static int execute(final Vector<String> cmd) throws IOException {
		String[] cmds = new String[cmd.size()];
		cmd.copyInto(cmds);
		return (execute(cmds));
	}
	public static int execute(final String... cmdarray) throws IOException {
		Runtime runtime = Runtime.getRuntime();
		if (Option.verbose) {
			String line = "";
			for (int i = 0; i < cmdarray.length; i++)
				line = line + " " + cmdarray[i];
			Util.println("Execute: " + line);
		}
		Process process = runtime.exec(cmdarray);
		InputStream err = process.getErrorStream();
		InputStream inp = process.getInputStream();
		StringBuilder error = new StringBuilder();
		while (process.isAlive()) {
			while (err.available() > 0) {
				char c = (char) err.read();
				System.err.append(c);
				error.append(c);
			}
			while (inp.available() > 0) {
				if (Global.console != null)
					Global.console.write("" + (char) inp.read());
				else
					System.out.append((char) inp.read());
			}
		}
		if (error.length() > 0)
			Util.error(error.toString());
		return (process.exitValue());
	}

}
