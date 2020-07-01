package com.zerobank.step_definitions;

import com.zerobank.pages.AcActivityPage;
import com.zerobank.pages.AccSumaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AcActivityDef {

    AccSumaryPage accSumaryPage =new AccSumaryPage();

    AcActivityPage acActivityPage =new AcActivityPage();
    Select accountSelect=new Select(acActivityPage.accountDropdown);



    @Then("the dropdown option should be {string}")
    public void the_dropdown_option_should_be(String expectedOption) {

        String actualOption=accountSelect.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedOption,actualOption);
    }


    @Then("Dropdown have following options")
    public void dropdown_have_following_options(List<String> expectedOptions) {

        List<WebElement> actualOptionsEl=accountSelect.getOptions();
        List<String> actualOptions= BrowserUtils.getElementsText(actualOptionsEl);

        Assert.assertEquals(expectedOptions,actualOptions);

    }


    @Then("account dropdown have following options {string}")
    public void account_dropdown_have_following_options(String expectedOptions) {
        accountSelect.selectByVisibleText(expectedOptions);
    }

    @Then("the table should have column names")
    public void theTableShouldHaveColumnNames(List<String> expectedColumns) {

        List<String> actualColumns = acActivityPage.getColumnNames();

        Assert.assertEquals(expectedColumns,actualColumns);

    }

    @Then("account dropdown should have {string} option selected")
    public void account_dropdown_should_have_option_selected(String expectedOption) {

        String actualOption=accountSelect.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedOption,actualOption);
    }



}
