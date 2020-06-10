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
