$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/Login.feature");
formatter.feature({
  "name": "Test Login functionality",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "varify login test with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.steps.LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username and password",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.LoginSteps.user_enter_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.LoginSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.LoginSteps.user_should_land_on_home_page()"
});
formatter.result({
  "status": "passed"
});
});