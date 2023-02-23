package com.cydeo.tests.day02_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_ZeroBank_header_verification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://zero.webappsecurity.com/login.html");
        WebElement headerName = driver.findElement(By.tagName("h3"));

        String expectedHeader="Log in to ZeroBank";
        String actualHeader= headerName.getText();
        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header verification is passed");
        }else{
            System.out.println("Header verification is failed");
        }





    }
}
