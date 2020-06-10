package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{


    @FindBy(xpath = "//div/div/div[3]/div/table/thead/tr/th")
    public List<WebElement> creditAccountColumns;

}
