set projectpath=D:\seleniumTrg_ws\WebDriver_TestNg_Testsuite
cd %projectpath%
set classpath=%projectpath%\bin;%projectpath%\lib\*
java org.testng.TestNG %projectpath%\TestNg.xml