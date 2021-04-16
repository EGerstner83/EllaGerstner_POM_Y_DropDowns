/*
 * This class call handle what will be the browser according to the @parameter firefox or chrome
 * */

package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver {

    private WebDriver driver;

    public MyDriver(String browser){
        switch (browser){
        case "firefox":
            System.setProperty("webdriver.gecko.driver","/Users/ella.gerstner/Documents/InstallersJava/drivers/geckodriver");
            driver = new FirefoxDriver();
            break;
        case "chrome":
            System.setProperty("webdriver.chrome.driver","/Users/ella.gerstner/Documents/InstallersJava/drivers/chromedriver");
            driver= new ChromeDriver();
            break;
        default:
            break;
        }

    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
