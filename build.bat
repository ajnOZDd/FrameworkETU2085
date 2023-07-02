@echo off

set JAR_NAME=mande
set DESTINATION_DIR=D:\fianarana\xampp\tomcat\webapps\test-framework\WEB-INF\lib

echo Creating JAR file...
jar cvf WEB-INF\lib\%JAR_NAME%.jar -C WEB-INF\classes .

echo Moving JAR file to the destination...

xcopy /Y /I WEB-INF\lib\%JAR_NAME%.jar "%DESTINATION_DIR%"
if %errorlevel% neq 0 (
    echo Failed to move the JAR file.
) else (
    echo JAR file moved successfully.
)
