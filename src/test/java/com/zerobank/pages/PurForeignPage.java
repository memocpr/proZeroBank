package com.zerobank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurForeignPage extends BasePage{

    @FindBy(id = "pc_currency")
    public WebElement currencyDropdown;

    @FindBy(id = "pc_amount")
    public WebElement amountInput;

    @FindBy(id = "pc_calculate_costs")
    public WebElement calulateBtn;

    @FindBy(id = "pc_inDollars_true")
    public WebElement dolarTrueRadio;

    @FindBy(id = "pc_inDollars_false")
    public WebElement dolarFalseRadio;

}
