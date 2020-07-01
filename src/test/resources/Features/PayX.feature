@newpayee
Feature: New Payee

  Background:
    Given navigate the module to "Pay Bills"
    Given the title should be "Zero - Pay Bills"

  Scenario: Add new payee
    Given navigate the module to "Add New Payee"
    When creates new payee using following information
      | Payee Name | Payee Address | Account  | Payee Details |
      | Facture    | Delemont      | Checking | XYZ account   |
      | Shopping   | Basel         | Loan     | MC account    |

