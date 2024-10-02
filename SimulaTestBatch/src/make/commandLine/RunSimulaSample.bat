
@echo off
cd C:\Users\omyhr\Simula\Simula-2.0
set OPTION=-compilerMode viaJavaSource
set OPTION=%OPTION% -runtimeUserDir C:\GitHub\SimulaCompiler2\SimulaTestBatch\src\simulaSamples
::echo The Options are: %OPTION%

::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/AnimationTest.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/Atkins.sim
java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/Dates.sim
java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/DatesTest.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/Docking.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/FittingRoom.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/HelloWorld.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/HexDump.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/InfectionDisease.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/JensensDevice.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/LiftSimulation.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/NormalDrawing.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/PrimeUnder.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/Quine.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/Sudoku.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/SudokuPuzzle.sim
::java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/TQueens.sim

pause