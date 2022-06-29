# testNgSelenium

FULL INSTRUCTION IN COURCE
https://www.udemy.com/course/selenium-java-test-framework



1. Run testng.xml
   mvn clean test -DsuiteXmlFile='testng.xml'
2. Allure command:
   allure serve target/allure-results
3. Parallel
   maven surfire plugging in pom.xml (default is: method and 10)
	or
   testng.xml

