Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact Scenario
Given user is already on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is on Home Page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
      | username  | password | firstname | lastname | position |
      | priyankak | test@123 | Geeta     | Reddy    | Manager  |
      | priyankak | test@123 | David     | Dsouza   | Director |
