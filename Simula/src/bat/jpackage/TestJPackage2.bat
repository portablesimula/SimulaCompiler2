
jpackage ^
--input C:\JPackage\Input ^
--dest C:\JPackage\Output ^
--name SimulaEditor ^
--app-version 2.0.28 ^
--icon C:\Users\omyhr\simula\simula-2.0\icons\sim.ico ^
--vendor github.com/portablesimula ^
--copyright "Creative Commons Attribution 4.0 International License" ^
--main-jar simula.jar ^
--main-class simula.compiler.Simula ^
--type exe

pause

C:\GitHub\SimulaCompiler2\Simula\src\bat\jpackage>jpackage --input C:\JPackage\Input --dest C:\JPackage\Output --name SimulaEditor --app-version 2.0.28 --icon C:\Users\omyhr\simula\simula-2.0\icons\sim.ico --vendor github.com/portablesimula --copyright "Creative Commons Attribution 4.0 International License" --main-jar simula.jar --main-class simula.compiler.Simula --type exe
java.io.IOException: Command [wix.exe, build, -nologo, -pdbtype, none, -intermediatefolder,
 C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\wixobj,
  -ext, WixToolset.Util.wixext, -arch, x64, -b, C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\config,
   -loc, C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\config\MsiInstallerStrings_de.wxl,
    -loc, C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\config\MsiInstallerStrings_en.wxl,
     -loc, C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\config\MsiInstallerStrings_ja.wxl,
      -loc, C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\config\MsiInstallerStrings_zh_CN.wxl,
       -culture, en-us, -d, JpAppDescription=SimulaEditor, -d, JpAppVersion=2.0.28,
        -d, JpProductCode=fef83565-def0-33f0-8e6d-d1c81cac7599, -d, JpAppName=SimulaEditor, -d, JpAllowUpgrades=yes,
         -d, JpProductUpgradeCode=11c4b384-7e2c-3c14-9680-3c5b3e04842d, -d, JpIsSystemWide=yes, -d, JpAllowDowngrades=yes,
          -d, JpIcon=C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\images\win-msi.image\SimulaEditor\SimulaEditor.exe,
           -d, JpAppVendor=github.com/portablesimula, -d, JpAppSizeKb=156196,
            -d, JpConfigDir=C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\config,
             C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\config\main.wxs,
              C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\config\bundle.wxf,
               C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\config\ui.wxf,
                -out, C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\wixobj\a.msi]
                 in C:\Users\omyhr\AppData\Local\Temp\jdk.jpackage5468190862011140841\images\win-msi.image\SimulaEditor
                 
                  exited with 144 code

C:\GitHub\SimulaCompiler2\Simula\src\bat\jpackage>pause
Press any key to continue . . .




