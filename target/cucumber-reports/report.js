$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddNewUser.feature");
formatter.feature({
  "name": "Word Press Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "New User Creation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserCreation"
    }
  ]
});
formatter.step({
  "name": "User logged with \"opensourcecms\" and \"opensourcecms\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AddNewUserStepDefinition.user_Logged_with_id_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicked on Users",
  "keyword": "When "
});
formatter.match({
  "location": "AddNewUserStepDefinition.clicked_on_Users()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Clicks on AddUser",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewUserStepDefinition.clicks_on_AddUser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "NewUserPage Form is displayed",
  "rows": [
    {
      "cells": [
        "newuser85",
        "newuse85@gmail.com",
        "newuser8",
        "untitled85",
        "untitled85newuser.com.au"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AddNewUserStepDefinition.newuserpage_Form_is_displayed(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "NewUseriscreated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewUserStepDefinition.newuseriscreated()"
});
formatter.result({
  "status": "passed"
});
});