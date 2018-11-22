Base Test Automation Page Object Model Project 
==============================================================


IntelliJ Instructions
--------------------

1. Click "Checkout from Version Control"
2. Past following url and select directory to save.
    ```git repository``` : ```https://github.com/selcukayhan/baseTestAutomationPOM.git```
3. Build as a Maven Project

Test Execution Instructions
--------------------

* To execute whole tests in Test Classes :
    1. Open `SmokeTest.java` under `src/test/java/com/n11/selenium`
    2. Right click inside the home class and Click "Run SmokeTest".
   
    * Or Type `mvn clean test -Dtest=SmokeTest`  to terminal. 
    
* To execute a simple test in Test Class :
    1. Open `SmokeTest.java` under `src/test/java/com/n11/selenium`
    2. Right click inside the test method and Click "Run testMethodName()" for example "Run shouldLogin()"
    
    * Or Type ```mvn clean test -Dtest=SmokeTest#shouldLogin``` to terminal. 

* Before running tests please update Config file and Buyer e-mails.

    * Please update `DEFAULT_USERNAME` and `DEFAULT_PASSWORD` variables in the Config file.
    * Please update buyer e-mails in the BuyerPool file as specified.
