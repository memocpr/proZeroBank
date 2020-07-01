package com.zerobank.step_definitions;

import com.zerobank.pages.AccSumaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AcSummaryDef {

    AccSumaryPage accSumaryPage =new AccSumaryPage();

    @Then("the credit accounts table should have to following columns")
    public void the_credit_accounts_table_should_have_to_following_columns(List<String> expectedColumns) {

        List<String> actualColumns=BrowserUtils.getElementsText(accSumaryPage.creditAccountColumns);

        Assert.assertEquals(expectedColumns,actualColumns);

    }

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String accountLink) {

        accSumaryPage.accountActivityNavigate(accountLink);

        BrowserUtils.waitFor(4);

    }
}
