Feature: Login Fucntion Test 
	Description: This feature is to validate login functionality. 
	#Background: Manual execution effort for automation metrics 
	#Given Manual Execution Effort is 00:30:00
		   
Scenario Outline: Successful Login with Valid Credentials 
	Given Open the Browser Successful Login
	When Enter the URL for Successful Login
	And Click on Sign up or Login Link Successful Login
	And Enter Valid "<username>" and "<password>" Successful Login
	And Click on Login Button Successful Login
	Then Verify User must see All Courses 
	And Logout Successful
	Examples:
		| username | password |
		| krishnabk1@gmail.com  | Krishna75 |
		
	

	
	
  