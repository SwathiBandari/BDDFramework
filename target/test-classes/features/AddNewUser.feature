Feature: Word Press Feature

@LoginTest
Scenario: Word Press Login Scenario
Given User is already on Loginorhome Page
When Title of Login Page is LoginOpensource              
And User Enters Usernameoremail and Password
|opensourcecms | opensourcecms |
Then User Clicks on Login Button of WordPressPage

@UserCreation
Scenario: New User Creation
Given User logged with "opensourcecms" and "opensourcecms"
When Clicked on Users
And Clicks on AddUser
And NewUserPage Form is displayed
| newuser91 | newuse91@gmail.com | newuser9 | untitled91 | untitled91newuser.com.au | 
Then NewUseriscreated











