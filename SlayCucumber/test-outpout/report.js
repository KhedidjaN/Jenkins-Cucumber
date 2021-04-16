$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login With Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email \"admin@yourstore.com\" and Password \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Email_and_Password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.Page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on log out link",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.User_click_on_log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.Page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login Data Driven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Email \"\u003cemail\u003e\" and Password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User click on log out link",
  "keyword": "When "
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ]
    },
    {
      "cells": [
        "admin1@yourstore.com",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Data Driven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email \"admin@yourstore.com\" and Password \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Email_and_Password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.Page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on log out link",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.User_click_on_log_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.Page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Data Driven",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://admin-demo.nopcommerce.com/login?ReturnUrl\u003d%2Fadmin%2F\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_opens_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email \"admin1@yourstore.com\" and Password \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.user_enters_Email_and_Password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.Page_Title_should_be(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Dashboard / nopCommerce administratio]n\u003e but was:\u003c[Your store. Logi]n\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat stepDefinitions.Steps.Page_Title_should_be(Steps.java:47)\r\n\tat ✽.Page Title should be \"Dashboard / nopCommerce administration\"(file:///C:/Users/SARA/IdeaProjects/SlayCucumber/./Features/login.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User click on log out link",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Steps.User_click_on_log_out_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Steps.Page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Steps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});