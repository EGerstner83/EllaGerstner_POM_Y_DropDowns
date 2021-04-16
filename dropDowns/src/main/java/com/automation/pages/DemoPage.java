/*
 * This class is the controller of the pages of the project, in this case we only have on page
 * */
package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoPage extends MainPage{

    WebDriver driver;

    public DemoPage(WebDriver driver) {
        super(driver);
        this.driver =driver;
    }

    public void dropDownOption(String busqueda) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("select-demo")));
        Select lista = new Select(driver.findElement(By.id("select-demo")));
        lista.selectByVisibleText(busqueda);
        String result = driver.findElement(By.className("selected-value")).getText();
        String day = result.substring(16);
        Assert.assertEquals(busqueda, day);
    }

    public void multiList(String city) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("multi-select")));
      /*  Select multi = new Select(driver.findElement(By.id("multi-select")));
       multi.selectByVisibleText(city);*/
        WebElement mySelectElement = driver.findElement(By.id("multi-select"));
        Select dropdown= new Select(mySelectElement);
        dropdown.selectByValue(city);
        String st = dropdown.getFirstSelectedOption().getText();
        System.out.println("Lo que se tiene seleccionado: "+st);
        driver.findElement(By.id("printMe")).click();
        String result = driver.findElement(By.className("getall-selected")).getText();
        String day = result.substring(27);
        Assert.assertEquals(city, day);
    }


}
