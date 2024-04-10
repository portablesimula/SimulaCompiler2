/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package make.classFile;

import java.io.File;
import java.util.Vector;

import simula.compiler.SimulaCompiler;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Option;
import simula.editor.RTOption;

/**
 * Simula Test Batch donated by Simula as.
 * 
 * @author Several from Norwegian Computing Center.
 * @author Several from Simula as.
 * @author Øystein Myhre Andersen
 *
 */
public final class RunNewAttrTest {
	private static final File simulaDir=new File("C:/GitHub/SimulaCompiler2/Simula");
	private static final File userDir=new File("C:/GitHub/SimulaCompiler2/SimulaTestBatch");
	private static final String sourceDir = userDir+"/src/simulaTestBatch/";
	private static final String testBatchJarDir = userDir+"/src/simulaTestBatch/bin/";

	public static void main(String[] args) {
		// Set options and tracing.
		Option.INLINE_TESTING=true;
//		Option.CREATE_JAVA_SOURCE = true;
		Option.TESTING_STACK_SIZE = true;
//		Option.LIST_GENERATED_CLASS_FILES=true;
		Option.SPORT=true;
		Option.verbose = true;
		Option.WARNINGS=true;
//		Option.DEBUGGING=true;
//		Option.EXTENSIONS=false;
//		Option.CaseSensitive=true;

		// Overall TRACING Options
//		Option.TRACING=true;

		// Scanner Trace Options
//		Option.TRACE_SCAN=true;
//		Option.TRACE_COMMENTS=true;

		// Parser Trace Options
//		Option.TRACE_PARSE=true;
		Option.PRINT_SYNTAX_TREE=true;
		Option.TRACE_ATTRIBUTE_OUTPUT=true;
		Option.TRACE_ATTRIBUTE_INPUT=true;

		// Checker Trace Options
//		Option.TRACE_FIND_MEANING=1;
//		Option.TRACE_CHECKER=true;
//		Option.TRACE_CHECKER_OUTPUT=true;

		// Coder Trace Options
//		Option.TRACE_CODING=true;
		Option.GNERATE_LINE_CALLS=true;
//		Option.GNERATE_SNAPSHOTS=true;

		// Byte code engineering Options
//		Option.LIST_INPUT_INSTRUCTION_LIST=true;
//		Option.LIST_REPAIRED_INSTRUCTION_LIST=true;
//		Option.TRACE_REPAIRING_INPUT=true;
//		Option.TRACE_REPAIRING=true;
//		Option.TRACE_REPAIRING_OUTPUT=true;

		Global.packetName="simulaTestBatch";
//		Option.keepJava=userDir; // Generated .java Source is then found in Eclipse Package simulaTestBatch
		Global.simulaRtsLib=new File(simulaDir,"bin"); // To use Eclipse Project's simula.runtime
//		Global.extLib="C:/GitHub/SimulaCompiler2/Simula/src/simulaTestBatch/sim/bin";
		
		// Set RunTime Options and tracing.
		RTOption.VERBOSE = true;
//		RTOption.USE_CONSOLE=true;
//		RTOption.BLOCK_TRACING = true;
//		RTOption.GOTO_TRACING = true;
//		RTOption.QPS_TRACING = true;
//		RTOption.SML_TRACING = true;
//		Option.RUNTIME_USER_DIR = "C:/GitHub/SimulaCompiler2/TestBatch/";
    	//System.setProperty("file.encoding","UTF-8");
		Vector<String> names=new Vector<String>();
		names.add("AdHoc_SimulaTest.sim"); // Simula TestBatch Framework
		names.add("adHoc00.sim"); // For ad'hoc testing
		names.add("adHoc01.sim"); // For ad'hoc testing
		
		
		for(String name:names) {
			String fileName = sourceDir+name;
//			Option.RUNTIME_USER_DIR=new File(fileName).getParent();
			try { SimulaCompiler compiler = new SimulaCompiler(fileName);
				  compiler.doCompile();
			}
			catch(Throwable t) { System.err.println("ERROR: "+t.getMessage()); t.printStackTrace(); }
		}
	}

}
