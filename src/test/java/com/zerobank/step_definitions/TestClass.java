package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestClass {

    @Test

    public void test() throws InterruptedException {

        LoginPage loginPage=new LoginPage();
        WebDriver driver= Driver.get();

        loginPage.signIn();
        loginPage.loginDirect();

//================================================================

        new HomePage().navigateToModule("Account Activity");

//================================================================






//================================================================

        driver.quit();
    }


}
