$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/opencart/demo/featurefile/login.feature");
formatter.feature({
  "line": 1,
  "name": "Your Store Login",
  "description": "       As a User\r\n       I want to verify login functionality",
  "id": "your-store-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5164187300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "verify login functionality with valid credentials",
  "description": "",
  "id": "your-store-login;verify-login-functionality-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User should see message \"Your Store\" on the home page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on My Account link",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Login Link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should navigate to Login link",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User should see message on Login page display \"Returning Customer\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userIsOnHomePage()"
});
formatter.result({
  "duration": 201041800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your Store",
      "offset": 25
    }
  ],
  "location": "LoginSteps.userShouldSeeMessageOnTheHomePage(String)"
});
formatter.result({
  "duration": 107666700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userClicksOnMyAccountLink()"
});
formatter.result({
  "duration": 90121600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userClicksOnLoginLink()"
});
formatter.result({
  "duration": 743380500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.userShouldNavigateToLoginLink()"
});
formatter.result({
  "duration": 21900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Returning Customer",
      "offset": 47
    }
  ],
  "location": "LoginSteps.userShouldSeeMessageOnLoginPageDisplay(String)"
});
formatter.result({
  "duration": 68836400,
  "status": "passed"
});
formatter.after({
  "duration": 813553400,
  "status": "passed"
});
});