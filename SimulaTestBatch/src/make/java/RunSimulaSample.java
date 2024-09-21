/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package make.java;

import java.io.File;
import java.io.IOException;

import simula.compiler.SimulaCompiler;
import simula.compiler.utilities.Global;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Run inline compiler tests.
 * @author Øystein Myhre Andersen
 *
 */
public final class RunSimulaSample {

	public static void main(String[] args) {
		//System.setProperty("file.encoding","UTF-8");

		// *** SIMULA PROGRAMMER TIL RELEASE TESTING
//		String name="AnimationTest.sim";
//		String name="Atkins.sim";
//		String name="Dates.sim";
//		String name="DatesTest.sim";
//		String name="Docking.sim";    // FEILER
//		String name="FittingRoom.sim";
//		String name="HelloWorld.sim";
//		String name="HexDump.sim";
//		String name="InfectionDisease.sim";
//		String name="JensensDevice.sim";
//		String name="LiftSimulation.sim";
		String name="NormalDrawing.sim";
//		String name="PrimeUnder.sim";
//		String name="Quine.sim";
//		String name="Sudoku.sim";
//		String name="SudokuPuzzle.sim";
//		String name="TQueens.sim";

		// Set Compiler Options.
		Option.compilerMode = Option.CompilerMode.viaJavaSource;
//		Option.verbose=true;
//		Option.EXTENSIONS=false;
//		Option.CaseSensitive=true;
//		Option.noExecution=true;
//		Option.WARNINGS=false;

		// Set internal test, debug options.
		Option.internal.INLINE_TESTING=true;
		Option.internal.TESTING_STACK_SIZE = true;
//		Option.internal.SPORT=true;
//		Option.internal.TRACING=false;
//		Option.internal.TRACE_ATTRIBUTE_OUTPUT=true;
//		Option.internal.TRACE_ATTRIBUTE_INPUT=true;

//		File simulaHome=new File("C:/GitHub/SimulaCompiler2/TestBatch");
		File simulaDir=new File("C:/GitHub/SimulaCompiler2/Simula");
		File userDir=new File("C:/GitHub/SimulaCompiler2/SimulaTestBatch");
				
		Global.packetName="simulaSamples";
//		Option.internal.keepJava=userDir; // Generated .java Source is then found in Eclipse Package simulaTestPrograms
		Global.simulaRtsLib=new File(simulaDir,"bin"); // To use Eclipse Project's simula.runtime
//		Option.outputDir=new File("C:/GitHub/SimulaCompiler2/Simula/src/simulaTestPrograms/samples/simula/bin");
//		Global.outputDir=new File("C:/GitHub/SimulaCompiler2/TestBatch/src/simulaTestPrograms/samples/simula/bin");
		Global.outputDir=new File("C:/GitHub/SimulaCompiler2/CompilerTests/bin/simulaTestPrograms");
			
			
		// Set RunTime Options and tracing.
//		RTOption.VERBOSE = true;
//		RTOption.USE_CONSOLE=true;
//		RTOption.BLOCK_TRACING = true;
//		RTOption.GOTO_TRACING = false;
//		RTOption.QPS_TRACING = false;
//		RTOption.SML_TRACING = false;

		String fileName=userDir+"/src/"+Global.packetName + '/' + name;
		Option.internal.RUNTIME_USER_DIR=new File(fileName).getParent();

		SimulaCompiler compiler = new SimulaCompiler(fileName);
		try { compiler.doCompile(); } catch (IOException e) { Util.IERR("Compiler Error: ", e); }
	}


}
