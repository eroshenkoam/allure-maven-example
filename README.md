# Allure Maven Sample


## Generate via maven 

* `mvn clean test` - run your tests
* `mvn allure:aggregate` - generate report

Report will be generated in 'target/site/allure-maven-plugin'

## Generate via commandline

* `mvn clean test` - run your tests
* `allure generate first-module/target/allure-results second-module/target/allure-results` - generate report

## Seve via commandline

* `mvn clean test` - run your tests
* `allure serve first-module/target/allure-results second-module/target/allure-results` - serve report

Enjoy!