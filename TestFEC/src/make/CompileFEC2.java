/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package make;

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
 * Simula Test Batch donated by Simula as.
 * 
 * @author Several from Norwegian Computing Center.
 * @author Several from Simula as.
 * @author Øystein Myhre Andersen
 *
 */
public final class CompileFEC2 {
	/**
	 * Default Constructor.
	 */
	CompileFEC2(){}
	
	// The following files are created when Simuletta front-end compiling the RTS:
	//
	// See project:   C:\WorkSpaces\SimulettaFECinJava\SimulettaFEC
	//
    // - "C:\Simuletta\Attrs\BEC\simulaRTS\RTS$INTERFACE.dat"
	// - "C:/WorkSpaces/SPort-System/S_Port/src/sport/fec/RTSINIT.ini"
	// - "C:/WorkSpaces/SPort-System/S_Port/src/sport/fec/RTS-FEC-INTERFACE1.def"
    // - "C:/WorkSpaces/SPort-System/S_Port/src/sport/fec/RTS-FEC-INTERFACE2.def"
	// - "C:/WorkSpaces/SPort-System/S_Port/attrs/FEC/PREDEF.atr


	/** 
	 * Main program to execute.
	 * @param args the arguments array
	 */
	public static void main(String[] args) {
    	//System.setProperty("file.encoding","UTF-8");
		Vector<String> names=new Vector<String>();
		
//		names.add("adHoc_COMMON.sim");   // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\COMMON.jar
//		names.add("adHoc_ERRMSG.sim");   // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\ERRMSG.jar
//		names.add("adHoc_SCANNER.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCANNER.jar
//		names.add("adHoc_SCANINP.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCANINP.jar 
//		names.add("adHoc_PARSER.sim");   // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\PARSER.jar
//		names.add("adHoc_PAS1INIT.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\PAS1INIT.jar
// ===>		names.add("adHoc_BUILDER1.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\BUILDER1.jar
//		names.add("adHoc_BUILDER2.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\BUILDER2.jar
//		names.add("adHoc_CHECKER1.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\CHECKER1.jar
//		names.add("adHoc_CHECKER2.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\CHECKER2.jar
//		names.add("adHoc_SCODER0.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER0.jar
//		names.add("adHoc_SCODER1.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER1.jar
//		names.add("adHoc_SCODER1E.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER1E.jar	
//		names.add("adHoc_SCODER2.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER2.jar
//		names.add("adHoc_SCODER3.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER3.jar
//		names.add("adHoc_SCODER4.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER4.jar
//		names.add("adHoc_PAS2INIT.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\PAS2INIT.jar 
//		names.add("adHoc_SCODMAIN.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\ERRMSG.jar
//		names.add("adHoc_FECMAIN.sim");  // WILL CREATE THE S-PORT COMPILER


		names.add("CLASS_COMMON.sim");   // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\COMMON.jar
		names.add("CLASS_ERRMSG.sim");   // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\ERRMSG.jar
		names.add("CLASS_SCANNER.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCANNER.jar
		names.add("CLASS_SCANINP.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCANINP.jar 
		names.add("CLASS_PARSER.sim");   // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\PARSER.jar
		names.add("CLASS_PAS1INIT.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\PAS1INIT.jar
		names.add("CLASS_BUILDER1.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\BUILDER1.jar
		names.add("CLASS_BUILDER2.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\BUILDER2.jar
		names.add("CLASS_CHECKER1.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\CHECKER1.jar
		names.add("CLASS_CHECKER2.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\CHECKER2.jar
		names.add("CLASS_SCODER0.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER0.jar
		names.add("CLASS_SCODER1.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER1.jar
		names.add("CLASS_SCODER1E.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER1E.jar	
		names.add("CLASS_SCODER2.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER2.jar
		names.add("CLASS_SCODER3.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER3.jar
		names.add("CLASS_SCODER4.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODER4.jar
		names.add("CLASS_PAS2INIT.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\PAS2INIT.jar 
		names.add("CLASS_SCODMAIN.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S_Port\src\sport\fec\bin\SCODMAIN.jar

//		names.add("GENMSG.sim");            // WILL GENERATE FILE MessageGenerator.sim
//		names.add("MessageGenerator.sim");  // WILL GENERATE ERROR MESSAGE FILE FECERROR.txt
		
		names.add("FECMAIN.sim");  // WILL CREATE THE S-PORT COMPILER

		// Set options and tracing.
		Option.internal.INLINE_TESTING=true;
		Option.internal.SPORT=true;
//		Option.verbose=true;
//		Option.internal.TRACING=false;
		Option.WARNINGS=false;
//		Option.compilerMode = Option.CompilerMode.viaJavaSource;
		Option.compilerMode = Option.CompilerMode.simulaClassLoader;
//		Option.internal.LIST_GENERATED_CLASS_FILES=true;
//		Option.CASE_SENSITIVE=true;
//		Option.GNERATE_LINE_CALLS=true;
//		Option.internal.PRINT_SYNTAX_TREE=3;
//		Option.internal.TRACE_ATTRIBUTE_OUTPUT=true;
//		Option.internal.TRACE_ATTRIBUTE_INPUT=true;
		
		Simula.setSelectors("ZDTW");
		Option.noExecution=false;//true;
//		Option.verbose=true;


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
//		Option.internal.PRINT_SYNTAX_TREE=1;
//		Option.internal.TRACE_ATTRIBUTE_OUTPUT=true;
//		Option.internal.TRACE_ATTRIBUTE_INPUT=true;
//
//		// Checker Trace Options
//		Option.internal.TRACE_CHECKER=true;
//		Option.internal.TRACE_CHECKER_OUTPUT=true;
//		Option.internal.TRACE_FIND_MEANING=2;

		
//		File userDir=new File("C:/GitHub/SimulaCompiler2/Simula");
		File simulaDir=new File("C:/GitHub/SimulaCompiler2/Simula");
//		File userDir=new File("C:/GitHub/SimulaCompiler2/S-PORT");
		
		
//		Option.internal.keepJava=new File("C:/GitHub/SimulaCompiler2/javaCodeFEC"); // Generated .java Source is then found in project javaCodeFEC
		Global.packetName="simulaFEC";

//		Global.simulaRtsLib=new File(userDir,"bin"); // To use Eclipse Project's simula.runtime
		Global.simulaRtsLib=new File(simulaDir,"bin"); // To use Eclipse Project's simula.runtime

		
		System.out.println("SimulaRtsLib: "+Global.simulaRtsLib);
		
		// Set RunTime Options and tracing.
		RTOption.VERBOSE = false;
		RTOption.VERBOSE = true;
//		RTOption.internal.DEBUGGING = false;
//		RTOption.USE_CONSOLE=false;
//		RTOption.BLOCK_TRACING = true;
//		RTOption.GOTO_TRACING = false;
//		RTOption.QPS_TRACING = false;
//		RTOption.SML_TRACING = false;
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/CompilerTests/src/simulaTestPrograms/simple/adHoc00.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/CompilerTests/src/simulaTestPrograms/simple/adHoc01.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst00.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst01.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst02.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst03.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst04.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst05.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst06.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst07.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst08.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst09.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst10.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst11.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst12.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst13.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst14.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst15.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst16.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst17.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst18.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst19.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst20.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst21.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst22.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst23.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst24.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst25.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst26.sim";  // ERROR: SORRY, switch element requiring thunk IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst27.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst28.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst29.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst30a.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst30.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst31.sim";  // ERROR: SORRY, complex switch element IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst32.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst33.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst34.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst35.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst36.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst37.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst38.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst39.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/p40b.sim";     // Precompile this for Simtst 40.
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/p40a.sim";     // Precompile this for Simtst 40.
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/p40c.sim";     // Precompile this for Simtst 40.
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst40.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/p41.sim";        // Precompile this for Simtst 41.
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst41.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/SimulaTest.sim"; // Precompile this for Simtst 42 ...
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst42.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst43.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst44.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst45.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst46.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst47.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst48.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst49.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst50.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst51.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst52.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst53.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst54.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst55.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst56.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst57.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst58.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst59.sim";  // ERROR: lowerbound, upperbound not implemented
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst60.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst61.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst62.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst63.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst64.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst65.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst66.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst67.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst68.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst69.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst70.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst71.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst72.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst73.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst74.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst75.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst76.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst77.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst78.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst79.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst80.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst81.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst82.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst83.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst84.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst85.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/separat.sim"; // Precompile this for Simtst 86.
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst86.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst87.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst88.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst89.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst90.sim"
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst91.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst92.sim";  // ERROR: lowerbound, upperbound not implemented
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst93.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst94.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst95.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst96.sim";  // ERROR: Wrong WARNING: HIDDEN x ignored, not PROTECTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst97.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst98.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst99.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst100.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst101.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst102.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst103.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst104.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst105.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst106.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst107.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst108.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst109.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst110.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst111.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst112.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst113.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst114.sim";  //ERROR: SWITCH STATEMENT NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst115.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst116.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst117.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst118.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/ExternalClass1.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/ExternalClass2.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst119.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst120.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst121.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst122.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst123.sim";  //SORRY, switch element requiring thunk IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst124.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst125.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst126.sim";  //SORRY, switch element requiring thunk IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst127.sim";  //ERROR: SWITCH STATEMENT NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst128.sim";  //SORRY: The new standard procedures  edit and edfix IS NOT IMPLEMENTD
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/Precompiled129.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst129.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst130.sim";  //SORRY: Class DEC_Lib  IS NOT IMPLEMENTED

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst131.sim";  //SORRY: Class CatchingErrors  IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst132.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst133.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst134.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst135.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst136.sim";  //SORRY: Class CatchingErrors  IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst137.sim";  //SORRY: Class CatchingErrors  IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst138.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst139.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst140.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst141.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst142.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst143.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/Precompiled144.sim"; //ERROR: (l. 77) 151: THIS used in prefix of pref.block
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst144.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst145.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst146.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst147.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst148.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst149.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst150.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst151.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst152.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst153.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst154.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/Pre155.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst155.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst156.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst157.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst158.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst159.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst160.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst161.sim";  //ERROR: Virtual match has wrong type or qualification
		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst162.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst163.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst164.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst165.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst166.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst167.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst168.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst169.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/simulaTestBatch2/src/simulaTestBatch/simtst170.sim";

		long startTimeMs = System.currentTimeMillis( );

		for(String name:names) {
//			String fileName = userDir+"/src/"+Global.packetName+"/sim/"+name;
			String fileName = "C:/WorkSpaces/SPort-System/S_Port/src/sport/fec/"+name;
			System.out.println("Compile: "+fileName);
			SimulaCompiler compiler = new SimulaCompiler(fileName);
			Option.internal.RUNTIME_USER_DIR=new File(fileName).getParent();
			try { compiler.doCompile(); } catch (IOException e) { Util.IERR("Compiler Error: ", e); }
			System.out.println("Done: "+fileName);
		}
		System.out.println("--- END OF SIMULA TESTBATCH");
		long timeUsed  = System.currentTimeMillis( ) - startTimeMs;
		System.out.println("\nElapsed Time: Approximately " + timeUsed/1000 + " sec.");
	}

}
