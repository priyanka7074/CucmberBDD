@FunctionalTest
Feature: Free CRM application testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given This is a valid login test

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test case

@SmokeTest @RegressionTest
Scenario: Create a deal
Given This is a deal test case

@RegressionTest
Scenario: Create a task
Given This is a task test case

@SmokeTest
Scenario: Create a case
Given This is a case test case

@SmokeTest @RegressionTest
Scenario: Verify left panel links
Given Clicking on left panel links

@SmokeTest
Scenario: Search a deal
Given This is a search deal test case

@SmokeTest
Scenario: Search a contact
Given This is a search contact test case

@SmokeTest @RegressionTest
Scenario: Search a case
Given This is a search case test case

@SmokeTest @RegressionTest
Scenario: Search a task
Given This is a search task test case

@SmokeTest @End2End
Scenario: Search a call
Given This is a search call test case

@SmokeTest @End2End
Scenario: Search an email
Given This is a search email test case

@SmokeTest @End2End
Scenario: Search a docs
Given This is a search docs test case

@SmokeTest @End2End
Scenario: Search a form
Given This is a search forms test case

@End2End
Scenario: Validate a report
Given This is a report test case

@End2End
Scenario: Application logout
Given This is a logout test case

Scenario: Close browser
Given This is a close browser test case



