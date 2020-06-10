package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountSummaryStepDef {

    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @Then("the credit accounts table should have to following columns")
    public void the_credit_accounts_table_should_have_to_following_columns(List<String> expectedColumns) {

        List<String> actualColumns=BrowserUtils.getElementsText(accountSummaryPage.creditAccountColumns);

        Assert.assertEquals(expectedColumns,actualColumns);

    }
}
