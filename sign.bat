set JARSIGNER=c:\Program Files\Java\jdk1.7.0_40\bin\jarsigner.exe
set KEYSTORE=..\sign\hpcc_code_signing.pfx
set TSA=https://timestamp.geotrust.com/tsa
set STOREPASS=%1

set SIGN_FILTER=.\org.hpccsystems.updatesite\features\*.jar
CALL :DOSIGN 

set SIGN_FILTER=.\org.hpccsystems.updatesite\plugins\*.jar
CALL :DOSIGN 

GOTO :EOF

:DOSIGN
for /f %%a IN ('dir /b /s "%SIGN_FILTER%"') do call "%JARSIGNER%" -storetype pkcs12 --digestalg SHA1 -sigalg MD5withRSA -keystore "%KEYSTORE%" storepass "%STOREPASS%" -tsa "%TSA%" -verbose "%%a" 1
GOTO :EOF

