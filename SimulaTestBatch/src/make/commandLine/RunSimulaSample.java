/*
 * (CC) This work is licensed under a Creative Commons
 * Attribution 4.0 International License.
 *
 * You find a copy of the License on the following
 * page: https://creativecommons.org/licenses/by/4.0/
 */
package make.commandLine;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

import simula.compiler.utilities.Global;
import simula.compiler.utilities.Option;
import simula.compiler.utilities.Util;

/**
 * Simula Test Batch donated by Simula as.
 * 
 * @author Several from Norwegian Computing Center.
 * @author Several from Simula as.
 * @author Øystein Myhre Andersen
 *
 */
public final class RunSimulaSample {
	private static final File userDir=new File("C:/GitHub/SimulaCompiler2/SimulaTestBatch");
	private static final String sourceDir = userDir+"/src/simulaTestBatch/";
	private static final String testBatchJarDir = userDir+"/src/simulaTestBatch/bin/";
	private static final String simulaJar = "C:\\Users\\omyhr\\Simula\\Simula-2.0\\simula.jar";
	private static long startTimeMs = System.currentTimeMillis( );

	public static void main(String[] args) {
		runFullTestBatch("viaJavaSource");	
//		runFullTestBatch("directClassFiles");	
//		runFullTestBatch("simulaClassLoader");	
	}

	private static void addSimulaOptions(Vector<String> cmds) {
		// Simula Compiler Options
//		cmds.add("-caseSensitive");	
//		cmds.add("-noexec");
//		cmds.add("-nowarn");
//		cmds.add("-noextension");
//		cmds.add("-verbose");
		
	}

	public static void runFullTestBatch(String compilerMode) {
		Vector<String> names=new Vector<String>();
		// *** SIMULA PROGRAMMER TIL RELEASE TESTING
//		names.add("AnimationTest.sim");
		names.add("Atkins.sim");
//		names.add("Dates.sim");
//		names.add("DatesTest.sim");
//		names.add("Docking.sim");
//		names.add("FittingRoom.sim");
//		names.add("HelloWorld.sim");
//		names.add("HexDump.sim");
//		names.add("InfectionDisease.sim");
//		names.add("JensensDevice.sim");
//		names.add("LiftSimulation.sim");
//		names.add("NormalDrawing.sim");
//		names.add("PrimeUnder.sim");
//		names.add("Quine.sim");
//		names.add("Sudoku.sim");
//		names.add("SudokuPuzzle.sim");
//		names.add("TQueens.sim");

		Global.packetName="simulaSamples";
		for(String name:names) {
			String sourceFileName=userDir+"/src/simulaSamples/" + name;

			String runtimeUserDir=new File(sourceFileName).getParent();
			try {
				callSimulaCompiler(compilerMode, sourceFileName, runtimeUserDir);
			} catch (IOException e) {
				Util.IERR("Compiler Error: ", e);
			}
		}
		
//		list(testBatchJarDir);
		deleteFiles(testBatchJarDir);
//		list(testBatchJarDir);
		
		System.out.println("\n--- END OF SIMULA TESTBATCH");
		long timeUsed  = System.currentTimeMillis( ) - startTimeMs;
		System.out.println("\nElapsed Time: Approximately " + timeUsed/1000 + " sec.");
	}

	// ***************************************************************************
	// *** CALL SIMULA COMMAND LINE COMPILER
	//
	// https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javac.html
	// https://docs.oracle.com/javase/10/tools/tools-and-command-reference.htm
	// ***************************************************************************
	/**
	 * Call Java command line compiler.
	 * @param compilerMode the compiler mode
	 * @return return value from the Java compiler
	 * @throws IOException if something went wrong
	 */
	private static int callSimulaCompiler(final String compilerMode, final String sourceFileName, final String runtimeUserDir) throws IOException {
		// Usage: java -jar simula.jar  [options]  sourceFile
		// java -jar <options> C:\Users\omyhr\Simula\Simula-2.0\simula.jar

		Vector<String> cmds = new Vector<String>();
		cmds.add("java");
		cmds.add("-jar");
		cmds.add(simulaJar); // E.G. "C:\\Users\\omyhr\\Simula\\Simula-2.0\\simula.jar"

		cmds.add("-compilerMode"); cmds.add(compilerMode);	
		cmds.add("-runtimeUserDir"); cmds.add(runtimeUserDir);	

		addSimulaOptions(cmds);
		
		cmds.add(sourceFileName);
		
		String[] cmdarray = new String[cmds.size()];
		for (int i = 0; i < cmdarray.length; i++)
			cmdarray[i] = cmds.get(i);
		
		int exitValue = execute(cmdarray);
		if (Option.internal.TRACING) {
			Util.println("END Generate .class Output Code. Exit value=" + exitValue);
		}
		return (exitValue);
	}
	
	/**
	 * Execute an OS command
	 * 
	 * @param cmdarray command array
	 * @return exit value
	 * @throws IOException if an I/O error occurs
	 */
	public static int execute(String[] cmdarray) throws IOException {
		Runtime runtime = Runtime.getRuntime();
//		if (Option.verbose) {
			String line = "";
			for (int i = 0; i < cmdarray.length; i++)
			line = line + " " + cmdarray[i];
			Util.println("Execute: " + line);
//		}
		Process process = runtime.exec(cmdarray);
		InputStream err = process.getErrorStream();
		InputStream inp = process.getInputStream();
		StringBuilder error = new StringBuilder();
		while (process.isAlive()) {
			while (err.available() > 0) {
				char c = (char) err.read();
				System.err.append(c);
				error.append(c);
			}
			while (inp.available() > 0) {
				if (Global.console != null)
					Global.console.write("" + (char) inp.read());
				else
					System.out.append((char) inp.read());
			}
		}
		if (error.length() > 0)
			Util.error(error.toString());
		return (process.exitValue());
	}

	// ***************************************************************
	// *** DELETE FILES
	// ***************************************************************
	private static void deleteFiles(final String dirName) {
		try { File tmpClass = new File(dirName);
		File[] elt = tmpClass.listFiles();
		if(elt==null) return; 
		for (File f : elt) {
			if(f.isDirectory()) deleteFiles(f.getPath());
			f.delete();
		}
		} catch (Exception e) { e.printStackTrace(); }
	}

}
