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
    // - "C:\Simuletta\Attrs\BEC\simulaRTS\RTS$INTERFACE.dat"
	// - "C:/WorkSpaces/SPort-System/S-Port/src/sport/fec/RTSINIT.ini"
	// - "C:/WorkSpaces/SPort-System/S-Port/src/sport/fec/RTS-FEC-INTERFACE1.def"
    // - "C:/WorkSpaces/SPort-System/S-Port/src/sport/fec/RTS-FEC-INTERFACE2.def"
	// - "C:/WorkSpaces/SPort-System/S-Port/attrs/FEC/PREDEF.atr


	/** 
	 * Main program to execute.
	 * @param args the arguments array
	 */
	public static void main(String[] args) {
    	//System.setProperty("file.encoding","UTF-8");
		Vector<String> names=new Vector<String>();
		names.add("COMMON.sim");   // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\COMMON.jar
		names.add("ERRMSG.sim");   // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\ERRMSG.jar
		names.add("SCANNER.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\SCANNER.jar
//		names.add("adHoc01.sim");   // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\ERRMSG.jar
		names.add("SCANINP.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\SCANINP.jar 
		names.add("PARSER.sim");   // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\PARSER.jar
		names.add("PAS1INIT.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\PAS1INIT.jar
		names.add("BUILDER1.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\BUILDER1.jar
		names.add("BUILDER2.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\BUILDER2.jar
//		
//		names.add("CHECKER1.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\CHECKER1.jar
//		names.add("CHECKER2.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\CHECKER2.jar
//		
//		names.add("SCODER0.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\SCODER0.jar
//		names.add("SCODER1.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\SCODER1.jar
//		names.add("SCODER1E.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\SCODER1E.jar	
//		names.add("SCODER2.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\SCODER2.jar
//		names.add("SCODER3.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\SCODER3.jar
//		names.add("SCODER4.sim");  // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\SCODER4.jar
//		
//		names.add("PAS2INIT.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\PAS2INIT.jar 
//		names.add("SCODMAIN.sim"); // END Create .jar File: C:\WorkSpaces\SPort-System\S-Port\src\sport\fec\bin\SCODMAIN.jar

//		names.add("GENMSG.sim");            // WILL GENERATE FILE MessageGenerator.sim
//		names.add("MessageGenerator.sim");  // WILL GENERATE ERROR MESSAGE FILE FECERROR.txt
		
//		names.add("FECMAIN.sim");  // WILL CREATE THE S-PORT COMPILER

		// Set options and tracing.
		Option.internal.INLINE_TESTING=true;
		Option.internal.SPORT=true;
		Option.verbose=true;
//		Option.internal.TRACING=false;
		Option.WARNINGS=false;
//		Option.internal.CREATE_JAVA_SOURCE = true;
//		Option.internal.USE_SimulaClassLoader = true;
//		Option.internal.LIST_GENERATED_CLASS_FILES=true;
//		Option.CASE_SENSITIVE=true;
//		Option.GNERATE_LINE_CALLS=true;
//		Option.internal.PRINT_SYNTAX_TREE=true;
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
//		Option.internal.PRINT_SYNTAX_TREE=true;
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
//		RTOption.VERBOSE = true;
//		RTOption.internal.DEBUGGING = false;
//		RTOption.USE_CONSOLE=false;
//		RTOption.BLOCK_TRACING = false;
//		RTOption.GOTO_TRACING = false;
//		RTOption.QPS_TRACING = false;
//		RTOption.SML_TRACING = false;
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/WorkSpaces/SPort-System/S-Port/src/sport/fec/MINI-PREDEF.DEF";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/WorkSpaces/SPort-System/S-Port/src/sport/fec/PREDEF.DEF";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/WorkSpaces/SimulettaFECinJava/SimulettaFEC/src/simuletta/RTS_FEC_InterfaceGenerator/predef/PREDEF.DEF";

//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestPrograms/simple/adHoc00.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestPrograms/simple/adHoc01.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestPrograms/simple/adHoc02.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestPrograms/simple/Editing.sim";

//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst00.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst01.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst02.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst03.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst03.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst04.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst05.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst06.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst07.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst08.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst09.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst10.sim";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst11.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst12.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst13.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst14.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst15.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst16.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst17.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst18.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst19.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst20.sim";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst21.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst22.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst23.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst24.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst25.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst26.sim";  //ERROR: SORRY, switch element requiring thunk IS NOT IMPLEMENTED
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst27.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst28.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst29.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst30.sim"; 
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst31.sim";  //ERROR: SORRY, complex switch element IS NOT IMPLEMENTED
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst32.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst33.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst34.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst35.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst36.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst37.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst38.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst39.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst40pb.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst40pa.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst40.sim"; 
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst41proc.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst41.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst42.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst43.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst44.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst45.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst46.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst47.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst48.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst49.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst50.sim";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst51.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst52.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst53.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst54.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst55.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst56.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst57.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst58.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst59.sim";  //ERROR: Line 18  missing indices
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst60.sim";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst61.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst62.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst63.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst64.sim";  //ERROR: Recursive or nested call is not allowed in S-Code: AR1IND
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst65.sim";  //ERROR: Recursive or nested call is not allowed in S-Code: TXTASS
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst66.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst67.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst68.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst69.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst70.sim";
	
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst71.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst72.sim";  FEC-ERROR: See comment in source text. 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst73.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst74.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst75.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst76.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst77.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst78.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler22/S-PORT/src/simulaTestBatch2/sim/simtst79.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst80.sim";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst81.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst82.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst83.sim";  //FEC-ERROR: See comment in source text.
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst84.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst85.sim";  //ERROR: Directfile
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst86Separat.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst86.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst87.sim";  //ERROR: Specification of Virtual Procedures - Invalid expression:
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst88.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst89.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst90.sim";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst91.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst92.sim";  //ERROR: missing indices - lowerbound(RA,1);
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst93.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst94.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst95.sim";  //NOT IMPLEMENTED: Inline System Routine GIVINF[22]
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst96.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst97.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst98.sim";  //ERROR Attribute protection - FEILER !
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst99.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst100.sim";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst101.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst102.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst103.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst104.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst105.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst106.sim";  //FEILER
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst107.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst108.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst109.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst110.sim";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst111.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst112.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst113.sim";  //ERROR: GOTO VIRTUAL SWITCH
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst114.sim";  //ERROR: SWITCH STATEMENT NOT IMPLEMENTED
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst115.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst116.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst117.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst118.sim";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst119MainSeparate.sim";  //IKKE FORSØKT: External Class  !!! 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst119SubSep.sim";  //IKKE FORSØKT: External Class  !!! 
//			RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst119.sim";  //IKKE FORSØKT: External Class  !!! 
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst120.sim";
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst121.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst122.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst123.sim";  //SORRY, switch element requiring thunk IS NOT IMPLEMENTED
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst124.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst125.sim";
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst126.sim";  //SORRY, switch element requiring thunk IS NOT IMPLEMENTED
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst127.sim";  //ERROR: SWITCH STATEMENT NOT IMPLEMENTED
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst128.sim";  //SORRY: The new standard procedures  edit and edfix IS NOT IMPLEMENTD

//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/SimulaTest.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/Precompiled129.sim"; 
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst129.sim"; 
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst130.sim";  //SORRY: Class DEC_Lib  IS NOT IMPLEMENTED
		
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst131.sim";  //SORRY: Class CatchingErrors  IS NOT IMPLEMENTED
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst132.sim";  //SORRY: Class SPORT Options  IS NOT IMPLEMENTED
//		RTOption.internal.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/S-PORT/src/simulaTestBatch2/sim/simtst133.sim";  //SMÅ FEIL

		long startTimeMs = System.currentTimeMillis( );

		for(String name:names) {
//			String fileName = userDir+"/src/"+Global.packetName+"/sim/"+name;
			String fileName = "C:/WorkSpaces/SPort-System/S-Port/src/sport/fec/"+name;
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
