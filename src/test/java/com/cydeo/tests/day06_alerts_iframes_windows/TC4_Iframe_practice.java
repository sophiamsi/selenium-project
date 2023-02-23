package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC4_Iframe_practice {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://practice.cydeo.com/iframe");
    }
@Test
    public void iframe_test(){

    //we have to switch to Iframe to be able to locate the web elements in here
    //option#1 -switch"id" attribute value
    driver.switchTo().frame("mce_0_ifr");
    //option#2 switch index number
   //driver.switchTo().frame(0);
    //option#3- switch using Webelement
    //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

    WebElement paragraphText= driver.findElement(By.xpath("//p[.='Your content goes here.']"));
    //4. Assert: “Your content goes here.” Text is displayed.
    Assert.assertTrue(paragraphText.isDisplayed());

//5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
   driver.switchTo().parentFrame();
   //driver.switchTo().defaultContent(); doing same thing
WebElement h3=driver.findElement(By.tagName("h3"));
Assert.assertTrue(h3.isDisplayed());


}
@AfterMethod
    private void tearDownMethod(){
        driver.quit();
}
}
/*
TC #4: Iframe practice
1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */