package com.cydeo.tests.day03_cssSelector_XPATH;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP3_BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement gmailTag = driver.findElement(By.xpath("//a[@class='gb_n']"));
        gmailTag.click();

        String expectedTitle="Gmail";
        String actualTitle=driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is Passed");
        }else{
            System.out.println("Title verification is Failed");
        }
        driver.navigate().back();
        String expectedTitleG ="Google";
        String actualTitleG= driver.getTitle();

        if(actualTitleG.equals(expectedTitleG)){
            System.out.println("Title verification is passed");
        }else{
            System.out.println("Title verification is Failed");
        }


        driver.close();








    }
}
/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
Expected: Google
 */