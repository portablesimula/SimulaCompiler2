rem *** Call Javadoc for Simula
rem javadoc --release 24 --enable-preview -d C:\GitHub\SimulaCompiler2\Simula\doc -sourcepath C:\GitHub\SimulaCompiler2\Simula\src simula.compiler
rem javadoc --release 24 --enable-preview -d C:\GitHub\SimulaCompiler2\Simula\doc -sourcepath C:\GitHub\SimulaCompiler2\Simula\src simula.compiler.parsing
rem javadoc --release 24 --enable-preview -d C:\GitHub\SimulaCompiler2\Simula\doc -sourcepath C:\GitHub\SimulaCompiler2\Simula\src simula.compiler
rem javadoc --release 24 --enable-preview -d C:\GitHub\SimulaCompiler2\Simula\doc -sourcepath C:\GitHub\SimulaCompiler2\Simula\src simula.compiler

javadoc -Xmaxwarns 1000 --release 24 --enable-preview -d C:\GitHub\SimulaCompiler2\Simula\doc -sourcepath C:\GitHub\SimulaCompiler2\Simula\src -subpackages simula
pause
