package com.cydeo.tests.day05_DynamicWebElements_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TC1_stale_element_practice {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://practice.cydeo.com/add_remove_elements/");

//3. Click to “Add Element” button
    WebElement addElementButton= driver.findElement(By.xpath("//button[.='Add Element']"));
addElementButton.click();

//4. Verify “Delete” button is displayed after clicking.
    WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteButton.isDisplayed(),expecting True = " + deleteButton.isDisplayed());
//5. Click to “Delete” button.
        Thread.sleep(3000);
        deleteButton.click();
//6. Verify “Delete” button is NOT displayed after clicking.
        //use try/catch to handle and verify
 try{
     System.out.println("deleteButton.isDisplayed(),expecting false = " + deleteButton.isDisplayed());

}catch (StaleElementReferenceException e){
     System.out.println("StaleElementReferenceException happened due to element being deleted from page");
     System.out.println("Which concludes our test Case PASSING! -");
     System.out.println("deleteButton.isDisplayed(),expecting false = ");

 }









    }
}
/*
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
 */