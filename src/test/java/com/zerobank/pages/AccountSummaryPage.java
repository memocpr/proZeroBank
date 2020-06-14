package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends BasePage{


    @FindBy(xpath = "//tr/th")
    public List<WebElement> creditAccountColumns;

    @FindBy(css = ".board-header")
    public List<WebElement> accountTypes;



}
