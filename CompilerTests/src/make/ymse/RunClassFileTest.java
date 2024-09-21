/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package make.ymse;

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
public final class RunClassFileTest {

	public static void main(String[] args) {
		
		// Set options.
		Option.verbose=true;
//		Option.EXTENSIONS=false;
//		Option.CaseSensitive=true;
//		Option.noExecution=true;
		Option.WARNINGS=false;

		// Set internal test, debug options.
		Option.internal.INLINE_TESTING=true;
		Option.internal.TESTING_STACK_SIZE = true;
//		Option.compilerMode = Option.CompilerMode.viaJavaSource;
		Option.internal.SPORT=true;
//		Option.internal.DEBUGGING=true;
		Option.internal.LIST_GENERATED_CLASS_FILES=true;

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
		Option.internal.TRACE_ATTRIBUTE_OUTPUT=true;
		Option.internal.TRACE_ATTRIBUTE_INPUT=true;
//
//		// Checker Trace Options
//		Option.internal.TRACE_CHECKER=true;
//		Option.internal.TRACE_CHECKER_OUTPUT=true;
//		Option.internal.TRACE_FIND_MEANING=1;

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
//		RTOption.QPS_TRACING = false;
//		RTOption.SML_TRACING = false;

		String sourceDir=userDir+"/src/"+Global.packetName;
//		String fileName=userDir+"/src/"+Global.packetName + name;
//		Option.internal.RUNTIME_USER_DIR=new File(fileName).getParent();


		Vector<String> names=new Vector<String>();
		
		// *** STANDARD CLASSES
		// names.add("/rts/Text.sim");
		// names.add("/rts/ENVIRONMENT.sim");
		// names.add("/rts/BASICIO.sim");
		// names.add("/rts/FILE.sim");
		// names.add("/rts/ImageFile.sim");
		// names.add("/rts/InFile.sim");
		// names.add("/rts/OutFile.sim");
		// names.add("/rts/PrintFile.sim");
		// names.add("/rts/DirectFile.sim");
		// names.add("/rts/ByteFile.sim");
		// names.add("/rts/InbyteFile.sim");
		// names.add("/rts/OutbyteFile.sim");
		// names.add("/rts/DirectByteFile.sim");
		// names.add("/rts/Simset.sim");
		// names.add("/rts/Simulation.sim");

		// *** SIMULA PROGRAMMER FOR VIDERE UTVIKLING
		// names.add("/simprogs/COUNTERACT.sim");  // Used by AirportDeparture
		// names.add("/simprogs/AirportDeparture.sim");
		// names.add("/simprogs/DEMOS.sim");
		// names.add("/simprogs/HegnaNRK.sim");
		// names.add("/simprogs/LIFT90.sim");
		// names.add("/simprogs/Matte.sim");
		// names.add("/simprogs/NewDocking.sim");
		// names.add("/simprogs/QueDemo.sim");
		// names.add("/simprogs/TRAFFIC.sim");
		// names.add("/simprogs/SudokuPuzzle.sim");
		// names.add("/simprogs/SudokuPuzzleFlow.sim");

		// *** SIMULA PROGRAMMER TIL RELEASE TESTING
		// names.add("/samples/AnimationTest.sim");
		// names.add("/samples/Atkins.sim");
		// names.add("/samples/Dates.sim");
		// names.add("/samples/DatesTest.sim");
		// names.add("/samples/Docking.sim");
		// names.add("/samples/FittingRoom.sim");
		// names.add("/samples/HelloWorld.sim");
		// names.add("/samples/HexDump.sim");
		// names.add("/samples/InfectionDisease.sim");
		// names.add("/samples/JensensDevice.sim");
		// names.add("/samples/LiftSimulation.sim");
		 names.add("/samples/NormalDrawing.sim");
		// names.add("/samples/PrimeUnder.sim");
		// names.add("/samples/Quine.sim");
		// names.add("/samples/Sudoku.sim");
		// names.add("/samples/SudokuPuzzle.sim");
		// names.add("/samples/TQueens.sim");

		// *** DEMOS EXAMPLES
		// names.add("/demos/Demos.sim");
		// names.add("/demos/Klant1.sim");
		// names.add("/demos/Klant4.sim");

		// *** SIMULA I EXAMPLES
		// names.add("/SIMULA_1/SIMULA.sim");

		// *** SINGULÆRE TEST PROGRAMMER
		// names.add("/singulares/DirectBytefileAppend.sim");
		// names.add("/singulares/DirectfileAppend.sim");
		// names.add("/singulares/OutfileAppend.sim");
		// names.add("/singulares/PrintFileTest.sim");
		// names.add("/singulares/PrintFileTest2.sim");
		// names.add("/singulares/RandomDrawing.sim");
		// names.add("/singulares/Transplantation1.sim");
		// names.add("/singulares/Transplantation2.sim");
		// names.add("/singulares/Transplantation3.sim");

		// *** SimulaRTS Document EXAMPLES
		// names.add("/simulaRTS_Examples/Sect-2-1-SubBlock.sim");
		// names.add("/simulaRTS_Examples/Sect-2-2-Class.sim");
		// names.add("/simulaRTS_Examples/Sect-2-3-SubClass.sim");
		// names.add("/simulaRTS_Examples/Sect-2-4-PrefixedBlock.sim");
		// names.add("/simulaRTS_Examples/Sect-2-5-Procedure.sim");
		// names.add("/simulaRTS_Examples/Sect-2-6-Switch.sim");
		// names.add("/simulaRTS_Examples/Sect-3-3-Text.sim");
		// names.add("/simulaRTS_Examples/Sect-4-1-JensensDevice.sim");
		// names.add("/simulaRTS_Examples/Sect-4-2-ArrayParameter.sim");
		// names.add("/simulaRTS_Examples/Sect-4-3-ProcedureAsParameter.sim");
		// names.add("/simulaRTS_Examples/Sect-5-SomeExpressions.sim");
		// names.add("/simulaRTS_Examples/Sect-6-1-GotoStatement.sim");
		// names.add("/simulaRTS_Examples/Sect-6-2-ForStatement.sim");
		// names.add("/simulaRTS_Examples/Sect-6-3-ConnectionStatement.sim");
		// names.add("/simulaRTS_Examples/Sect-6-4-SwitchStatement.sim");
		// names.add("/simulaRTS_Examples/Sect-6-5-ActivationStatement.sim");

		// *** SIMULA DESIGN EXAMPLES
		// names.add("/design/Test.sim");
		// names.add("/design/ActivationStatement.sim");
		// names.add("/design/ArrayAssignment.sim");
		// names.add("/design/ArrayAsParameters.sim");
		// names.add("/design/ArrayByValue.sim");
		// names.add("/design/ArrayDeclaration.sim");
		// names.add("/design/CallProcedureRemote.sim");
		// names.add("/design/CallProcedureConnected.sim");
		// names.add("/design/ProcedureDeclaration.sim");
		// names.add("/design/CallProcedureFormal.sim");
		// names.add("/design/CallProcedureVirtual.sim");
		// names.add("/design/ProcedureByName.sim");
		// names.add("/design/ProcedureResult.sim");
		// names.add("/design/RandomDrawing.sim");
		// names.add("/design/SwitchDeclaration.sim");
		// names.add("/design/SwitchStatement.sim");
		// names.add("/design/SyntaxTree.sim");
		// names.add("/design/VirtualSwitch.sim");
		// names.add("/design/FormalSwitch.sim");
		// names.add("/design/NormalSwitch.sim");
		// names.add("/design/ForStatement.sim");
		// names.add("/design/InspectStatement.sim");
		// names.add("/design/WhileStatement.sim");
		// names.add("/design/ClassTry.sim");
		// names.add("/design/Test_CatchingErrors.sim");

		// *** SIMULA ERROR-TEST PROGRAMMER FRA KAREL
		// names.add("/Karel/Collatz.sim");
		// names.add("/Karel/Factorial.sim");
		// names.add("/Karel/FittingRoom.sim");  // P()
		// names.add("/Karel/HegnaNRK.sim");
		// names.add("/Karel/IBMQuine.sim");
		// names.add("/Karel/JensensDevice.sim");
		// names.add("/Karel/PrimeUnder.sim");
		// names.add("/Karel/simulaid.sim");

		// *** SIMULA ERROR-TEST PROGRAMMER
		// names.add("/error/ComplexQPS.sim"); //
		// names.add("/error/VirtualThreadMegaTest.sim"); //
		// names.add("/error/simerr01.sim"); // Syntax errors
		// names.add("/error/simerr02.sim"); // Syntax errors  TODO: MÅ SJEKKES - NumberFormatException - Illegal number: 1e
		// names.add("/error/simerr03.sim"); // Wrong Number of parameters  
		// names.add("/error/simerr04.sim"); // Type checking of Parameter Array 
		// names.add("/error/simerr05.sim"); // Syntax error - Semicolon before 'else' 
		// names.add("/error/simerr06.sim"); // Label invisible through inspection 
		// names.add("/error/simerr08.sim"); // Local Connected Object 
		// names.add("/error/simerr09.sim"); // Character and Java keyword char 
		// names.add("/error/simerr10.sim"); // Java keywords as Identifiers 
		// names.add("/error/simerr13.sim"); // Nested Connections 
		// names.add("/error/simerr14.sim"); // Two consecutive identifiers - ERROR - GÅR I LOOP
		// names.add("/error/simerr15.sim"); // Constants
		// names.add("/error/simerr16.sim"); // Illegal lhs in assignment
		// names.add("/error/simerr17.sim"); // Transplantation
		// names.add("/error/simerr18.sim"); // Transplantation
		// names.add("/error/simerr19.sim"); // Transplantation
		// names.add("/error/simerr20.sim"); // Transplantation
		
		// names.add("/error/issue12.sim"); // Dot-aksess inn i klasser med lokale klasser,
		// names.add("/error/issue13.sim"); // Tillater subklasser på dypere blokknivå.
		// names.add("/error/issue16.sim"); // Problemer med å evaluere Constant-expression
		// names.add("/error/issue20.sim"); // Label og Proceure som parameter til en Klasse
		// names.add("/error/issue23.sim"); // no-type Array som parameter
		// names.add("/error/issue21.sim"); // Ingen new-line til slutt i file
		// names.add("/error/issue24.sim"); // For step until
		// names.add("/error/issue26.sim"); // Terminating Process in strict sence.
		// names.add("/error/issue31.sim"); // Labeled INNER
		// names.add("/error/issue32.sim"); // This Process
		// names.add("/error/issue33.sim"); // Call Procedure Formal 
		// names.add("/error/issue34.sim"); // NOTEXT.put... 
		// names.add("/error/issue35.sim"); // Missing cast in for-statement coding ...
		// names.add("/error/issue36.sim"); // Missing cast in for-statement coding ...
		// names.add("/error/issue37a.sim"); // Missing cast in for-statement coding ...
		// names.add("/error/issue37b.sim"); // Missing cast in for-statement coding ...
		// names.add("/error/issue38.sim"); // Standalone  new ...
		// names.add("/error/issue39.sim"); //  ...
		// names.add("/error/issue40.sim"); // Integer overflow during parsing
		// names.add("/error/issue41.sim"); // Drawing
		// names.add("/error/issue42.sim"); // GOTO else-brance
		// names.add("/error/8Queens.sim");  // Illegal Identifier
		// names.add("/error/Queens.sim");
		// names.add("/error/Queens2.sim");  // Illegal Characters
		// names.add("/error/Characters.sim");  // Illegal Characters
		// names.add("/error/NoughtsAndCrosses.sim");  // 
		// names.add("/error/simtst76b.sim");  // 

		 
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
