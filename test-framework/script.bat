@echo off

set TOMCAT_DIR=D:\fianarana\xampp\tomcat
set WEBAPPS_DIR=%TOMCAT_DIR%\webapps
set WAR_NAME=test-framework

echo Creating the WAR file...
jar cvf %WAR_NAME%.war -C %WEBAPPS_DIR%\frameworketu2085\test-framework .

echo Deploying the WAR file to Tomcat...

move %WAR_NAME%.war %TOMCAT_DIR%\webapps

if %errorlevel% neq 0 (
    echo Failed to deploy the WAR file.
) else (
    echo WAR file deployed successfully.
)
