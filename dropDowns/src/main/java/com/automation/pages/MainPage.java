/*
 * This class is abstract to use with the different pages that we will handle in the automation
 * */
package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class MainPage {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public MainPage(WebDriver pDrive){
        PageFactory.initElements(pDrive,this);
        driver=pDrive;
    }

    protected WebDriver getDriver(){
        return driver;
    }
    public WebDriverWait getWait(){
        WebDriverWait wait= new WebDriverWait(driver,20);
        this.webDriverWait=wait;
        return webDriverWait;
    }

    public void dispose(){
        if(driver!=null){
            driver.quit();
        }
    }
}
