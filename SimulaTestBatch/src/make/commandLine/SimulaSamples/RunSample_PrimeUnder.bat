
@echo off
cd C:\Users\omyhr\Simula\Simula-2.0
set OPTION=-compilerMode viaJavaSource
set OPTION=%OPTION% -runtimeUserDir C:\GitHub\SimulaCompiler2\SimulaTestBatch\src\simulaSamples
::echo The Options are: %OPTION%

java -jar simula.jar %OPTION% C:/Users/omyhr/Simula/Simula-2.0/samples/PrimeUnder.sim

pause