package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {


    @FindBy(css = "#aa_accountId")
    public WebElement accountDropdown;

    @FindBy(xpath = "//div[2]/table/thead/tr/th")
    public List<WebElement> tableColumns;

    @FindBy(css = "#sp_payee")
    public WebElement payeeDropdown;

}
