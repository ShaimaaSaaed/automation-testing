# Automation Test!

This is automated test-case for Sign-up for website https://automationexercise.com/ using the following:
- [Selenium WebDriver](https://www.selenium.dev/documentation/webdriver/) with JAVA
- Driven Testing with DataProvider in [TestNG](https://testng.org/doc/)
	- We use Maven 2 to support TestNG out of the box without the need to download any additional plugins  _(other than TestNG itself)_.
	- Random Genrating data using [JAVA Faker](https://github.com/DiUS/java-faker)
-  Design Pattern: POM
	- Page Object Model (POM)  is a design pattern, popularly used in test automation that creates Object Repository for web UI elements. The advantage of the model is that it reduces code duplication and improves test maintenance.
- Test reporting: [Allure Framework](https://docs.qameta.io/allure/) 

The test do the following steps:
- Open above website.
- Signup and send all registration test data.
- After complete signup, Sign out from the website.

### To Run the test:
- Clone the repo
- Change directory to the repo folder
```
cd automation-testing
```
- Run
```
mvn clean test
```
- The reports will be generated under `allure-results` folder
- To View reports run the following command:
```
allure.bat serve allure-results
```

If allure not installed in your machine you can follow [these docs](https://docs.qameta.io/allure/#_get_started) to install

## Other deliverables

- [Testcases document for Amazon search text box.](https://docs.google.com/spreadsheets/d/1F7JL9oBDhTJ1ovrCDvDrsvNwluE92OiQmld1glAIVdU/edit?usp=sharing)
- [GO Bus Bug reporting document.](https://docs.google.com/spreadsheets/d/1Dc8L-ccAMpkM3rBTxp_KWSUdXGcQlG6Mz0Uxwm_xaZ4/edit?usp=sharing)
