package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

//This class will be storing only the utility methods that can be used across the project
public class BrowserUtils {
//sleep method without exception
//This method will accept int (in seconds) and execute Thread.sleep() for given duration

public static void sleep(int second){
    second*=1000;
    try{
        Thread.sleep(second);

    }catch (InterruptedException e){

    }
}

public static void switchWindowAndVerify(WebDriver driver,String expectedIndUrl,String expectedInTitle){


    Set<String> allWindowHandles =driver.getWindowHandles();
    for (String each: allWindowHandles) {
        driver.switchTo().window(each);//in each iteration it will keep switching.
        //while it switching we want to see a URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        if (driver.getCurrentUrl().contains(expectedIndUrl)) {
            break;
        }
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }
    /*

1. Create a new class calledBrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called,it should switch window and verify title.
Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedTitle
     */
    }


  public static void verifyTitle(WebDriver driver,String expectedTitle){

      String actualTitle= driver.getTitle();

      Assert.assertEquals(actualTitle,expectedTitle);


  }
public static void verifyTitleContains(WebDriver driver,String expectedInTitle){
    Assert.assertTrue(driver.getTitle().contains(expectedInTitle));
}
    /*
     This method accepts WebElement target,
     and waits for that WebElement not to be displayed on the page
      */
    public static void waitForInvisibilityOf(WebElement target){
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.invisibilityOf(target));
    }

    /*
    This method accepts String title,
    and waits for that Title to contain given String value.
     */
    public static void waitForTitleContains(String title){
        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.titleContains(title));
    }


/*
C #5: Create utility method
1. Create a new method for login
2. Create a method to makeTask3 logic re-usable
3. When method is called,it should simply login
This method should have at least 2 overloaded versions.
Method #1 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
Method #2 info:
• Name: login_crm()
• Return type: void
• Arg1: WebDriver
• Arg2: String username
• Arg3: String password
 */


}
