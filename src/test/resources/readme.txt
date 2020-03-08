Few notes about the solution:
1. Solution has been implemented using the following tools - Java, JUnit4, maven, Serenity, JBehave and Selenium
2. To be able to run the test please use either AcceptanceTestSuite runner or 'mvn clean verify' command in your terminal
3. By default the Chrome driver will be run. If needed to be changed, please use serenity.properties config file
   or '-Dwebdriver.driver=firefox' parameter in the maven command
4. After each test execution the Serenity report is generated in the target/site/index.html folder