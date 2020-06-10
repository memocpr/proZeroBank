package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){PageFactory.initElements(Driver.get(),this);}
    WebDriver driver=Driver.get();

    @FindBy(id = "signin_button")
    public WebElement firstSignIn;

    @FindBy(id = "user_login")
    public WebElement usernameInput;

    @FindBy(id = "user_password")
    public WebElement passswordInput;

    @FindBy(css = "input[value='Sign in']")
    public WebElement signInBtn;


    public void signIn(){
        driver.get(ConfigurationReader.get("url"));
        driver.manage().window().maximize();
        firstSignIn.click();
    }

    public void loginDirect(){
        String usernameStr = ConfigurationReader.get("username");
        String passwordStr = ConfigurationReader.get("password");
        usernameInput.sendKeys(usernameStr);
        passswordInput.sendKeys(passwordStr);
        signInBtn.click();
    }

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passswordInput.sendKeys(password);
        signInBtn.click();
    }


}
