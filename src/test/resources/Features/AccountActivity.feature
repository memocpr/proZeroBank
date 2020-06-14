@accountAc
Feature: Account activity

  Background:
    Given navigate the module to "Account Activity"
    Given the title should be "Zero - Account Activity"

  Scenario: Dropdown default option
    Then the dropdown option should be "Savings"


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


  Scenario: verify column names
    Then the table should have column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |







