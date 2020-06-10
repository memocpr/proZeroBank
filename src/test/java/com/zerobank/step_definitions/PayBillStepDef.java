package com.zerobank.step_definitions;

import com.zerobank.pages.PayBillPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PayBillStepDef {


   /* PayBillPage payBillPage=new PayBillPage();
    Select payeeSelect=new Select(payBillPage.payeeDropdown);*/



    @When("the user select a {string}")
    public void the_user_select_a(String selectedPayee) {

        String xpathPayee="//option[.='"+selectedPayee+"']";

        WebElement payeeElement = Driver.get().findElement(By.xpath(xpathPayee));

        System.out.println("payeeElement.getText() = " + payeeElement.getText());


    }

}
