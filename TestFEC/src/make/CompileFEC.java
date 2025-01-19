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
import java.nio.file.Files;
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
public final class CompileFEC {
	/**
	 * Default Constructor.
	 */
	CompileFEC(){}
	
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
		names.add("CLASS_COMMON.sim");   // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_COMMON.jar
		names.add("CLASS_ERRMSG.sim");   // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_ERRMSG.jar
		names.add("CLASS_SCANNER.sim");  // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_SCANNER.jar
		names.add("CLASS_SCANINP.sim");  // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_SCANINP.jar 
		names.add("CLASS_PARSER.sim");   // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_PARSER.jar
		names.add("CLASS_PAS1INIT.sim"); // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_PAS1INIT.jar
		names.add("CLASS_BUILDER1.sim"); // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_BUILDER1.jar
		names.add("CLASS_BUILDER2.sim"); // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_BUILDER2.jar
		names.add("CLASS_CHECKER1.sim"); // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_CHECKER1.jar
		names.add("CLASS_CHECKER2.sim"); // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_CHECKER2.jar
		names.add("CLASS_SCODER0.sim");  // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_SCODER0.jar
		names.add("CLASS_SCODER1.sim");  // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_SCODER1.jar
		names.add("CLASS_SCODER1E.sim"); // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_SCODER1E.jar	
		names.add("CLASS_SCODER2.sim");  // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_SCODER2.jar
		names.add("CLASS_SCODER3.sim");  // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_SCODER3.jar
		names.add("CLASS_SCODER4.sim");  // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_SCODER4.jar
		names.add("CLASS_PAS2INIT.sim"); // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_PAS2INIT.jar
		names.add("CLASS_SCODMAIN.sim"); // END Create .jar File: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\CLASS_SCODMAIN.jar

//		names.add("GENMSG.sim");            // WILL GENERATE FILE MessageGenerator.sim
//		names.add("MessageGenerator.sim");  // WILL GENERATE ERROR MESSAGE FILE FECERROR.txt
		
		names.add("FEC.sim");  // WILL CREATE THE S-PORT COMPILER: C:\GitHub\S-Port-Simula\FEC\src\fec\source\bin\FEC.jar

		// Set options and tracing.
		Option.internal.INLINE_TESTING=true;
		Option.internal.SPORT=true;
		Option.verbose=true;
//		Option.internal.TRACING=false;
		Option.WARNINGS=false;
//		Option.compilerMode = Option.CompilerMode.viaJavaSource;
		Option.compilerMode = Option.CompilerMode.directClassFiles;
//		Option.compilerMode = Option.CompilerMode.simulaClassLoader;
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
		Option.internal.PRINT_SYNTAX_TREE=1;
//		Option.internal.TRACE_ATTRIBUTE_OUTPUT=true;
//		Option.internal.TRACE_ATTRIBUTE_INPUT=true;
//
//		// Checker Trace Options
//		Option.internal.TRACE_CHECKER=true;
//		Option.internal.TRACE_CHECKER_OUTPUT=true;
//		Option.internal.TRACE_FIND_MEANING=2;

		
//		File userDir=new File("C:/GitHub/SimulaCompiler2/Simula");
		File simulaDir=new File("C:/GitHub/SimulaCompiler2/Simula");
//		File userDir=new File("C:/GitHub/simulaCompiler2/simulaTestBatch_FEC");
		
		
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
		
//		RTOption.SPORT_SOURCE_FILE="C:/WorkSpaces/SPort-System/S-Port/src/sport/fec/MINI-PREDEF.DEF";
//		RTOption.SPORT_SOURCE_FILE="C:/WorkSpaces/SPort-System/S-Port/src/sport/fec/PREDEF.DEF";
		
//		RTOption.SPORT_SOURCE_FILE="C:/WorkSpaces/SimulettaFECinJava/SimulettaFEC/src/simuletta/RTS_FEC_InterfaceGenerator/predef/PREDEF.DEF";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/SimulaCompiler2/CompilerTests/src/simulaTestPrograms/simple/adHoc00.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestPrograms/simple/adHoc01.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestPrograms/simple/adHoc02.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestPrograms/simple/Editing.sim";

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst101.sim";
		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst00.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst01.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst02.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst03.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst03.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst04.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst05.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst06.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst07.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst08.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst09.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst10.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst11.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst12.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst13.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst14.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst15.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst16.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst17.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst18.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst19.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst20.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst21.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst22.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst23.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst24.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst25.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst26.sim";  //ERROR: SORRY, switch element requiring thunk IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst27.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst28.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst29.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst30.sim"; 
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst31.sim";  //ERROR: SORRY, complex switch element IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst32.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst33.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst34.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst35.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst36.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst37.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst38.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst39.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst40pb.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst40pa.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst40.sim"; 
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst41proc.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst41.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst42.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst43.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst44.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst45.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst46.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst47.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst48.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst49.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst50.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst51.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst52.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst53.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst54.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst55.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst56.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst57.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst58.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst59.sim";  //ERROR: Line 18  missing indices
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst60.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst61.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst62.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst63.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst64.sim";  //ERROR: Recursive or nested call is not allowed in S-Code: AR1IND
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst65.sim";  //ERROR: Recursive or nested call is not allowed in S-Code: TXTASS
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst66.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst67.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst68.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst69.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst70.sim";
	
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst71.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst72.sim";  FEC-ERROR: See comment in source text. 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst73.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst74.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst75.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst76.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst77.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst78.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst79.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst80.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst81.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst82.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst83.sim";  //FEC-ERROR: See comment in source text.
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst84.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst85.sim";  //ERROR: Directfile
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst86Separat.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst86.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst87.sim";  //ERROR: Specification of Virtual Procedures - Invalid expression:
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst88.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst89.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst90.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst91.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst92.sim";  //ERROR: missing indices - lowerbound(RA,1);
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst93.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst94.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst95.sim";  //NOT IMPLEMENTED: Inline System Routine GIVINF[22]
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst96.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst97.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst98.sim";  //ERROR Attribute protection - FEILER !
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst99.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst100.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst101.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst102.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst103.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst104.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst105.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst106.sim";  //FEILER
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst107.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst108.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst109.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst110.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst111.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst112.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst113.sim";  //ERROR: GOTO VIRTUAL SWITCH
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst114.sim";  //ERROR: SWITCH STATEMENT NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst115.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst116.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst117.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst118.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst119MainSeparate.sim";  //IKKE FORSØKT: External Class  !!! 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst119SubSep.sim";  //IKKE FORSØKT: External Class  !!! 
//			RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst119.sim";  //IKKE FORSØKT: External Class  !!! 
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst120.sim";
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst121.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst122.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst123.sim";  //SORRY, switch element requiring thunk IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst124.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst125.sim";
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst126.sim";  //SORRY, switch element requiring thunk IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst127.sim";  //ERROR: SWITCH STATEMENT NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst128.sim";  //SORRY: The new standard procedures  edit and edfix IS NOT IMPLEMENTD

//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch_FEC/sim/SimulaTest.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch_FEC/sim/Precompiled129.sim"; 
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst129.sim"; 
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst130.sim";  //SORRY: Class DEC_Lib  IS NOT IMPLEMENTED
		
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst131.sim";  //SORRY: Class CatchingErrors  IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst132.sim";  //SORRY: Class SPORT Options  IS NOT IMPLEMENTED
//		RTOption.SPORT_SOURCE_FILE="C:/GitHub/simulaCompiler2/simulaTestBatch_FEC/src/simulaTestBatch/simtst133.sim";  //SMÅ FEIL

		long startTimeMs = System.currentTimeMillis( );

		for(String name:names) {
//			String fileName = userDir+"/src/"+Global.packetName+"/sim/"+name;
//			String fileName = "C:/WorkSpaces/SPort-System/S-Port/src/sport/fec/"+name;
//			String fileName = "C:/WorkSpaces/SportFECinSimula/SPortFEC/src/fec/source/"+name;
			String fileName = "C:/GitHub/S-Port-Simula/FEC/src/fec/source/"+name;
			System.out.println("Compile: "+fileName);
			SimulaCompiler compiler = new SimulaCompiler(fileName);
			Option.internal.RUNTIME_USER_DIR=new File(fileName).getParent();
			try { compiler.doCompile(); } catch (IOException e) { Util.IERR("Compiler Error: ", e); }
			System.out.println("Done: "+fileName);
		}
		copyFECtoSPORT_HOME();
		System.out.println("--- END OF SIMULA TESTBATCH");
		long timeUsed  = System.currentTimeMillis( ) - startTimeMs;
		System.out.println("\nElapsed Time: Approximately " + timeUsed/1000 + " sec.");
	}
	
	private static void copyFECtoSPORT_HOME() {
		File source=new File("C:/GitHub/S-Port-Simula/FEC/src/fec/source/bin/FEC.jar");
		File target=new File("C:/SPORT/FEC.jar");
		target.mkdirs();
		System.out.println("source="+source);
		System.out.println("target="+target);
		try {
			Files.copy(source.toPath(), target.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
