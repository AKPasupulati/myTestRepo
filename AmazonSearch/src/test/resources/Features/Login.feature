@Run
Feature: As a user , i  would like to test Login functionality


Scenario: User enters incorrect credentials

Given user is on the login page
When  user enters invalid username and invalid password
And  user click on login button
Then  user validates the error message ""

Scenario: User enters correct username and wrong password

Given user is on the login page
When  user enters valid username and invalid password
When  user click on login button
Then  user validates the error message ""

Scenario: User enters correct username and correct password

Given user is on the login page
When  user enters valid username and valid password
When  user click on login button
Then  user validates the homepage