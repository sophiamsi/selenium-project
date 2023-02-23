package com.cydeo.tests.day05_DynamicWebElements_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC5_dropdown_intro {
    WebDriver driver;

 @BeforeMethod
 public void setup(){
     driver = WebDriverFactory.getDriver("chrome");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://practice.cydeo.com/dropdown");
 }
@Test
    public void simple_dropdown_test(){
    WebElement simpleDropdown =(driver.findElement(By.xpath("//select[@id='dropdown']")));
    Select select =new Select(simpleDropdown);

String expectedDefaultValue ="Please select an option";
//return webelement not text in it
// Actual
String actualDefaultValue =select.getFirstSelectedOption().getText();
//DO our assertion
    Assert.assertEquals(actualDefaultValue,expectedDefaultValue);
//create Select Object and also locate dropdown itself in my constructor
    Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
 String expectedDefaultStateValue="Select a State";
 String actualDefaultStateValue =stateDropdown.getFirstSelectedOption().getText();

Assert.assertTrue(actualDefaultStateValue.equals(expectedDefaultStateValue));


}

@AfterMethod
    public void tearDown(){
     driver.quit();
}

}
/*
TC#5: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
 */