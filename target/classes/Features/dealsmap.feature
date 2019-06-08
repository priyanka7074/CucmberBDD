Feature: Deals data creation 

Scenario: Free CRM create a new deal Scenario 
	Given user is already on login page 
	When title of login page is Free CRM 
	Then user enters username and password 
		| username | password |
		| priyankak | test@123 |
	Then user clicks on Login button 
	Then user is on Home Page 
	Then user moves to new deals page 
	Then user enters deal details 
		| title      | amount | probability | commision |
		| test deal1 | 1000   | 50          | 10        |
		| test deal2 | 2000   | 60          | 20        |
		| test deal3 | 3000   | 70          | 30        |
	Then close the browser