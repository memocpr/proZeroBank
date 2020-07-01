package com.zerobank.step_definitions;

import com.zerobank.pages.AcActivityPage;
import com.zerobank.pages.PayPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class PayDef {


    PayPage payPage =new PayPage();
    Select payeeSelect=new Select(payPage.payeeDropdown);

    AcActivityPage acActivityPage =new AcActivityPage();
    Select accountSelect=new Select(acActivityPage.accountDropdown);


    @When("the user select a {string}")
    public void the_user_select_a(String expectedOptions) {

        payeeSelect.selectByVisibleText(expectedOptions);

    }

    //======================================



    @When("the user select a {string} and {string}")
    public void the_user_select_a_and(String expectedPayee, String expectedAccount) {

        payeeSelect.selectByVisibleText(expectedAccount);
        accountSelect.selectByVisibleText(expectedAccount);
    }


    @When("the user enter amount {int}")
    public void the_user_enter_amount(Integer amountInt) {
        String amountStr = amountInt.toString();

        payPage.inputBoxes("amount").sendKeys(amountStr);

    }

    @When("the user enter date {int}-{int}-{int}")
    public void the_user_enter_date(Integer year, Integer month, Integer day) {
        String dateStr = year.toString()+month.toString()+day.toString();

        payPage.inputBoxes("date").sendKeys(dateStr);

    }


    @And("the user enters description {string}")
    public void theUserEntersDescription(String description)  {

        payPage.inputBoxes("description").sendKeys(description+Keys.ENTER);

    }

    @Then("the message should be shown {string}")
    public void theMessageShouldBeShown(String expectedMessage) {

        String actualMessage = payPage.successMessage.getText();

        Assert.assertEquals(expectedMessage,actualMessage);

    }


  /*  @Then("the alert should be displayed \\{string}")
    public void theAlertShouldBeDisplayedString(String expectedAlert) {

*//*
    Driver.get().switchTo().activeElement().getAttribute("")
*//*

    }*/

    @When("the user enter the variable {string} and {string}")
    public void the_user_enter_the_variable_and(String amount, String date) {

        payPage.inputBoxes("amount").sendKeys(amount);

        payPage.inputBoxes("date").sendKeys(date);

    }

    @Then("the alert should be displayed {string}")
    public void the_alert_should_be_displayed(String expectedAlert) {

        payPage.payBtn.click();

        String actualAlert = Driver.get().switchTo().activeElement().getAttribute("validationMessage");

        Assert.assertEquals(expectedAlert,actualAlert);



    }


}
