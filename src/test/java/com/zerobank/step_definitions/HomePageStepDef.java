package com.zerobank.step_definitions;

import com.zerobank.pages.HomePage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class HomePageStepDef {

    HomePage homePage=new HomePage();

    @Then("the page should have to following account types")
    public void the_page_should_have_to_following_account_types(List<String> expectedAccountTypes) {

        //with ready methods which come from BrowserUtils Class we initialize webelements from List<WebElement> to List<String>
        List<String> actualAccountTypes= BrowserUtils.getElementsText(homePage.accountTypes);

        Assert.assertEquals(expectedAccountTypes,actualAccountTypes);
    }


    @Given("navigate the module to {string}")
    public void navigate_the_module_to(String moduleStr) {
        homePage.navigateToModule(moduleStr);
    }
}
