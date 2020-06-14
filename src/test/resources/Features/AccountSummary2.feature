@acx
Feature: Account summary
  Background:
    Given navigate the module to "Account Summary"
    Given the title should be "Zero - Account Summary"



  Scenario: Account types
    Then the page should have to following account types "Credit Accounts"
      | Cash Accounts | Investment Accounts | Credit Accounts | Loan Accounts |
      | Account       | Account             | Account         | Account       |
      |               |                     | Credit Card     |               |
      | Balance       | Balance             | Balance         | Balance       |

