package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC5_WindowHandlePractice {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://practice.cydeo.com/windows");

    }
    @Test
    public void multipleWindowsTest(){
//4. Assert: Title is “Windows” need to verify title as expected
   String expectedTitle ="Windows";
   String actualTitle= driver.getTitle();
        Assert.assertTrue(expectedTitle.equals(actualTitle));
String mainHandle= driver.getWindowHandle();
        System.out.println("Title before click: "+driver.getTitle());
//5. Click to: “Click Here” link
        WebElement clickHereLink= driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();
        System.out.println("Title after click: "+driver.getTitle());
//6. Switch to new Window.We need to use driver.getWindowHandles()method
        //driver.getWindowHandles();
        //1-windowHandle :mainHandle
        //2- 2nd Window : 2nd Window

        for (String each: driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Current title "+driver.getTitle());}
//7. Assert: Title is “New Window”
        String expectedTitleAfterClick= "New Window";
        String actualCurrentTitle=driver.getTitle();
        Assert.assertEquals(expectedTitleAfterClick,actualCurrentTitle);
        //if we have to go back to main page to continue our test case:
        //we can use mainHandle to switch
        driver.switchTo().window(mainHandle);
    }

}
/*
TC #5: Window Handle practice
1. Create a new class called: T5_WindowsPractice 2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows” need to verify title as expected

5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
 */