/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package make.precompTesting;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import simula.compiler.SimulaCompiler;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;
import simula.editor.RTOption;

/**
 * Run inline compiler tests.
 * @author Øystein Myhre Andersen
 *
 */
public final class RunCompilerTest {

	public static void main(String[] args) {
    	//System.setProperty("file.encoding","UTF-8");

		// Set Compiler Options.
		Option.verbose=true;
//		Option.EXTENSIONS=false;
//		Option.CaseSensitive=true;
//		Option.noExecution=true;
		Option.WARNINGS=false;
//		Option.internal.LIST_GENERATED_CLASS_FILES=true;

		// Set internal test, debug options.
		Option.internal.INLINE_TESTING=true;
		Option.internal.TESTING_STACK_SIZE = true;
		Option.internal.CREATE_JAVA_SOURCE = true;
		Option.internal.SPORT=true;
//		Option.internal.TRACING=false;
//		Option.internal.TRACE_ATTRIBUTE_OUTPUT=true;
//		Option.internal.TRACE_ATTRIBUTE_INPUT=true;

		// Overall TRACING Options
//		Option.internal.TRACING=true;
//		Option.internal.DEBUGGING=true;
//
//		// Scanner Trace Options
//		Option.TRACE_SCAN=true;
//		Option.TRACE_COMMENTS=true;
//
//		// Parser Trace Options
//		Option.internal.TRACE_PARSE=true;
		Option.internal.PRINT_SYNTAX_TREE=true;
//		Option.TRACE_ATTRIBUTE_OUTPUT=true;
//		Option.TRACE_ATTRIBUTE_INPUT=true;
//
//		// Checker Trace Options
//		Option.internal.TRACE_CHECKER=true;
//		Option.internal.TRACE_CHECKER_OUTPUT=true;
//		Option.internal.TRACE_FIND_MEANING=1;
//		
//		// Coder Trace Options
//		Option.TRACE_CODING=true;
//		Option.GNERATE_LINE_CALLS=true;
//		
//		Option.internal.TRACE_REPAIRING=true;
//		Option.LIST_REPAIRED_INSTRUCTION_LIST=true;
//		Option.internal.TRACE_BYTECODE_OUTPUT=true;
//		Option.internal.DEBUGGING=true;
		
		Option.internal.TESTING_STACK_SIZE=true;

//		File simulaHome=new File("C:/GitHub/SimulaCompiler2/TestBatch");
		File simulaDir=new File("C:/GitHub/SimulaCompiler2/Simula");
		File userDir=new File("C:/GitHub/SimulaCompiler2/CompilerTests");
		
		
		Global.packetName="simulaTestPrograms";
		Option.internal.keepJava=userDir; // Generated .java Source is then found in Eclipse Package simulaTestPrograms
		Global.simulaRtsLib=new File(simulaDir,"bin"); // To use Eclipse Project's simula.runtime
//		Option.outputDir=new File("C:/GitHub/SimulaCompiler2/Simula/src/simulaTestPrograms/samples/simula/bin");
//		Global.outputDir=new File("C:/GitHub/SimulaCompiler2/TestBatch/src/simulaTestPrograms/samples/simula/bin");
		Global.outputDir=new File("C:/GitHub/SimulaCompiler2/CompilerTests/bin/simulaTestPrograms");
		
		
		// Set RunTime Options and tracing.
//		RTOption.VERBOSE = true;
//		RTOption.USE_CONSOLE=true;
//		RTOption.BLOCK_TRACING = true;
		RTOption.GOTO_TRACING = true;
//		RTOption.QPS_TRACING = true;
//		RTOption.SML_TRACING = true;

		String sourceDir=userDir+"/src/"+Global.packetName;
//		String fileName=userDir+"/src/"+Global.packetName + name;
//		Option.internal.RUNTIME_USER_DIR=new File(fileName).getParent();


		Vector<String> names=new Vector<String>();
		

//		names.add("/precompTesting/adHoc_COMMON.sim");
//		names.add("/precompTesting/adHoc_ERRMSG.sim");
		names.add("/precompTesting/adHoc_SCANNER.sim");
		names.add("/precompTesting/adHoc01.sim");
//		names.add("/precompTesting/SCANINP.sim");

		 
		 for(String name:names) {
				String fileName = sourceDir+name;
				Option.internal.RUNTIME_USER_DIR=new File(fileName).getParent();
				SimulaCompiler compiler = new SimulaCompiler(fileName);
				try { compiler.doCompile(); } catch (IOException e) { Util.IERR("Compiler Error: ", e); }
			}
		 

//		SimulaCompiler compiler = new SimulaCompiler(fileName);
//		try { compiler.doCompile(); } catch (IOException e) { Util.IERR("Compiler Error: ", e); }
	}


}
