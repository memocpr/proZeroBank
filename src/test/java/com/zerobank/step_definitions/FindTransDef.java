package com.zerobank.step_definitions;

import com.zerobank.pages.AcActivityPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class FindTransDef {

    AcActivityPage acActivityPage=new AcActivityPage();

    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {

        acActivityPage.findTransactions.click();
    }

    @When("the user enters to {string} inputbox {string}")
    public void the_user_enters_to_inputbox(String inputType, String inputStr) {

        acActivityPage.inputBoxes(inputType,inputStr);

    }



    @Then("after click the pay button the results should be displayed between {string} to {string}")
    public void after_click_the_pay_button_the_results_should_be_displayed_between_to(String expectedFromDate, String expectedToDate) {

        acActivityPage.findBtn.click();
        List<String> actualDates = acActivityPage.sortByDate();

        for (String actualDate : actualDates) {

            Integer actualYear = Integer.valueOf(actualDate.substring(0,4));
            Integer expetedFromYear = Integer.valueOf(expectedFromDate.substring(0,4));
            Integer expectedToYear = Integer.valueOf(expectedToDate.substring(0,4));
            Assert.assertTrue("verify date",expetedFromYear<=actualYear && expectedToYear>=actualYear);

            Integer actualMonth = Integer.valueOf(actualDate.substring(5,7));
            Integer expetedFromMonth = Integer.valueOf(expectedFromDate.substring(5,7));
            Integer expectedToMonth = Integer.valueOf(expectedToDate.substring(5,7));
            Assert.assertTrue("verify date",expetedFromMonth<=actualMonth && expectedToMonth>=actualMonth);

            Integer actualDay = Integer.valueOf(actualDate.substring(8));
            Integer expetedFromDay = Integer.valueOf(expectedFromDate.substring(8));
            Integer expectedToDay = Integer.valueOf(expectedToDate.substring(8));
            Assert.assertTrue("verify date",expetedFromDay<=actualDay && expectedToDay>=actualDay);

        }
    }

    @Then("after click the pay button the results should not contain the date {string}")
    public void after_click_the_pay_button_the_results_should_not_contain_the_date(String unexpectedDate) {

        acActivityPage.findBtn.click();

        List<String> actualDates = acActivityPage.sortByDate();

        for (String actualDate : actualDates) {

            Assert.assertFalse("verify date",actualDate.equals(unexpectedDate));
        }


    }



    @When("the user clicks on search button the description should be ontain {string}")
    public void the_user_clicks_on_search_button_the_description_should_be_ontain(String exDesription) {

        acActivityPage.findBtn.click();

        BrowserUtils.waitFor(2);

        for (WebElement description : acActivityPage.desriptions) {

            String acDesription = description.getText();

            Assert.assertTrue(acDesription.contains(exDesription));

            System.out.println(acDesription);

        }

        BrowserUtils.waitFor(4);

    }


    @When("the user select {string} type the result should include {string}")
    public void the_user_select_type_the_result_should_include(String string, String exOption) {
        Select selectType=new Select(acActivityPage.typeDropdown);
        selectType.selectByValue(exOption.toUpperCase());

        acActivityPage.findBtn.click();

        BrowserUtils.waitFor(2);

        Assert.assertTrue(acActivityPage.deposits.size()>=1);

    }



}
