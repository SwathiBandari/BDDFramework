Feature: Free CRM Login Feature
#Scenario: Free CRM Login Test Scenario
#Given User is already on Login Page
#When Title of Login Page is Free CRM                
#Then User Enters Username and Password
#And User Clicks on Login Button
#And Login Error Message is Displayed

@Test1
Scenario Outline: Free CRM Login Test Scenario
Given User is already on Login Page
When Title of Login Page is Free CRM                
And User Enters "<Username>" and "<Password>"
And User Clicks on Login Button
Then Login Error Message is Displayed
Examples:
	| Username | Password |
	| ewqwe 	 | swqerr   |
	| dsbeg    |	kiwero  |
	| weyywsd  | sdqwe    |
	
