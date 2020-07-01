@trans
Feature: Find Transactions in Account Activity
  Background:
    Given navigate the module to "Account Activity"
    Given the title should be "Zero - Account Activity"
    Given the user accesses the Find Transactions tab


  Scenario: Search date range
    When the user enters to "fromDate" inputbox "2012-09-01"
    When the user enters to "toDate" inputbox "2012-09-06"
    Then after click the pay button the results should be displayed between "2012-09-01" to "2012-09-06"

    When the user enters to "fromDate" inputbox "2012-09-02"
    When the user enters to "toDate" inputbox "2012-09-06"
    Then after click the pay button the results should not contain the date "2012-09-01"


    Scenario: Description
      When the user enters to "description" inputbox "ONLINE"
      When the user clicks on search button the description should be ontain "ONLINE"
      When the user enters to "description" inputbox "OFFICE"
      When the user clicks on search button the description should be ontain "OFFICE"


  Scenario: Type
    When the user select "Deposit" type the result should include "Deposit"
    And the user select "Withdrawal" type the result should include "Withdrawal"









