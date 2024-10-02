/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Vector;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

import simula.compiler.parsing.Parse;
import simula.compiler.syntaxClass.statement.ProgramModule;
import simula.compiler.transform.ClassFileTransform;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.ObjectKind;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.SimulaClassLoader;
import simula.compiler.utilities.Util;
import simula.editor.RTOption;

/**
 * The Simula Compiler.
 * <p>
 * The compiler consists of the following steps:
 * <ul>
 * <li>Initiate global variables.
 * <li>Do Parsing: Read source file through the scanner building program syntax tree.
 * <li>Do Checking: Traverse the syntax tree performing semantic checking.
 * <li>Do JavaCoding: Traverse the syntax tree generating .java code.
 * <li>Call Java Compiler to generate .class files.
 * <li>Do ByteCodeEngineering updating .class files.
 * <li>Create executable .jar of program.
 * <li>Execute .jar file.
 * </ul>
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/SimulaCompiler.java"><b>Source
 * File</b></a>.
 *
 * @author Øystein Myhre Andersen
 *
 */
public final class SimulaCompiler {
	
	/**
	 * The Reader in case of SimulaEditor.
	 */
	final private Reader reader;

	/**
	 * The ProgramModule.
	 */
	private ProgramModule programModule;
	
	/**
	 * The output .jar file
	 */
	private File outputJarFile;

	/**
	 * Create a new SimulaCompiler.
	 * 
	 * @param inputFileName the source file name
	 */
	public SimulaCompiler(final String inputFileName) {
		this(inputFileName, null);
	}

	/**
	 * Create a new SimulaCompiler.
	 * 
	 * @param inputFileName the source file name
	 * @param reader        Reader in case of SimulaEditor
	 */
	public SimulaCompiler(final String inputFileName, Reader reader) {
		Global.initiate();
		if (reader == null) {
			try {
//				reader = new InputStreamReader(new FileInputStream(inputFileName), Global._CHARSET);
				File file = new File(inputFileName);
				reader = new InputStreamReader(new FileInputStream(file), Global._CHARSET);
			} catch (IOException e) {
				Util.error("can't open " + inputFileName + ", reason: " + e);
			}
		}
		this.reader = reader;
		if (!inputFileName.toLowerCase().endsWith(".sim"))
			Util.warning("Simula source file should, by convention be extended by .sim: " + inputFileName);

		File inputFile = new File(inputFileName);

		// Create Output File Path
//		String name = inputFile.getName();
//		Global.sourceFileName = name;
//		int p=name.lastIndexOf(".");
//		if(p > 0)
//			Global.sourceName = name.substring(0, p);
		Global.sourceFileName = inputFile.getName();
		Global.sourceName = Util.getSimpleName(inputFile.getName());
		Global.sourceFileDir = inputFile.getParentFile();

		if (Option.internal.TRACING)
			Util.println("Compiling: \"" + inputFileName + "\"");

		if (Global.outputDir == null) {
			Global.trySetOutputDir(new File(Global.sourceFileDir, "bin"));
		}

		// Get Temp Directory:
		Global.simulaTempDir = Global.getTempFileDir("simula/");
		deleteTempFiles(Global.simulaTempDir);

		// Create Temp .java-Files Directory:
		File javatmp = Option.internal.keepJava;
		if (javatmp == null)
			javatmp = Global.simulaTempDir;
		File tmpJavaDir = new File(javatmp, "src/" + Global.packetName);
		tmpJavaDir.mkdirs();
		Global.tempJavaFileDir = tmpJavaDir;

		// Create Temp .class-Files Directory:
		File tmpClassDir = new File(Global.simulaTempDir, "classes");
		tmpClassDir.mkdirs();
		Global.tempClassFileDir = tmpClassDir;

		File desktop = new File(System.getProperty("user.home"), "Desktop");
		if (Option.verbose) {
			// https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
			Util.println("------------  ENVIRONMENT SUMMARY  ------------");
			Util.println("Simula Properties    " + Global.simulaPropertiesFile);
			Util.println("Simula Home          " + Global.simulaHome);
			Util.println("Simula Home (prev)   " + Global.getSimulaProperty("simula.home", null));
			Util.println("Java Home            " + System.getProperty("java.home"));
			Util.println("User Home            " + System.getProperty("user.home"));
			String s = (desktop.exists()) ? "true " : "false";
			Util.println("Desktop Exists=" + s + " " + desktop.toString());
			Util.println("Java Class Path      " + System.getProperty("java.class.path"));
			Util.println("Java Class Version   " + System.getProperty("java.class.version"));
			Util.println("Java Version         " + System.getProperty("java.version"));
			Util.println("Java VM Spec Version " + System.getProperty("java.vm.specification.version"));
			Util.println("Java Vendor          " + System.getProperty("java.vendor"));
			Util.println("OS name              " + System.getProperty("os.name"));
			Util.println("OS architecture      " + System.getProperty("os.arch"));
			Util.println("OS version           " + System.getProperty("os.version"));
			Util.println("32/64 bit JVM        " + System.getProperty("sun.arch.data.model"));
			Util.println("file.encoding        " + System.getProperty("file.encoding"));
			Util.println("defaultCharset       " + Charset.defaultCharset());

			// This will list the current system properties
			// System.getProperties().list(System.out);

		}
	}

	/**
	 * List temp class file directory tree
	 * @param dir tempClassFileDir
	 */
	private void list(final File dir) {
		try {
			Util.println("------------ BEGIN LIST tempClassFileDir: " + dir + "  ------------");
			list("", dir);
			Util.println("------------ ENDOF LIST tempClassFileDir: " + dir + "  ------------");
		} catch (Exception e) {
			Util.IERR("SimulaCompiler.listFiles FAILED: ", e);
			e.printStackTrace();
		}
	}

	/**
	 * List a directory tree.
	 * @param indent the indentation
	 * @param dir the directory
	 */
	private void list(String indent, final File dir) {
		try {
			File[] elt = dir.listFiles();
			if (elt == null || elt.length == 0) {
				Util.println("Empty Directory: " + dir);
				return;
			}
			for (File f : elt) {
				Util.println(indent + "- " + f);
				if (f.isDirectory())
					list(indent + "   ", f);
			}
		} catch (Exception e) {
			Util.IERR("SimulaCompiler.listFiles FAILED: ", e);
			e.printStackTrace();
		}
	}

	/**
	 * Delete temporary .class files.
	 * @param dir temporary .class directory
	 */
	private void deleteTempFiles(final File dir) {
		try {
			File[] elt = dir.listFiles();
			if (elt == null)
				return;
			for (File f : elt) {
				if (Option.internal.DEBUGGING) {
					if (f.isFile())
						Util.println("Delete: " + f);
				}
				if (f.isDirectory())
					deleteTempFiles(f);
				f.delete();
			}
		} catch (Exception e) {
			Util.IERR("SimulaCompiler.deleteFiles FAILED: ", e);
			e.printStackTrace();
		}
	}

	/**
	 * Do Compile
	 * @throws IOException when it fails
	 */
	public void doCompile() throws IOException {
//		try {
			Util.nError = 0;
			if (!Util.isJavaIdentifier(Global.sourceName)) {
				String sourceName = Global.sourceName;
				Global.sourceName = Util.makeJavaIdentifier(sourceName);
				Util.warning("The source file name '" + sourceName + "' is not a legal class identifier. Modified to: "
						+ Global.sourceName);
			}
			
       		if(Option.compilerMode != Option.CompilerMode.simulaClassLoader) {
    			Global.jarFileBuilder = new JarFileBuilder();
    		}
			
			// ***************************************************************
			// *** Scanning and Parsing
			// ***************************************************************
			Global.generatedJavaClass = new Vector<GeneratedJavaClass>();
			Parse.initiate(reader);
			programModule = new ProgramModule();
			Global.programModule = programModule;
			if (Option.internal.TRACING) {
				Util.println("END Parsing, resulting Program: \"" + programModule + "\"");
				if (Option.internal.TRACE_PARSE && programModule != null)
					programModule.print(0);
			}
			Parse.close();
			Global.duringParsing = false;
			if(Option.internal.PRINT_SYNTAX_TREE > 1) {
				System.out.println("\nSimulaCompiler.doCompile: =========== Resulting Syntax Tree after Parsing ================");
				programModule.printTree(1,this);
			}
			if (Util.nError > 0) {
				String msg="Compiler terminate " + Global.sourceName + " after " + Util.nError + " errors during parsing";
				Util.println(msg);
				throw new RuntimeException(msg);
			}
			
			// ***************************************************************
			// *** Generate .java files or ClassFileBuilder -> jarFile
			// ***************************************************************
//			System.out.println("SimulaCompiler.doCompile: Option.compilerMode="+Option.compilerMode);
	   		if(Option.compilerMode == Option.CompilerMode.simulaClassLoader) {
				if (!programModule.isExecutable()) {
					// Separate Compilation
					Global.jarFileBuilder = new JarFileBuilder();
					Global.jarFileBuilder.open(programModule);
				} else {
					Global.simulaClassLoader = new SimulaClassLoader();
					if(! Option.internal.INLINE_TESTING)
						JarFileBuilder.loadRuntimeSystem();
					JarFileBuilder.loadIncludeQueue();
				}
			} else {
				Global.jarFileBuilder.open(programModule);
				Global.jarFileBuilder.addIncludeQueue();
			}
			
			if (Option.internal.TRACING)
				Util.println("BEGIN Possible Generate AttributeFile");
			
			// ***************************************************************
			// *** Semantic Checker
			// ***************************************************************
			if (Option.internal.TRACING)
				Util.println("BEGIN Semantic Checker");
			Global.duringChecking = true;
			programModule.doChecking();
			if (Option.internal.TRACING) {
				Util.println("END Semantic Checker: \"" + programModule + "\"");
				if (Option.internal.TRACE_CHECKER_OUTPUT && programModule != null)
					programModule.print(0);
			}
			Global.duringChecking = false;
			if(Option.internal.PRINT_SYNTAX_TREE > 0) {
				System.out.println("\nSimulaCompiler.doCompile: =========== Resulting Syntax Tree after Checking ================");
				programModule.printTree(1,this);
			}
			
			if (Util.nError > 0) {
				String msg="Compiler terminate " + Global.sourceName + " after " + Util.nError + " errors during semantic checking";
				Util.println(msg);
				Thread.dumpStack();
				throw new RuntimeException(msg);
			}
			
			if (Option.compilerMode != Option.CompilerMode.viaJavaSource) {
				if (Option.internal.TRACING)
					Util.println("BEGIN Generate .class Output Code");
				// *** Generate .class files
				programModule.createJavaClassFile();
			} else {
				if (Option.internal.TRACING)
					Util.println("BEGIN Generate .java Output Code");
				// *** Generate .java intermediate code
				programModule.doJavaCoding();
				if (Option.internal.TRACING) {
					Util.println("END Generate .java Output Code");
					for (GeneratedJavaClass javaClass : Global.generatedJavaClass)
						Util.println(javaClass.javaOutputFile.toString());
				}
			}
			if (Util.nError > 0) {
				String msg="Compiler terminate " + Global.sourceName + " after " + Util.nError + " errors during code generation";
				Util.println(msg);
				throw new RuntimeException(msg);
			}

			if(Option.compilerMode == Option.CompilerMode.viaJavaSource) {
				// ***************************************************************
				// *** CALL JAVA COMPILER
				// *** POSSIBLE -- DO BYTE_CODE_ENGINEERING
				// *** POSSIBLE - LIST GENERATED .class FILES
				// ***************************************************************
				doCallJavaCompiler();
				doByteCodeEngineering();
				if(Option.internal.LIST_GENERATED_CLASS_FILES)
					listGeneratedClassFiles();
			}
			AttributeFileIO.writeAttributeFile(programModule);

			// ***************************************************************
			// *** CRERATE .jar FILE INLINE
			// ***************************************************************
			String jarFile = null;
       		if(Option.compilerMode == Option.CompilerMode.simulaClassLoader) {
    			if(Global.jarFileBuilder != null) {
    				if(Option.compilerMode == Option.CompilerMode.viaJavaSource) {
    					Global.jarFileBuilder.addTempClassFiles();
    				}
    				outputJarFile = Global.jarFileBuilder.close();
    				jarFile = outputJarFile.toString(); 				
    			}
    		} else {
				if(Option.compilerMode == Option.CompilerMode.viaJavaSource) {
					Global.jarFileBuilder.addTempClassFiles();
				}
				outputJarFile = Global.jarFileBuilder.close();
				jarFile = outputJarFile.toString();
    		}
    		
			if (Option.verbose) printSummary();

			// ***************************************************************
			// *** EXECUTE .jar FILE
			// ***************************************************************
			Vector<String> cmds = new Vector<String>();
			cmds.add("java");
			cmds.add("--enable-preview"); // TODO: Change when ClassFile API is released
       		if(Option.compilerMode != Option.CompilerMode.simulaClassLoader) {
    			cmds.add("-jar");
    			cmds.add(jarFile);
    		}
			if (Option.internal.RUNTIME_USER_DIR.length() > 0) {
				cmds.add("-userDir");
				cmds.add(Option.internal.RUNTIME_USER_DIR);
			} else {
				cmds.add("-userDir");
				cmds.add(Global.outputDir.getParentFile().getAbsolutePath());
			}
			RTOption.addRTArguments(cmds);
			if (Option.internal.SOURCE_FILE.length() > 0) {
				cmds.add(Option.internal.SOURCE_FILE);
			}
       		if(Option.compilerMode == Option.CompilerMode.simulaClassLoader) {
    			if(Global.simulaClassLoader != null) {
    				String name = Global.packetName + '.' + programModule.getIdentifier();
//    				System.out.println(""+name);
    				Global.simulaClassLoader.runClass(name, cmds);
//    				Util.IERR();
    			} else {
    				if(Global.jarFileBuilder != null) {
    	    			doExecuteJarFile(jarFile,cmds);    					
    				} else
    				Util.IERR();
    			}
    		} else {
    			doExecuteJarFile(jarFile,cmds);
    		}
			
			
			if (Option.internal.DEBUGGING)
				Util.println("------------  CLEANING UP TEMP FILES  ------------");
			deleteTempFiles(Global.simulaTempDir);

//		} catch (IOException e) {
//			Util.IERR("Compiler Error: ", e);
//		}
	}


	// ***************************************************************
	// *** EXECUTE .jar FILE
	// ***************************************************************
	private void doExecuteJarFile(String jarFile,Vector<String> cmds) throws IOException {
	if (!programModule.isExecutable()) {
		if (Option.internal.TRACING)
			Util.println("Separate Compilation - No Execution of .jar File: " + jarFile);
	} else if (Option.noExecution) {
		if (Option.internal.TRACING)
			Util.println("Option 'noexec' ==> No Execution of .jar File: " + jarFile);
	} else {
		if (Option.verbose)
			Util.println("------------  EXECUTION SUMMARY  ------------");
		if (Option.internal.TRACING)
			Util.println("Execute .jar File");
		int exitValue3 = Util.execute(cmds);
		if (Option.verbose)
			Util.println("END Execute .jar File. Exit value=" + exitValue3);
		if(exitValue3 != 0) {
			System.out.println("SimulaCompiler.doCompile: Exit value = " + exitValue3);
			throw new RuntimeException("Execution of "+jarFile+" failed. ExitValue = "+exitValue3);
		}
	}
	}

	// ***************************************************************
	// *** CALL JAVA COMPILER
	// ***************************************************************
	private void doCallJavaCompiler() throws IOException {
		String classPath = Global.simulaRtsLib.toString();

		if (Option.verbose)
			fileSummary();
		if (Option.internal.DEBUGGING) {
			Util.println("------------  CLASSPATH DETAILS  ------------");
			Util.println("Java PathSeparator " + System.getProperty("path.separator"));
			Util.println("Java ClassPath     " + System.getProperty("java.class.path"));
		}

		File rtsLib = new File(Global.simulaRtsLib, "simula/runtime");
		boolean rtsExist = rtsLib.exists();
		boolean rtsCread = rtsLib.canRead();
		if (!(rtsExist && rtsCread)) {
			Util.popUpError("Unable to access the Runtime System at:" + "\n" + rtsLib
					+ "\nCheck the installation and consider" + "\nto Download it again.\n");
		}
		if (Option.internal.DEBUGGING) {
			Util.println(
					"Simula Runtime System:    \"" + rtsLib + "\", exists=" + rtsExist + ", canRead=" + rtsCread);
			String[] list = rtsLib.list();
			if (list != null) {
				Util.println("Simula Runtime System:    \"" + rtsLib + "\", exists=" + rtsExist + ", canRead="
						+ rtsCread + ", size=" + list.length);
				for (int i = 0; i < list.length; i++) {
					Util.println("       " + i + ": \"" + list[i] + "\"");
				}
			}
		}
		String pathSeparator = System.getProperty("path.separator");
		for (File jarFile : Global.externalJarFiles) {
			if (Option.internal.DEBUGGING) {
				boolean exist = jarFile.exists();
				boolean cread = jarFile.canRead();
				Util.println(
						"Precompiled Library:      \"" + jarFile + "\", exists=" + exist + ", canRead=" + cread);
				JarFileBuilder.listJarFile(jarFile);
			}
			classPath = classPath + pathSeparator + (jarFile.toString().trim());
		}
		int exitValue = -1;
		String msg = "Commandline";
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		if (compiler != null) {
			exitValue = callJavaSystemCompiler(compiler, classPath);
			msg = "System";
			if (exitValue != 0) {
				Util.error("Java " + msg + " Compiler returns exit=" + exitValue + "\n");
				msg = "Commandline"; // Try use CommandLine Compiler
				exitValue = callJavacCompiler(classPath);
			}
		} else
			exitValue = callJavacCompiler(classPath);
		if (Option.internal.DEBUGGING) {
			Util.println("Java " + msg + " Compiler returns exit=" + exitValue + "\n");
			for (GeneratedJavaClass javaClass : Global.generatedJavaClass)
				Util.println(javaClass.getClassOutputFileName());
			list(Global.tempClassFileDir);
		}
		if (exitValue != 0) {
			Util.error("Java " + msg + " Compiler returns exit=" + exitValue + "\n");
			Util.println("\nCompiler terminated after error(s) during Java Compilation");
			return;
		}
	}

	// ***************************************************************
	// *** CALL JAVA SYSTEM COMPILER
	// ***************************************************************
	/**
	 * Call Java system compiler
	 * @param compiler the Java compiler
	 * @param classPath the classPath
	 * @return return value from the Java compiler
	 * @throws IOException if something went wrong
	 */
	private int callJavaSystemCompiler(final JavaCompiler compiler, final String classPath) throws IOException {
		Vector<String> arguments = new Vector<String>();
		
		arguments.add("--release"); arguments.add("23"); // TODO: Change when ClassFile API is released
		arguments.add("--enable-preview");               // TODO: Change when ClassFile API is released

		if (Option.internal.DEBUGGING) {
			arguments.add("-version");
		}
		if (Option.internal.TRACING)
			Util.println("SimulaCompiler.callJavaSystemCompiler: classPath=\"" + classPath + "\"");
		arguments.add("-classpath");
		arguments.add(classPath);
		arguments.add("-d");
		arguments.add(Global.tempClassFileDir.toString()); // Specifies output directory.
		if (!Option.WARNINGS)
			arguments.add("-nowarn");
		for (GeneratedJavaClass javaClass : Global.generatedJavaClass)
			arguments.add(javaClass.javaOutputFile.toString()); // Add .java Files
		int nArg = arguments.size();
		String[] args = new String[nArg];
		arguments.toArray(args);

		InputStream in = System.in;
		OutputStream out = System.out;
		OutputStream err = System.err;
		if (Global.console != null) {
			out = Global.console.getOutputStream();
			err = Global.console.getErrorStream();
		}
		if (Option.internal.DEBUGGING) {
			Util.println("------------  Call Java System Compiler  ------------");
			Util.println("System Compiler supports " + compiler.getSourceVersions());
			for (int i = 0; i < args.length; i++)
				Util.println("Compiler'args[" + i + "]=" + args[i]);
		}
		int exitValue = compiler.run(in, out, err, args);
		return (exitValue);
	}

	// ***************************************************************************
	// *** CALL JAVA COMMAND LINE COMPILER
	//
	// https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javac.html
	// https://docs.oracle.com/javase/10/tools/tools-and-command-reference.htm
	// ***************************************************************************
	/**
	 * Call Java command line compiler.
	 * @param classPath the classPath
	 * @return return value from the Java compiler
	 * @throws IOException if something went wrong
	 */
	private int callJavacCompiler(final String classPath) throws IOException {
		Vector<String> cmds = new Vector<String>();
		cmds.add("javac");
		
		cmds.add("--release"); cmds.add("23"); // TODO: Change when ClassFile API is released
		cmds.add("--enable-preview");          // TODO: Change when ClassFile API is released

		if (Option.internal.DEBUGGING) {
			cmds.add("-version");
		}
		if (Option.internal.TRACING)
			Util.println("SimulaCompiler.callJavacCompiler: classPath=\"" + classPath + "\"");
		cmds.add("-classpath");
		cmds.add(classPath);
		cmds.add("-d");
		cmds.add(Global.tempClassFileDir.toString()); // Specifies output directory.
		if (!Option.WARNINGS)
			cmds.add("-nowarn");
		for (GeneratedJavaClass javaClass : Global.generatedJavaClass) {
			cmds.add(javaClass.javaOutputFile.toString()); // Add .java Files
		}
		int exitValue = Util.execute(cmds);
		if (Option.internal.TRACING) {
			Util.println("END Generate .class Output Code. Exit value=" + exitValue);
			for (GeneratedJavaClass javaClass : Global.generatedJavaClass)
				Util.println(javaClass.getClassOutputFileName());
		}
		return (exitValue);
	}
	
	// ***************************************************************
	// *** POSSIBLE -- DO BYTE_CODE_ENGINEERING
	// ***************************************************************
	private void doByteCodeEngineering() throws IOException {
		if (Option.internal.keepJava == null) {
			if (Option.internal.TRACE_BYTECODE_OUTPUT) {
				Util.println("------------  LIST ByteCode Before Engineering  ------------");
				for (GeneratedJavaClass javaClass : Global.generatedJavaClass) {
					String classFile = javaClass.getClassOutputFileName();
					Util.doListClassFile(classFile);
				}
			}
			for (GeneratedJavaClass javaClass : Global.generatedJavaClass) {
				if (javaClass.mustDoByteCodeEngineering) {
					String classFileName = javaClass.getClassOutputFileName();
					ClassFileTransform.doRepairSingleByteCode(classFileName,classFileName);
				}
			}
			if (Option.internal.TRACE_BYTECODE_OUTPUT) {
				Util.println("------------  LIST ByteCode After Engineering  ------------");
				for (GeneratedJavaClass javaClass : Global.generatedJavaClass) {
					String classFile = javaClass.getClassOutputFileName();
					Util.doListClassFile(classFile);
				}
			}
		} else {
			Util.warning("Option.internal.keepJava set: No ByteCode Engineering is performed");
		}
	}

	// ***************************************************************
	// *** LIST GENERATED .class FILES
	// ***************************************************************
	private void listGeneratedClassFiles() {
		File classFiles = new File(Global.tempClassFileDir, Global.packetName);
		for (File classFile : classFiles.listFiles()) {
			if(classFile.getName().endsWith(".class"))
				Util.doListClassFile("" + classFile); // List generated .class file
//			UUtil.analyse("" + classFile);
		}
//		File xFile = new File("C:/GitHub/SimulaCompiler2/CompilerTests/bin/SimulaTestPrograms","adHocXX.class");
//		Util.doListClassFile(""+xFile); // List explicit .class file
	}


	// ***************************************************************
	// *** FILE SUMMARY
	// ***************************************************************
	/**
	 * File Summary
	 */
	private void fileSummary() {
		Util.println("------------  FILE SUMMARY  ------------");
		Util.println("Package Name:    \"" + Global.packetName + "\"");
		Util.println("SourceFile Name: \"" + Global.sourceName + "\"");
		Util.println("SourceFile Dir:  \"" + Global.sourceFileDir.getAbsolutePath() + "\"");
		if (Global.currentWorkspace != null)
			Util.println("CurrentWorkspace \"" + Global.currentWorkspace.getAbsolutePath() + "\"");
		Util.println("TempDir .java:   \"" + Global.tempJavaFileDir.getAbsolutePath() + "\"");
		Util.println("TempDir .class:  \"" + Global.tempClassFileDir.getAbsolutePath() + "\"");
		Util.println("SimulaRtsLib:    \"" + Global.simulaRtsLib.getAbsolutePath() + "\"");
		Util.println("OutputDir:       \"" + Global.outputDir.getAbsolutePath() + "\"");
	}

	// ***************************************************************
	// *** PRINT SUMMARY
	// ***************************************************************
	/**
	 * Print summary at program end.
	 */
	private void printSummary() {
		Util.println("------------  COMPILATION SUMMARY  ------------");
		Util.println("Compiler Mode:   \"" + Option.compilerMode + "\"");
		if (!programModule.isExecutable()) {
			Util.println("Separate Compiled " + ObjectKind.edit(programModule.mainModule.declarationKind)
			                   + " " + programModule  + " is written to: \"" + outputJarFile + "\"");
			Util.println("Rel Attr.File:   \"" + programModule.getRelativeAttributeFileName() + "\"");
		} else {
    		if(outputJarFile != null) {
    			Util.println("Resulting File:  \"" + outputJarFile.getAbsolutePath() + "\"");
    			Util.println("Main Entry:      \"" + Global.jarFileBuilder.mainEntry + "\"");
    		} else {
    			Util.println("No executable jar-file is generated");    			
    		}
		}
//		if(outputJarFile != null) {
//			JarFileBuilder.listJarFile(outputJarFile);
//		}
	}

}
