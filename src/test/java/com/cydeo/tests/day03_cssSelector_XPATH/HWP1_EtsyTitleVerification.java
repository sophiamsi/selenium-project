package com.cydeo.tests.day03_cssSelector_XPATH;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP1_EtsyTitleVerification {
    public static void main(String[] args) {
//HWP #1: Etsy Title Verification
//1. Open Chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
 //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com/");
     WebElement searchButton = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));

//3. Search for “wooden spoon”
        searchButton.sendKeys("wooden spoon"+ Keys.ENTER);
//4. Verify title:
//Expected: “Wooden spoon - Etsy"

        String expectedTitle= "Wooden spoon - Etsy";
       String actualResults= driver.getTitle();
       if(actualResults.equals(expectedTitle)){
           System.out.println("Passed");
       }else{
           System.out.println("Failed");
       }


    }
}
/*
HWP #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon - Etsy"
 */