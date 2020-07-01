package com.zerobank.step_definitions;

import com.zerobank.pages.PurForeignPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PurForeignDef {

    PurForeignPage purForeignPage=new PurForeignPage();


    @Then("following currencies should be available")
    public void following_currencies_should_be_available(DataTable dataTable) {

        BrowserUtils.waitFor(2);

        Select select=new Select(purForeignPage.currencyDropdown);

        BrowserUtils.waitFor(2);

        List<WebElement> list = select.getOptions();

        List<String> acOptions = BrowserUtils.getElementsText(list);


        List<Object> exOptions = dataTable.asList(String.class);

        System.out.println(exOptions);

        for (Object exOption : exOptions) {

            Assert.assertTrue(acOptions.contains(exOption));
        }
    }

    @When("user select {string} of currency")
    public void user_select_of_currency(String exOption) {
        BrowserUtils.waitFor(1);
        Select select=new Select(purForeignPage.currencyDropdown);
        select.selectByVisibleText(exOption);
        BrowserUtils.waitFor(1);
    }


    @When("user enter {double} of amount")
    public void user_enter_of_amount(Double amount) {
        BrowserUtils.waitFor(1);
        purForeignPage.amountInput.sendKeys(amount.toString());
    }

    @When("user click on U.S.dollar\\(USA) radio button")
    public void user_click_on_U_S_dollar_USA_radio_button() {
        BrowserUtils.waitFor(1);
        purForeignPage.dolarTrueRadio.click();
    }

    @Then("error message should be displayed {string}")
    public void error_message_should_be_displayed(String exMessage) {
        purForeignPage.calulateBtn.click();

        Alert alert = Driver.get().switchTo().alert();

        String acMessage = alert.getText();

        Assert.assertEquals(exMessage,acMessage);

        BrowserUtils.waitFor(6);

    }

}
