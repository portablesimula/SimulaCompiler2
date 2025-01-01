rem *** Call Javadoc for Simula

rem javadoc -Xmaxwarns 1000 --release 24 --enable-preview -private -d C:\GitHub\SimulaCompiler2\Simula\doc -sourcepath C:\GitHub\SimulaCompiler2\Simula\src -subpackages simula
javadoc --release 24 --enable-preview -private -d C:\GitHub\github.io\javadoc -sourcepath C:\GitHub\SimulaCompiler2\Simula\src -subpackages simula
pause
cd C:\GitHub\github.io\javadoc
dir
pause
