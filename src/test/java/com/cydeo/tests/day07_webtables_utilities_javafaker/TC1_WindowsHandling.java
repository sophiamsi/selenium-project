package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class TC1_WindowsHandling {
//TC #1: Window Handle practice
//1. Create new test and make setups
//2. Goto:https://www.amazon.com
WebDriver driver;
@BeforeMethod
public void setUp(){
    //1. Create new test and make setups
//2. Goto:https://www.amazon.com
    driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
driver.get("https://www.amazon.com");

}
@Test
public void window_handling_test(){
//3. Copy paste the lines from below into your class
 ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
 ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
 ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
//4. Create a logic to switch to the tab where Etsy.com is open
   // driver.getWindowHandles();
    //return and store all window handle in a Set
    Set<String> allwindowHandles =driver.getWindowHandles();
    for (String each: allwindowHandles) {
        driver.switchTo().window(each);//in each iteration it will keep switching.
        //while it switching we want to see a URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        if(driver.getCurrentUrl().contains("etsy")){
            break;
        }
        String actualTitle= driver.getTitle();
        String expectedTitle="Etsy";
        Assert.assertTrue(actualTitle.contains("Etsy"));

    }




// 5. Assert:Title contains“Etsy”
//Lines to be pasted:
//((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
// ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
// ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
//These lines will simply open new tabs using something called JavascriptExecutor and get those pages.
// We will learn JavascriptExecutor later as well.( one of the interfaces , in order to reach methods in in JSE we
    //need to cast our type from Web driver to JSE.
}

@Test
public void window_handling_test2(){
    //3. Copy and paste the lines from below into your class
    ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");
    BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");



}


}
/*
TC #1: Window Handle practice
1. Createnewtestandmakesetups
2. Goto:https://www.amazon.com
3. Copypastethelinesfrombelowintoyourclass
4. CreatealogictoswitchtothetabwhereEtsy.comisopen 5. Assert:Titlecontains“Etsy”
Lines to be pasted:
((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');"); ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');"); ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
These lines will simply open new tabs using something called JavascriptExecutor and get those pages. We will learn JavascriptExecutor later as well.
 */