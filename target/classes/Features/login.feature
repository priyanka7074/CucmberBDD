Feature: Free CRM Login Feature

# Without Examples Keyword
#Scenario: Free CRM Login Test Scenario
# 
#    Given user is already on login page
#    When title of login page is Free CRM
#    Then user enters "priyankak" and "test@123"
#    Then user clicks on Login button
#    Then user is on Home Page
#    Then close the browser
 
# With Examples Keyword   
Scenario Outline: Free CRM Login Test Scenario
 
Given user is already on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is on Home Page
Then close the browser
    
Examples: 
    | username  | password |
    | priyankak | test@123 |
    | naveenk   | test@123 |
    	
#Scenario: User is able to create a new Contact
#    
#    Given user is already on home page
#    When mouse over on Contacts link
#    Then user clicks in new contact link
#    Then user enters firstname and lastname
#    Then user clicks on save button
#    Then verify new contacted created
