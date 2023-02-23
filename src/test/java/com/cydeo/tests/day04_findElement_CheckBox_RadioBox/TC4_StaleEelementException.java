package com.cydeo.tests.day04_findElement_CheckBox_RadioBox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TC4_StaleEelementException {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://practice.cydeo.com/abtest");
        WebElement cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("Before refresh: cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());
//4- Refresh the page.
driver.navigate().refresh();
        System.out.println("Refresh the page...");
     //   5- Verify it is displayed, again.


         cydeoLink = driver.findElement(By.xpath("//a[.='CYDEO']"));//StaleElementReferenceException will be thrown
        //if we do not use line above. We are resigning value.Will relocate the Web element .
        //refresh the connection to the new element reference
        System.out.println("After refresh: cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

driver.close();
    }

}
/*
TC #4: StaleElementReferenceException Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate “CYDEO” link, verify it is displayed.
4- Refresh the page.
5- Verify it is displayed, again.

This is a simple StaleElementReferenceException to understand what is
this exception and how to handle it.

 */