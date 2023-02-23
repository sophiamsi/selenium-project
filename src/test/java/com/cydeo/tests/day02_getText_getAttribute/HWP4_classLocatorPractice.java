package com.cydeo.tests.day02_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP4_classLocatorPractice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/inputs");
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

     String expectedTitle ="Practice";
     String actualTitle= driver.getTitle();
     if(actualTitle.equals(expectedTitle)){
         System.out.println("Title verification is Passed");
     }else{
         System.out.println("Title verification is Failed");
     }

driver.close();

    }
}
/*
TC #4: Practice Cydeo – Class locator practice
1- Open a Chrome browser
2- Go to: https://practice.cydeo.com/inputs
3- Click to “Home” link
4- Verify title is as expected:
Expected: Practice
PS: Locate “Home” link using “className” locator
 */