# Cucumber API Playground with Java

### Run Locally:
 - Pre-requisites: java version 13, jdk version 13, maven (optional) 
 - Download or clone the 'master' branch locally.
 - Run all TCs : Running without local maven:
    
        ### Specify tags using Maven options parameter:
 
        ./mvnw clean test -Dcucumber.options="--glue stepdefs --tags @Regression"
        ./mvnw clean test -Dcucumber.options="--glue stepdefs --tags @TestSuite1"
        ./mvnw clean test -Dcucumber.options="--glue stepdefs --tags @TestSuite1 or @TestSuite2"
        ./mvnw clean test -Dcucumber.options="--glue stepdefs --tags @TestSuite1 and @TestSuite2"
        ./mvnw clean test -Dcucumber.options="--glue stepdefs --tags @Regression --tags ~@TestSuite2"

        ### Specify tags using environment variables:

         # Linux / OS X:
         CUCUMBER_FILTER_TAGS="@smoke and @fast"
         ./mvnw clean test -Dcucumber.options="--glue stepdefs
         
         # Windows:
         set CUCUMBER_FILTER_TAGS="@smoke and @fast"
         ./mvnw clean test -Dcucumber.options="--glue stepdefs

### Conditions in @After hook
        @After("@browser and not @headless")
            public void doSomethingAfter(Scenario scenario){
        }

## RESOURCE REFERENCES

        https://cucumber.io/docs/cucumber/api/
        https://www.toolsqa.com/cucumber/tagged-hooks-in-cucumber/
        https://www.toolsqa.com/cucumber/execution-order-hooks/
        
