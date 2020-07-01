package com.zerobank.step_definitions;



import com.zerobank.pages.AccSumaryPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AcSummaryDef2 {

    AccSumaryPage accSumaryPage =new AccSumaryPage();

    @Then("the page should have to following account types {string}")
    public void the_page_should_have_to_following_account_typesXXXXX(String accountType, DataTable dataTable) {

        List<Map<String,String>> mapsAccount=dataTable.asMaps(String.class, String.class);

        Set<String> expectedSet = mapsAccount.get(0).keySet();
        List<String> expectedList = new ArrayList<>();

        for (String s : expectedSet) {
            expectedList.add(s);
        }

        // 2. Step
        List<String> actualList= BrowserUtils.getElementsText(accSumaryPage.accountTypes);
        Assert.assertEquals(expectedList,actualList);

        //3.Step
        List<String> expectedColumns=new ArrayList<>();
        for (int i = 0; i < mapsAccount.size(); i++) {
             expectedColumns.add(mapsAccount.get(i).get(accountType));
        }
        List<String> actualColumns=BrowserUtils.getElementsText(accSumaryPage.creditAccountColumns);


        Assert.assertEquals(expectedColumns,actualColumns);


    }






}
