package com.cydeo.tests.day05_DynamicWebElements_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TC2_Radiobutton_handling {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://practice.cydeo.com/radio_buttons");
//3. Click to “Hockey” radio button
        WebElement hockeyRadioB = driver.findElement(By.xpath("//input[@id='hockey']"));

hockeyRadioB.click();


//4. Verify “Hockey” radio button is selected after clicking
if(hockeyRadioB.isSelected()){
    System.out.println("Button is  selected. Verification is passed");
}else{
    System.out.println("Button is not selected. Verification  FAILED ");
}


    }
}
/*
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #2: Radiobutton handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */