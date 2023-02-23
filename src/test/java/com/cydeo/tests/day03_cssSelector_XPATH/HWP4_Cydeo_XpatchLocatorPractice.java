package com.cydeo.tests.day03_cssSelector_XPATH;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP4_Cydeo_XpatchLocatorPractice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/inputs");

        WebElement HomeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        HomeLink.click();

        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is Failed");
        }



    }
}
