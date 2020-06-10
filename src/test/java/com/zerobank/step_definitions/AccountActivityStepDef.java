package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityStepDef {

    AccountActivityPage accountActivityPage=new AccountActivityPage();
    Select accountDD=new Select(accountActivityPage.accountDropdown);


    @Then("the dropdown option should be {string}")
    public void the_dropdown_option_should_be(String expectedOption) {

        String actualOption=accountDD.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption,actualOption);
    }

    @Then("Dropdown have following options")
    public void dropdown_have_following_options(List<String> expectedOptions) {

        List<WebElement> actualOptionsEl=accountDD.getOptions();
        List<String> actualOptions= BrowserUtils.getElementsText(actualOptionsEl);

        Assert.assertEquals(expectedOptions,actualOptions);

    }




    @Then("account dropdown have following options {string}")
    public void account_dropdown_have_following_options(String expectedOptions) {

        accountDD.selectByVisibleText(expectedOptions);


    }

    @When("payee dropdown have following options {string}")
    public void payee_dropdown_have_following_options(String options) {
        Select payeeDD=new Select(accountActivityPage.payeeDropdown);
        payeeDD.selectByVisibleText(options);



    }




}
