@login
Feature:Login
  Background:
    Given the user is on the Login page

  Scenario: Login with valid credentials
    When the user enter "username" and "password"
    Then the title should be "Zero - Account Summary"


  Scenario: Login with invalid username
    When the user enter "usernameX" and "password"
    Then the message:Login and/or password are wrong should be displayed

  Scenario: Login with invalid password
    When the user enter "username" and "passwordX"
    Then the message:Login and/or password are wrong should be displayed