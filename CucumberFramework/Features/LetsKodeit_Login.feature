Feature: Login Fucntion Test 
	Description: This feature is to validate login functionality. 
	#Background: Manual execution effort for automation metrics 
	#Given Manual Execution Effort is 00:30:00
		   
Scenario: Successful Login with Valid Credentials 
	Given Open the Browser Successful Login
	When Enter the URL for Successful Login
	And Click on Sign up or Login Link Successful Login
	And Enter Valid Username and Password Successful Login
	And Click on Login Button Successful Login
	Then Verify User must see All Courses 
	And Logout Successful
	
Scenario: Unsuccessful Login with Invalid Credentials
	Given User on Complete Test Automation Bundle Page
	When Click on Sign In Link Unccessful Login
	And Enter Invalid Username and Password Unccessful Login
	Then Verify Invlaid Message Displayed
	And Close Application
	
	

	
	
  