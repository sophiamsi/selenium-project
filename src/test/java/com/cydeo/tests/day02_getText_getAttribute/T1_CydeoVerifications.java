package com.cydeo.tests.day02_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) throws InterruptedException {

/*
TC #1 : Cydeo practice tool verifications
1.Open Chrome browser
2.Go to https://practice.cydeo.com
3.Verify Url contains
// Expected: cydeo
4. Verify title:
Expected :Practice
*/
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://practice.cydeo.com");

        String expectedInURL="cydeo";
        String actualUrl = driver.getCurrentUrl();// return current URL as a String
if(actualUrl.contains(expectedInURL)){
    System.out.println("URL verification Passed");
}else{
    System.out.println("URL verification Failed ");
}
String expectedTitle = "Practice";
String actualTitle = driver.getTitle();
if(expectedTitle.equals(actualTitle)){
    System.out.println("Title verification Passed");
}else{
    System.out.println("Title verification Failed");
}

driver.close();
    }


}
