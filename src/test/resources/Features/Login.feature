@login
Feature:Login

  Background:
    Given the user is on the Login page

  Scenario: Login with valid credentials
    When the user enter "username" and "password"
    Then the title should be "Zero - Account Summary"


  Scenario Outline: Login with in valid credential <invalidType>
    When user enter following credendial "<username>" and "<password>"
    Then the message:Login or password are wrong should be displayed
    Examples:
      | username  | password  | invalidType      |
      | usernameX | password  | invalid username |
      | username  | passwordX | invalid password |