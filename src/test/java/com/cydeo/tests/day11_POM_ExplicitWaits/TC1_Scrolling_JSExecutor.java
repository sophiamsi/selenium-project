package com.cydeo.tests.day11_POM_ExplicitWaits;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC1_Scrolling_JSExecutor {
    @Test
    public void scroll_using_js_executor(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/large
        Driver.getDriver().get("https://practice.cydeo.com/large");
        //Locating Cydeo link and Home link to be used later
        WebElement cydeoLink= Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        //3-Creating JS executor to be used later
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //3- Scroll down to “Cydeo” link
                                                                     //  0          1
          js.executeScript("arguments[0].scrollIntoView(true)",cydeoLink,homeLink);
        //4- Scroll up to “Home” link
        js.executeScript("arguments[1].scrollIntoView(true)",cydeoLink,homeLink);
        //5- Use below provided JS method only
        //JavaScript method to use : arguments[0].scrollIntoView(true)
        //Note: You need to locate the links as web elements and pass them as arguments into executeScript() method
    }
}
/*
TC #1: Scroll using JavascriptExecutor
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/large
3- Scroll down to “Cydeo” link
4- Scroll up to “Home” link
5- Use below provided JS method only
JavaScript method to use : arguments[0].scrollIntoView(true)
Note: You need to locate the links as web elements and pass them as
arguments into executeScript() method
 */