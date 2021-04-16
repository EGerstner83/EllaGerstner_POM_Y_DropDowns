/*
 * This class goes up the page that we will automated
 * */
package com.automation.tests;

import com.automation.pages.DemoPage;
import com.automation.utils.MyDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class BaseTest {
    MyDriver myDriver;
    WebDriver driver;

    private DemoPage demoPage;
@BeforeSuite(alwaysRun = true)
@Parameters({"browser"})
    public void OpenBrowser(String browser){
        myDriver=new MyDriver(browser);
        driver = myDriver.getDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        demoPage = new DemoPage(driver);
 }
 @AfterSuite(alwaysRun = true)
 public void CloseBrowser(){
    demoPage.dispose();
 }
 public DemoPage getDemoPage(){
        return demoPage;
 }
}
