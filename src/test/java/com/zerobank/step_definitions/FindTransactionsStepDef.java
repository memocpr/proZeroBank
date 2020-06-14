package com.zerobank.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindTransactionsStepDef {
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        System.out.println("###################################");
    }

    @When("the user enters date range from “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void the_user_enters_date_range_from_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        System.out.println("###################################");
    }

    @Then("results table should only show transactions dates between “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void results_table_should_only_show_transactions_dates_between_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        System.out.println("###################################");
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        System.out.println("###################################");
    }

    @Then("the results table should only not contain transactions dated “{int}-{int}-{int}”")
    public void the_results_table_should_only_not_contain_transactions_dated(Integer int1, Integer int2, Integer int3) {
        System.out.println("###################################");
    }



    @Then("results table should only show descriptions containing “ONLINE” When the user enters description “OFFICE”")
    public void results_table_should_only_show_descriptions_containing_ONLINE_When_the_user_enters_description_OFFICE() {
        System.out.println("###################################");
    }


    @Then("results table should only show descriptions containing “OFFICE” But results table should not show descriptions containing “OFFICE”")
    public void results_table_should_only_show_descriptions_containing_OFFICE_But_results_table_should_not_show_descriptions_containing_OFFICE() {
        System.out.println("###################################");
    }

    @Then("results table should only show descriptions containing “ONLINE” When the user enters description “online”")
    public void results_table_should_only_show_descriptions_containing_ONLINE_When_the_user_enters_description_online() {
        System.out.println("###################################");
    }

    @Then("results table should only show descriptions containing “ONLINE”")
    public void results_table_should_only_show_descriptions_containing_ONLINE() {
        System.out.println("###################################");
    }

    @Given("clicks search")
    public void clicks_search() {
        System.out.println("###################################");
    }

    @Then("results table should show at least one result under Deposit Then results table should show at least one result under Withdrawal When user selects type “Deposit”")
    public void results_table_should_show_at_least_one_result_under_Deposit_Then_results_table_should_show_at_least_one_result_under_Withdrawal_When_user_selects_type_Deposit() {
        System.out.println("###################################");
    }

    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {
        System.out.println("###################################");
    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {
        System.out.println("###################################");
    }

    @When("user selects type “Withdrawal”")
    public void user_selects_type_Withdrawal() {
        System.out.println("###################################");
    }

    @Then("results table should show at least one result under Withdrawal But results table should show no result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Withdrawal_But_results_table_should_show_no_result_under_Deposit() {
        System.out.println("###################################");
    }

}
