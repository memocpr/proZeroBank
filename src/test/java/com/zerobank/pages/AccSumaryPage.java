package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccSumaryPage extends BasePage{


    @FindBy(xpath = "//tr/th")
    public List<WebElement> creditAccountColumns;

    @FindBy(css = ".board-header")
    public List<WebElement> accountTypes;

    public void accountActivityNavigate(String accountLink){

        String linkPath="//a[.='"+accountLink+"']";

        Driver.get().findElement(By.xpath(linkPath)).click();

    }



}
