package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.util.List;

public abstract class BasePage {

    public BasePage(){ PageFactory.initElements(Driver.get(),this);}
    WebDriver driver=Driver.get();

    public void navigateToModule(String tab){

        String tabLocator="//a[normalize-space()='"+tab+"']";

        driver.findElement(By.xpath(tabLocator)).click();


    }

}
