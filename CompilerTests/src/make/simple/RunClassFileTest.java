/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package make.simple;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import simula.compiler.Simula;
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
public final class RunClassFileTest {

	public static void main(String[] args) {
		
		// Set options.
		Option.verbose=true;
//		Option.EXTENSIONS=false;
//		Option.CaseSensitive=true;
//		Option.noExecution=true;
		Option.WARNINGS=false;
//		Simula.setSelectors("ZDTW");
		Simula.setSelectors("ZD");

		// Set internal test, debug options.
		Option.internal.INLINE_TESTING=true;
		Option.internal.TESTING_STACK_SIZE = true;
//		Option.internal.USE_SimulaClassLoader = true;
//		Option.internal.CREATE_JAVA_SOURCE = true;
		Option.internal.SPORT=true;
//		Option.internal.DEBUGGING=true;
//		Option.internal.LIST_GENERATED_CLASS_FILES=true;

		// Overall TRACING Options
//		Option.internal.TRACING=true;
//		Option.internal.DEBUGGING=true;
//
//		// Scanner Trace Options
//		Option.internal.TRACE_SCAN=true;
//		Option.internal.TRACE_COMMENTS=true;
//
//		// Parser Trace Options
//		Option.internal.TRACE_PARSE=true;
//		Option.internal.PRINT_SYNTAX_TREE=true;
//		Option.internal.TRACE_ATTRIBUTE_OUTPUT=true;
//		Option.internal.TRACE_ATTRIBUTE_INPUT=true;
//
//		// Checker Trace Options
//		Option.internal.TRACE_CHECKER=true;
//		Option.internal.TRACE_CHECKER_OUTPUT=true;
//		Option.internal.TRACE_FIND_MEANING=2;

//		File simulaHome=new File("C:/GitHub/SimulaCompiler2/TestBatch");
		File simulaDir=new File("C:/GitHub/SimulaCompiler2/Simula");
		File userDir=new File("C:/GitHub/SimulaCompiler2/CompilerTests");
		
		
		Global.packetName="simulaTestPrograms";
//		Option.internal.keepJava=userDir; // Generated .java Source is then found in Eclipse Package simulaTestPrograms
		Global.simulaRtsLib=new File(simulaDir,"bin"); // To use Eclipse Project's simula.runtime
//		Option.outputDir=new File("C:/GitHub/SimulaCompiler2/Simula/src/simulaTestPrograms/samples/simula/bin");
//		Global.outputDir=new File("C:/GitHub/SimulaCompiler2/TestBatch/src/simulaTestPrograms/samples/simula/bin");
		Global.outputDir=new File("C:/GitHub/SimulaCompiler2/CompilerTests/bin/simulaTestPrograms");
		
		
		// Set RunTime Options and tracing.
		RTOption.VERBOSE = true;
//		RTOption.USE_CONSOLE=true;
//		RTOption.BLOCK_TRACING = true;
//		RTOption.GOTO_TRACING = true;
//		RTOption.QPS_TRACING = true;
//		RTOption.SML_TRACING = true;

		String sourceDir=userDir+"/src/"+Global.packetName;
//		String fileName=userDir+"/src/"+Global.packetName + name;
//		Option.internal.RUNTIME_USER_DIR=new File(fileName).getParent();


		Vector<String> names=new Vector<String>();
		

//		names.add("/simple/COMMON.sim");
//		names.add("/simple/ERRMSG.sim");
//		names.add("/simple/SCANNER.sim");
//		names.add("/FECTest/fecTest.sim");

		// *** SMÅ ENKLE SIMULA TEST PROGRAMMER
	// names.add("/simple/adHoc40b.sim");
	// names.add("/simple/adHoc40a.sim");
//	// names.add("/simple/adHoc40c.sim");
	// names.add("/simple/adHoc40.sim");

		
		// names.add("/simple/AdHoc_SimulaTest.sim");

		// names.add("/simple/p41.sim");
		// names.add("/simple/adErr09.sim");
//		 names.add("/simple/adHoc000.sim");
		 names.add("/simple/adHoc001.sim");
//		 names.add("/simple/adHoc00.sim");
//		 names.add("/simple/adHoc01.sim");
//		 names.add("/simple/adHoc02.sim");
//		 names.add("/simple/adHoc03.sim");
//		 names.add("/simple/adHoc30a.sim");
//		 names.add("/simple/adHoc04.sim");
//		
//		 names.add("/simple/adHoc05.sim");
//		 names.add("/simple/adHoc06.sim");
//		 
//		 names.add("/simple/adHoc07.sim");
//		 names.add("/simple/adHoc08.sim");
//		 names.add("/simple/adHoc09.sim");
//		 names.add("/simple/adHoc10.sim");
//		 names.add("/simple/adHoc11.sim");
//		 names.add("/simple/adHoc12.sim");
//		 names.add("/simple/adHoc13.sim");
//		 names.add("/simple/adHoc14.sim");
		
		// names.add("/simple/adHocX01-NEW.sim");
		// names.add("/simple/adHocX01.sim");
		// names.add("/simple/adHocX02.sim");
		 
		// names.add("/simple/adHoc26.sim");
		// names.add("/simple/adHoc31.sim");
		// names.add("/simple/adHoc51.sim");
		// names.add("/simple/adHoc54.sim");
		// names.add("/simple/adHoc58.sim");
		// names.add("/simple/adHoc66.sim");
		// names.add("/simple/adHoc67.sim");
		// names.add("/simple/adHoc68.sim");
//		 names.add("/simple/adHoc85.sim");
//		 names.add("/simple/adHocSeparat.sim");
//		 names.add("/simple/adHoc86.sim");
//		 names.add("/simple/adHoc98.sim");
//		names.add("/simple/adHoc102.sim");
//		 names.add("/simple/adHoc122.sim");
//		 names.add("/simple/adHoc131.sim");
	    // names.add("/simple/ArrayAsParameter.sim");
		// names.add("/simple/Assignments.sim");
		// names.add("/simple/Blocks.sim");
		// names.add("/simple/ClassGlyph.sim");
		// names.add("/simple/ClockTimeTest.sim");
		// names.add("/simple/CommentSamples.sim");
		// names.add("/simple/ConcatSample.sim");
		// names.add("/simple/DecimalEdit.sim"); 
		// names.add("/simple/Detachable.sim"); 
		// names.add("/simple/DetachSamples.sim"); 
		// names.add("/simple/DrawingTest.sim");
		// names.add("/simple/Editing.sim");
		// names.add("/simple/Expressions.sim");
		// names.add("/simple/ForWhileSamples.sim");
		// names.add("/simple/ForWhileSamples2.sim");
		// names.add("/simple/FunctionCall.sim");
		// names.add("/simple/Gauss.sim");
		// names.add("/simple/HashingExample.sim");
		// names.add("/simple/HelloWorld.sim");
		// names.add("/simple/InfileSample.sim");
		// names.add("/simple/InspectionSamples.sim");  
		// names.add("/simple/LocalObject.sim");
		// names.add("/simple/ParamSample.sim");
		// names.add("/simple/PrfxBlockSamples.sim");
		// names.add("/simple/PrintFile.sim");
		// names.add("/simple/PriorProcedure.sim");   // ????
		// names.add("/simple/ProcedureSample.sim");
		// names.add("/simple/PromptSample.sim");
		// names.add("/simple/RemoteProcedure.sim");
		// names.add("/simple/SubClassTest.sim");
		// names.add("/simple/TextSamples.sim");
		// names.add("/simple/TextSamples1.sim");
		// names.add("/simple/VariableByName.sim");

		 
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
