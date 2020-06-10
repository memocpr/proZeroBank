package com.zerobank.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseForeignCurrencyStepDef {



    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
        System.out.println("###################################");
    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        System.out.println("###################################");
    }

    @Then("error message should be displayed Scenario: Error message for not entering value")
    public void error_message_should_be_displayed_Scenario_Error_message_for_not_entering_value() {
        System.out.println("###################################");
    }

    @Given("the user accesses the Purchase foreign currency cash tab When user tries to calculate cost without entering a value Then error message should be displayed")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab_When_user_tries_to_calculate_cost_without_entering_a_value_Then_error_message_should_be_displayed() {
        System.out.println("###################################");
    }


}
