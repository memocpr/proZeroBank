package com.zerobank.step_definitions;


import com.zerobank.pages.PayPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PayXDef {

    PayPage payPage=new PayPage();

    @When("creates new payee using following information")
    public void creates_new_payee_using_following_information(DataTable payTable) {

        List<Map<String, String>> mapList=payTable.asMaps(String.class,String.class);

//        System.out.println(mapList.get(0).keySet());            //[Payee Name, Payee Address, Account, Payee Details]
//        System.out.println(mapList.size());                     //2
//        System.out.println(mapList.get(1).get("Payee Address"));//Basel

        BrowserUtils.waitFor(2);

        for (int i = 0; i < mapList.size(); i++) {

            payPage.payeeName.clear();
            payPage.payeeName.sendKeys(mapList.get(i).get("Payee Name"));
            BrowserUtils.waitFor(1);

            payPage.payeeAddress.clear();
            payPage.payeeAddress.sendKeys(mapList.get(i).get("Payee Address"));
            BrowserUtils.waitFor(1);

            payPage.payeeAcount.clear();
            payPage.payeeAcount.sendKeys(mapList.get(i).get("Account"));
            BrowserUtils.waitFor(1);

            payPage.payeeDetails.clear();
            payPage.payeeDetails.sendKeys(mapList.get(i).get("Payee Details"));
            BrowserUtils.waitFor(1);

            payPage.newPayeeBtn.sendKeys(Keys.COMMAND,Keys.ENTER);
            BrowserUtils.waitFor(1);
        }

        Set<String> handles = Driver.get().getWindowHandles();

        Iterator<String> iterator = handles.iterator();

        while (iterator.hasNext()){
            Driver.get().switchTo().window(iterator.next());
            System.out.println(payPage.successMessage.getText());
            Driver.get().close();
        }


    }


}
