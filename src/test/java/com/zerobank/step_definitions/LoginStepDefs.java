package com.zerobank.step_definitions;


import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginStepDefs {

    // BEFORE RUN COMMIT THE LOGIN METHODS IN THE HOOKS !!!

    LoginPage loginPage=new LoginPage();

    @Given("the user is on the Login page")
    public void the_user_is_on_the_Login_page()  {

        loginPage.signIn();
    }

    @When("the user enter {string} and {string}")
    public void the_user_enter_and(String usernameStr, String passwordStr){

        loginPage.login(usernameStr,passwordStr);
    }

    @Then("the title should be {string}")
    public void the_title_should_be(String expectedTitle) {
        Assert.assertEquals(expectedTitle,Driver.get().getTitle());
    }

    @Then("the message:Login and\\/or password are wrong should be displayed")
    public void theMessageLoginAndOrPasswordAreWrongShouldBeDisplayed() {

        WebElement alert = Driver.get().findElement(By.xpath("//div[normalize-space()='Login and/or password are wrong.']"));
        String actualMessage=alert.getText();
        String expectedMessage="Login and/or password are wrong.";
        Assert.assertEquals(expectedMessage,actualMessage);
    }
}
