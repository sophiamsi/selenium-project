package com.cydeo.tests.day02_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hwp1_Eatsy_Search_Title {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");
// in order to type something we need to locate search box:
 //input id - is unigue, so we can use it
WebElement etsySearchBox=   driver.findElement(By.id("global-enhancements-search-query"));

        etsySearchBox.sendKeys("wooden spoon"+Keys.ENTER);

String expectedResult="wooden spoon";
String actualResult=driver.getTitle();

if(actualResult.equals(expectedResult)){
    System.out.println("Title verification is Passed ");
}else {
    System.out.println("Title verification is Passed ");
}
driver.close();


    }
}
/*
HWP #1: Etsy Title Verification
1. Open Chrome browser
2. Go to https://www.etsy.com
3. Search for “wooden spoon”
4. Verify title:
Expected: “Wooden spoon - Etsy”
 */