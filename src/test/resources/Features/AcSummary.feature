@accountSum
Feature: Account summary

  Background:
    Given navigate the module to "Account Summary"
    Given the title should be "Zero - Account Summary"

  Scenario: Account type
    Then the page should have to following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: Credit accounts table
    Then the credit accounts table should have to following columns
      | Account     |
      | Credit Card |
      | Balance     |


  Scenario Outline: <accountLink> account redirect
    When the user clicks on "<accountLink>"
    Then the title should be "Zero - Account Activity"
    And account dropdown should have "<accountType>" option selected
    Examples:
      | accountLink | accountType |
      | Savings     | Savings     |
      | Checking    | Checking    |
      | Loan        | Loan        |
      | Credit Card | Credit Card |
      | Brokerage   | Brokerage   |

