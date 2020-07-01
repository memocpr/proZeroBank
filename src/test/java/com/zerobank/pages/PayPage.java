package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayPage extends BasePage {

    @FindBy(css = "#sp_payee")
    public WebElement payeeDropdown;


    public WebElement inputBoxes(String inputName){

        String inputPath="//input[contains(@id,'"+inputName+"')]";

        WebElement inputElement = Driver.get().findElement(By.xpath(inputPath));

        return inputElement;
    }


    @FindBy(css = "#pay_saved_payees")
    public WebElement payBtn;

    @FindBy(css = "#alert_content")
    public WebElement successMessage;


    @FindBy(css = "#np_new_payee_name")
    public WebElement payeeName;

    @FindBy(css = "#np_new_payee_address")
    public WebElement payeeAddress;

    @FindBy(css = "#np_new_payee_account")
    public WebElement payeeAcount;

    @FindBy(css = "#np_new_payee_details")
    public WebElement payeeDetails;

    @FindBy(css = "#add_new_payee")
    public WebElement newPayeeBtn;




}
