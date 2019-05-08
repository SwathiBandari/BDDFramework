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
| newuser81 | newuse81@gmail.com | newuser8 | untitled81 | untitled81newuser.com.au | 
Then NewUseriscreated











