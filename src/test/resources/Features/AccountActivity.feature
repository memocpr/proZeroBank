@accountAc
Feature: Account activity

  Background:
    Given navigate the module to "Account Activity"
    Given the title should be "Zero - Account Activity"

  Scenario: Dropdown default option
    Then the dropdown option should be "Savings"

  @wip
  Scenario Outline: Account dropdown options <accountType>
    Then account dropdown have following options "<accountType>"
    Examples:
      | accountType |
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |


  Scenario Outline: Payee dropdown options <payeeType>
    When  payee dropdown have following options "<payeeType>"
    Examples:
      | payeeType       |
      | Sprint          |
      | Bank of America |
      | Apple           |
      | Wells Fargo     |





