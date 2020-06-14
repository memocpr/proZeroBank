package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.PayBillPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TestClass {

    @Test

    public void test() throws InterruptedException {

        LoginPage loginPage=new LoginPage();
        WebDriver driver= Driver.get();

        loginPage.signIn();
        loginPage.loginDirect();
//================================================================



        new HomePage().navigateToModule("Pay Bills");

        //================================================================



//================================================================
        driver.quit();
    }
}
