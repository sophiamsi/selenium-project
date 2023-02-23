package com.cydeo.tests.day03_cssSelector_XPATH;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP2_ZeroBankVerification {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement bankHeader = driver.findElement(By.xpath("//h3"));

        String expectedHeader="Log in to ZeroBank";
        String actualHeader =bankHeader.getText();//getting value from the bankHeader
        if(actualHeader.equals(expectedHeader)){
            System.out.println("test Passed");
        }else{
            System.out.println("test FAILED");
        }





    }
}
/*
HWP #2: Zero Bank header verification
1. Open Chrome browser
2. Go to http://zero.webappsecurity.com/login.html
3. Verify header text
Expected: “Log in to ZeroBank”
 */