/*
 * This class call to page that we are going to use in this case
 * Send the parameters that will be selected
* */
package com.automation.tests;

import com.automation.pages.DemoPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SeleniumPage extends BaseTest {

    @Test(dataProvider = "days")
    public void pageSelenium(String day){
        DemoPage demoPage= getDemoPage();
        demoPage.dropDownOption(day);

    }
    @DataProvider(name = "days")
    public Object [][] getDays(){
        Object[][] data = new Object[2][1];
        data [0][0] = "Saturday";
        data [1][0] = "Monday";
        return  data;
    }

    @Test(dataProvider = "cities")
    public void PageSelenium2(String city) {
        DemoPage demoPage= getDemoPage();
        demoPage.multiList(city);
    }

    @DataProvider(name = "cities")
    public Object [][] getCities(){
        Object[][] data = new Object[2][1];
        data [0][0] = "California";
        data [1][0] = "Texas";
        return  data;
    }
}
