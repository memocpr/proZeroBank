@currency
Feature: Purchase Foreign Currency

  Background:
    Given navigate the module to "Pay Bills"
    Given the title should be "Zero - Pay Bills"

  Scenario:Available currencies
    Given navigate the module to "Purchase Foreign Currency"
    Then following currencies should be available
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Singapore (dollar)    |

  @wip
  Scenario:Not selecting currency
    Given navigate the module to "Purchase Foreign Currency"
    When user enter 200.00 of amount
    And user click on U.S.dollar(USA) radio button
    Then error message should be displayed "Please, ensure that you have filled all the required fields with valid values."



  Scenario:Not entering value
    Given navigate the module to "Purchase Foreign Currency"
    When user select "China (yuan)" of currency
    And user click on U.S.dollar(USA) radio button
    Then error message should be displayed "Please, ensure that you have filled all the required fields with valid values."

