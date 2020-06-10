package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    LoginPage loginPage=new LoginPage();

    @Before
    public void setUp(){

        loginPage.signIn();
        loginPage.loginDirect();
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){

            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
        Driver.closeDriver();
    }




    //We have also custom hooks that is running if we have same tag on top of scenarios.
    @Before("@db")
    public void setUpDb(){

        System.out.println("\t connecting @db : database...");
    }

    @After("@db")
    public void tearDownDb(){

        System.out.println("\t disconnecting @db : database...\n");
    }

}
