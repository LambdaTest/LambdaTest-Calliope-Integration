# LambdaTest and Calliope Integration

Using this repository you can now send test execution results of selenium tests run on [LambdaTest](https://www.lambdatest.com/) Selenium Automation Grid platform to Calliope analytics. In this repository we are using TestNG framework to run Selenium tests, which are being executed at [LambdaTest Selenium Gird](https://www.lambdatest.com/selenium-automation), and the results of the executed tests would be be pushed to Calliope analytics platform. 

The first step is setting up environment. 

## Setting up TestNG Environment

### Adding LambdaTest Credentials

In BaseTest.java file, add LambdaTest credentials to the defined variables:

 - username = < your lambdatest username >
 - accesskey = < your lambdatest access_key >

you can find these credentials in your [LambdaTest automation dashboard](https://automation.lambdatest.com/) or You can get this credentials from [LambdaTest Capability Generator](https://www.lambdatest.com/capabilities-generator/)
### Configuring Calliope Credentials

In CalliopeAPI.java file, add your test result file path and Calliope details to the defined variables:
•    report_filename = < your result file directory path>
•    endpoint_url = < your calliope profile number>
•    API_KEY = < your calliope API key>
You can get this details from Calliope API webpage. You can learn more about it in Calliope docs [here](https://docs.calliope.pro/import/api-import/).

## Running Tests
In this repository, we have a BaseTest.java file in which you can add your your test cases/methods along with the desired configuration on which you want to run your test on.

## Output
After running  BaseTest.java file you would get your test session data to your Calliope profile. You would also get the same data on your local console itself along with the Calliope profile link where your data has been pushed.

### Important Note

`Calliope accepts different format result files for different frameworks. For ex: XML for TestNG,JUnit,NUnit and JSON for Cucumber. Check the test report result file supported by Calliope from link:
https://docs.calliope.pro/supported-formats/other-formats/`


## About LambdaTest

LambdaTest is a cloud based selenium grid infrastructure that can help you run automated cross browser compatibility tests on 2000+ different browser and operating system environments. All test data generated during testing including Selenium command logs, screenshots generated in testing, video logs, selenium logs, network logs, console logs, and metadata logs can be extracted using [LambdaTest automation APIs](https://www.lambdatest.com/support/docs/api-doc/). This data can then be used for creating custom reports.
