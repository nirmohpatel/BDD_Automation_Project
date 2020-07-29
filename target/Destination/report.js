$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration Feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9322008300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "To Verify that User should be able to Register successfully",
  "description": "so that user can use all functionality on website",
  "id": "registration-feature;to-verify-that-user-should-be-able-to-register-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User click on register",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enter all required registration details",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on registerButton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_HomePage()"
});
formatter.result({
  "duration": 304426200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_register_button()"
});
formatter.result({
  "duration": 1530970500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enter_all_required_registration_details()"
});
formatter.result({
  "duration": 1741163100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_click_on_register_Button()"
});
formatter.result({
  "duration": 149202400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_able_to_register_successfully()"
});
formatter.result({
  "duration": 5693575100,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//div/div[text()\u003d\"Your registration completed\"]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-AQ6C49R\u0027, ip: \u0027192.168.0.22\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_251\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.example.Util.getTextFromElement(Util.java:37)\r\n\tat org.example.RegistrationSuccessfully.toVerifyUserIsRegistrationSuccessfulMessage(RegistrationSuccessfully.java:16)\r\n\tat org.example.MyStepDefs.user_should_able_to_register_successfully(MyStepDefs.java:41)\r\n\tat ✽.Then User should able to register successfully(src/test/resources/features/Registration.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 51300,
  "status": "passed"
});
});