@pay
Feature: Pay Bills

  Background:
    Given navigate the module to "Pay Bills"
    Given the title should be "Zero - Pay Bills"

  Scenario Outline: Payment successfully <payeeType> / <accountType>
    When the user select a "<payeeType>"
    And account dropdown have following options "<accountType>"
    And the user enter amount 200
    And the user enter date 2020-06-11
    And the user enters description "online"
    Then the message should be shown "The payment was successfully submitted."

    Examples:
      | payeeType       | accountType |
      | Sprint          | Savings     |
      | Sprint          | Checking    |
      | Sprint          | Loan        |
      | Sprint          | Credit Card |
      | Sprint          | Brokerage   |
      | Bank of America | Savings     |
      | Bank of America | Checking    |
      | Bank of America | Loan        |
      | Bank of America | Credit Card |
      | Bank of America | Brokerage   |
      | Apple           | Savings     |
      | Apple           | Checking    |
      | Apple           | Loan        |
      | Apple           | Credit Card |
      | Apple           | Brokerage   |
      | Wells Fargo     | Savings     |
      | Wells Fargo     | Checking    |
      | Wells Fargo     | Loan        |
      | Wells Fargo     | Credit Card |
      | Wells Fargo     | Brokerage   |

  @wip
  Scenario Outline: Unsuccesful payment <invalidType>
    When the user enter the variable "<amount>" and "<date>"
    Then the alert should be displayed "Please fill in this field."

    Examples:
      | amount | date       | invalidType                 |
      | 200    | abc        | alphapechic in data         |
      | 200    | $          | special character in data   |
      | 200    |            | empty in data               |
      | abc    | 2020-07-11 | alphapechic in amount       |
      | $      | 2020-07-11 | special character in amount |
      |        | 2020-07-11 | alphapechic in amount       |


