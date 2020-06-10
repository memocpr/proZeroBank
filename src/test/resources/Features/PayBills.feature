@pay
Feature: Pay Bills

  Background:
    Given navigate the module to "Pay Bills"
    Given the title should be "Zero - Pay Bills"

  Scenario Outline: Payment successfully <payeeType>
    When the user select a "<payeeType>"
    Examples:
      | payeeType       |
      | Sprint          |
      | Bank of America |
      | Apple           |
      | Wells Fargo     |

    