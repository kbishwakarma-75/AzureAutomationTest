$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/kbish/eclipse-workspace/CucumberFramework/Features/LetsKodeit_Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Fucntion Test",
  "description": "Description: This feature is to validate login functionality.",
  "id": "login-fucntion-test",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Background: Manual execution effort for automation metrics"
    },
    {
      "line": 5,
      "value": "#Given Manual Execution Effort is 00:30:00"
    }
  ],
  "line": 7,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-fucntion-test;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Open the Browser Successful Login",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter the URL for Successful Login",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click on Sign up or Login Link Successful Login",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Enter Valid Username and Password Successful Login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on Login Button Successful Login",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify User must see All Courses",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Logout Successful",
  "keyword": "And "
});
formatter.match({
  "location": "LetsKoditStepDefinition.open_the_Browser_Successful_Login()"
});
formatter.result({
  "duration": 9457343100,
  "status": "passed"
});
formatter.match({
  "location": "LetsKoditStepDefinition.enter_the_URL_for_Successful_Login()"
});
formatter.result({
  "duration": 5801607400,
  "status": "passed"
});
formatter.match({
  "location": "LetsKoditStepDefinition.click_on_Sign_up_or_Login_Link_Successful_Login()"
});
formatter.result({
  "duration": 1404846300,
  "status": "passed"
});
formatter.match({
  "location": "LetsKoditStepDefinition.enter_Valid_Username_and_Password_Successful_Login()"
});
formatter.result({
  "duration": 247993900,
  "status": "passed"
});
formatter.match({
  "location": "LetsKoditStepDefinition.click_on_Login_Button_Successful_Login()"
});
formatter.result({
  "duration": 964338400,
  "status": "passed"
});
formatter.match({
  "location": "LetsKoditStepDefinition.verify_User_must_see_All_Courses()"
});
formatter.result({
  "duration": 95046300,
  "status": "passed"
});
formatter.match({
  "location": "LetsKoditStepDefinition.logout_Successful()"
});
formatter.result({
  "duration": 1971172900,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Unsuccessful Login with Invalid Credentials",
  "description": "",
  "id": "login-fucntion-test;unsuccessful-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "User on Complete Test Automation Bundle Page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Click on Sign In Link Unccessful Login",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Enter Invalid Username and Password Unccessful Login",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify Invlaid Message Displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Close Application",
  "keyword": "And "
});
formatter.match({
  "location": "LetsKoditStepDefinition.user_on_Complete_Test_Automation_Bundle_Page()"
});
formatter.result({
  "duration": 1899000,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinitions_LetsKodeit.LetsKoditStepDefinition.user_on_Complete_Test_Automation_Bundle_Page(LetsKoditStepDefinition.java:90)\r\n\tat ✽.Given User on Complete Test Automation Bundle Page(C:/Users/kbish/eclipse-workspace/CucumberFramework/Features/LetsKodeit_Login.feature:17)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "LetsKoditStepDefinition.click_on_Sign_In_Link_Unccessful_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LetsKoditStepDefinition.enter_Invalid_Username_and_Password_Unccessful_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LetsKoditStepDefinition.verify_Invlaid_Message_Displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LetsKoditStepDefinition.close_Application()"
});
formatter.result({
  "status": "skipped"
});
});