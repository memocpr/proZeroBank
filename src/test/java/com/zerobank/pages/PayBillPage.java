package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillPage extends BasePage {

    @FindBy(css = "#sp_payee")
    public WebElement payeeDropdown;


    public WebElement inputBoxes(String inputName){

        String inputCss="input[id='sp_"+inputName+"']";

        WebElement inputElement = Driver.get().findElement(By.cssSelector(inputCss));

        return inputElement;
    }


    @FindBy(css = "#pay_saved_payees")
    public WebElement payBtn;

    @FindBy(css = "#alert_content")
    public WebElement successMessage;



}
