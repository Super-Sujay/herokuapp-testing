# HerokuApp Website Testing

This is an automation test project that uses the [advance selenium automation framework](https://github.com/Super-Sujay/advance-selenium-framework) to test the functionality.
Application URL: http://the-internet.herokuapp.com

## Requirement
 - Java 1.8 or higher version
 - Apache Maven 3.6.2 or higher version

## Execution
 - Run the command `mvn clean verify` in your local system to start the execution of tests.
 - Run the command `mvn clean -Dthreads=2 verify` in your local system to start the execution of tests parallelly in 2 separate browser instances.
 - Run the command `mvn clean -DsuiteFile=TestSuite verify` in your local system to start the suite execution of the TestSuite.xml file present in the src/test/resources/suite folder.
 - Run the command `mvn clean -Dremote=true -DseleniumGridURL=http://192.168.1.3:4444/wd/hub verify` in your local system to start the execution of tests in the selenium grid provided in the http://192.168.1.3:4444/wd/hub URL.