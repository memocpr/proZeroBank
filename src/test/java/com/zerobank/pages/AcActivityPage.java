package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AcActivityPage extends BasePage {


    @FindBy(css = "select[id*='_account']")
    public WebElement accountDropdown;

    @FindBy(xpath = "//th")
    public List<WebElement> tableColumns;


    @FindBy(xpath = "//*[@id=\"filtered_transactions_for_account\"]/table/tbody/tr/td[2]")
    public List<WebElement> desriptions;

    @FindBy(xpath = "//a[.='Find Transactions']")
    public WebElement findTransactions;


    @FindBy(id = "aa_type")
    public WebElement typeDropdown;


    @FindBy(xpath = "//*[@id=\"filtered_transactions_for_account\"]/table/tbody/tr/td[3]")
    public List<WebElement> deposits;




    public List<String> getColumnNames(){

       return BrowserUtils.getElementsText(tableColumns);
    }

    public void inputBoxes(String inputType, String inputStr){

        String pathInput="#aa_"+inputType;

        Driver.get().findElement(By.cssSelector(pathInput)).clear();

        Driver.get().findElement(By.cssSelector(pathInput)).sendKeys(inputStr);
    }

    @FindBy(xpath = "//button[.='Find']")
    public WebElement findBtn;


    public List<String> sortByDate(){

        List<WebElement> dates = Driver.get().findElements(By.xpath("//div[2]/div[2]/table/tbody/tr/td[1]"));

        List<String> dateList = BrowserUtils.getElementsText(dates);

        return dateList;

    }

}
