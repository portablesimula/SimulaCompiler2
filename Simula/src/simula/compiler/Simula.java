/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package simula.compiler;

import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;

import simula.compiler.parsing.SimulaScanner;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;
import simula.editor.RTOption;
import simula.editor.SimulaEditor;

/**
 * Simula Main class containing the 'main' entry.
 * <p>
 * The Simula Compiler is normally activated through a command-line of this form:
 * <pre>
 *		java -jar releaseHome\simula.jar
 *</pre>
 * In this simple case the Simula Editor is started.
 * <h2>General Case:</h2>
 * In special rare situations you may use the general version of the command-line form:
 * <pre>
 * 		java [java-options] -jar releaseHome\simula.jar [simula-options] simula-sourceFile
 * </pre>
 * Java-options are described in the relevant Java Technical Dokumentation.
 * <p>
 * Simula-sourceFile is the file containing the Simula text to be compiled and executed.
 * <p>
 * Possible simula-options include:
 * <pre>
 *      -help                   Print this synopsis of standard options
 *      
 *      -caseSensitive          Source file is case sensitive. See next page.
 *      
 *      -noexec                 Don't execute generated .jar file
 *      
 *      -nowarn                 Generate no warnings
 *      
 *      -noextension            Disable all language extensions.
 *                              In other words, follow the Simula Standard literally
 *                              
 *      -select characters      First, all selectors are reset.
 *                              Then, for each character, the corresponding selector is set
 *                              
 *      -verbose                Output messages about what the compiler is doing
 *      
 *      -keepJava directory     Specify where to place generated .java files
 *                              Default: Temp directory which is deleted upon exit
 *                              
 *      -output directory       Specify where to place generated executable .jar file
 *                              Default: Current workspace\bin
 *                              
 *      -extLib directory       Specify where to search for precompiled classes and
 *                              procedures. If not found, output directory is also searched.
 * </pre>
 * <p>
 * Link to GitHub: <a href=
 * "https://github.com/portablesimula/SimulaCompiler/blob/master/Simula/src/simula/compiler/Simula.java"><b>Source File</b></a>.

 * @author Øystein Myhre Andersen
 *
 */
public final class Simula {
	/**
	 * Default constructor.
	 */
	private Simula(){}

	/**
	 * Print synopsis of standard options
	 */
	private static void help() {
		Util.println(Global.simulaReleaseID+" See: https://github.com/portablesimula");
		Util.println("");
		Util.println("Usage: java -jar simula.jar  [options]  sourceFile ");
		Util.println("");
		Util.println("possible options include:");
		Util.println("  -help                      Print this synopsis of standard options");
		Util.println("  -caseSensitive             Source file is case sensitive.");	
		Util.println("  -compilerMode modeString   Simula Compiler mode *) see below.");	
		Util.println("  -noexec                    Don't execute generated .jar file");
		Util.println("  -nowarn                    Generate no warnings");
		Util.println("  -noextension               Disable all language extensions");
		Util.println("                             In other words, follow the Simula Standard literally");
		Util.println("  -verbose                   Output messages about what the compiler is doing");

		Util.println("  -select characters         First, all selectors are reset.");
		Util.println("                             Then, for each character, the corresponding selector is set");
		Util.println("  -sport                     Enable all S-PORT extensions");
		
		Util.println("  -keepJava <directory>      Specify where to place generated .java files");
		Util.println("                             Default: Temp directory which is deleted upon exit");
		Util.println("  -output <directory>        Specify where to place generated executable .jar file");
		Util.println("                             Default: Same directory as source file");
		Util.println("  -extLib <directory>        Specify where to search for precompiled classes and procedures");
		Util.println("                             If not found, output directory is also searched");
		Util.println("");
		Util.println("sourceFile ::= Simula Source File");
		Util.println("");
		Util.println("modeString ::= viaJavaSource | directClassFiles | simulaClassLoader");
		Util.println("");
		Util.println("");
		Util.println("viaJavaSource");
		Util.println("   The Simula Compiler will generate Java source files and use");
		Util.println("   the Java compiler to generate JavaClass files which in turn");
		Util.println("   are collected together with the Runtime System into the");
		Util.println("   resulting executable jar-file.");
		Util.println("");
		Util.println("");
		Util.println("directClassFiles");
		Util.println("   The Simula Compiler will generate JavaClass files directly");
		Util.println("   which in turn are collected together with the Runtime System");
		Util.println("   into the resulting executable jar-file.");
		Util.println("   No Java source files are generated.");
		Util.println("");
		Util.println("");
		Util.println("simulaClassLoader");
		Util.println("   The Simula Compiler will generate ClassFile byte array and");
		Util.println("   load it directly. No intermediate files are created.");
		Util.println("");
		Util.println("   NOTE: In this mode, the editor will terminate after the first");
		Util.println("         program execution");

		System.exit(0);
	}

	/**
	 * Main entry.
	 * @param argv arguments
	 */
	public static void main(String[] argv) {
		String fileName = null;
		Option.verbose=false;
		Option.WARNINGS=false;
		Option.EXTENSIONS=true;
		Global.initSimulaProperties();
		boolean noConsole = false;

		// Parse command line arguments.
		for(int i=0;i<argv.length;i++) {
			String arg=argv[i];
			if (arg.charAt(0) == '-') { // command line option
				if (arg.equalsIgnoreCase("-help")) help();
				else if (arg.equalsIgnoreCase("-caseSensitive")) Option.CaseSensitive=true;
				else if (arg.equalsIgnoreCase("-compilerMode")) Option.setCompilerMode(argv[++i]);
				else if (arg.equalsIgnoreCase("-noexec")) Option.noExecution=true;
				else if (arg.equalsIgnoreCase("-nowarn")) Option.WARNINGS=false;
				else if (arg.equalsIgnoreCase("-noextension")) Option.EXTENSIONS=false;
				else if (arg.equalsIgnoreCase("-verbose")) Option.verbose=true;

				else if (arg.equalsIgnoreCase("-select")) setSelectors(argv[++i]);
				else if (arg.equalsIgnoreCase("-sport")) Option.internal.SPORT=true;
				
				else if (arg.equalsIgnoreCase("-keepJava")) setKeepJava(argv[++i]);
				else if (arg.equalsIgnoreCase("-output")) setOutputDir(argv[++i]);
				else if (arg.equalsIgnoreCase("-extLib")) Global.extLib=new File(argv[++i]);
				else if (arg.equalsIgnoreCase("-source")) Option.internal.SOURCE_FILE=argv[++i];
				else if (arg.equalsIgnoreCase("-runtimeUserDir")) Option.internal.RUNTIME_USER_DIR=argv[++i];

//				else if (arg.equalsIgnoreCase("-noConsole")) RTOption.USE_CONSOLE = false;
				else if (arg.equalsIgnoreCase("-noConsole")) noConsole = true;

				else if (arg.equalsIgnoreCase("--enable-preview")) ; // TODO: Change when ClassFile API is released

//				else error("Unknown option "+arg);
				else {
					System.out.println("ERROR: Unknown option " + arg);
					help();
				}
			} else if(fileName==null) fileName = arg;
			else error("multiple input files specified");
		}
		
	    if(!Option.internal.INLINE_TESTING) Global.simulaRtsLib=new File(Global.simulaHome,"rts");
	    
		if (fileName == null) {
			// *** STARTING SIMULA EDITOR ***
			Global.sampleSourceDir = new File(Global.simulaHome, "samples");
			RTOption.InitRuntimeOptions();
			Option.InitCompilerOptions();
			SimulaEditor editor = new SimulaEditor();
			editor.setVisible(true);
		} else {
			RTOption.USE_CONSOLE = ! noConsole;			
			// *** STARTING SIMULA COMPILER ***
			try {
				new SimulaCompiler(fileName).doCompile();
			} catch (IOException e) {
				Util.IERR("Compiler Error: ", e);
			}
		}
	}

	/**
	 * Utility: Print an error message on a popup panel.
	 * @param msg the error message
	 */
	private static void error(final String msg) {
		System.err.println("Simula: " + msg + "\n");
		Util.popUpError(msg);
		help();
	}

	/**
	 * Set selectors for conditional compilation.
	 * 
	 * <pre>
	 * %SELECT select-character { select-character }
	 * </pre>
	 * 
	 * @param chars select characters
	 */
	public static void setSelectors(String chars) {
		for (int i = 0; i < 255; i++)
			SimulaScanner.selector[i] = false;
		for (int j = 0; j < chars.length(); j++) {
			char c = chars.charAt(j);
			if (c != ' ' && c != '\n') {
				SimulaScanner.selector[c] = true;
			}
		}
	}

	/**
	 * Set keep .java files.
	 * <p>
	 * Option: -keepJava &lt;directory> Specify where to place generated .java files
	 * 
	 * @param dir the .java output directory-
	 */
	private static void setKeepJava(final String dir) {
		Option.internal.keepJava = new File(dir);
		Util.TRACE("KEEP_JAVA: " + Option.internal.keepJava);
	}

	/**
	 * Set output directory.
	 * <p>
	 * Option: -output &lt;directory> Specify where to place generated executable .jar file
	 * 
	 * @param dir the output directory-
	 */
	private static void setOutputDir(final String dir) {
		Global.outputDir = new File(dir);
		Util.TRACE("OUTPUT_DIR: " + Global.outputDir);
	}

}
