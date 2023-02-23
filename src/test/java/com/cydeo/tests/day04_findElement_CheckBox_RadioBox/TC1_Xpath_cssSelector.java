package com.cydeo.tests.day04_findElement_CheckBox_RadioBox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_Xpath_cssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

//3. Locate all the WebElements on the page using XPATH and/or CSS
//locator only (total of 6)
//a. “Home” link
  //Locate Home Link using cssSelector, syntax #1 , class attribute value
                                                    // tagName[attribute='value']
   WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
 //Locate Home Link using cssSelector, syntax #2 , class attribute value
                                                  //tagName.classValue
  WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link"));
//Locate Home Link using cssSelector, syntax #1 , href attribute value
 WebElement homelink3 = driver.findElement(By.cssSelector("a[href='/']"));

//b. “Forgot password” header
//Locate header, using xpath,using text
        WebElement forgetPass1= driver.findElement(By.xpath("//h2[.='Forgot Password']"));
//Locate header,using cssSelector,locate parent element and move down to h2
        WebElement forgetPass2 = driver.findElement(By.cssSelector("div[class='example']>h2"));
 /*
        or
        WebElement forgetPass3 = driver.findElement(By.cssSelector("div.example>h2"));
  */
//c. “E-mail” text
 //Locate the"email" label using xpath for attribute
WebElement emailText= driver.findElement(By.xpath("//label[@for='email']"));
//Locate the"email" label using xpath text
 WebElement emailText2= driver.findElement(By.xpath("//label[.='E-mail']"));

//d. E-mail input box using xpath using type attribute
WebElement emailInput = driver.findElement(By.xpath("//input[@type='text']"));
//E-mail input box using xpath using contains method
// tagName[contains(@attribute,'value')]
WebElement emailInput2=driver.findElement(By.xpath("//input[contains(@pattern,'a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$')]"));

//e. “Retrieve password” button

  WebElement retrievePassword= driver.findElement(By.xpath("//button[@id='form_submit']"));
//f. “Powered by Cydeo text
        WebElement retrievePassword2 =driver.findElement(By.xpath("//div[@style='text-align: center;']"));
//4. Verify all web elements are displayed.
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgetPass1.isDisplayed() = " + forgetPass1.isDisplayed());
        System.out.println("retrievePassword2.isDisplayed() = " + retrievePassword2.isDisplayed());

//First solve the task with using cssSelector only. Try to create 2 different
//cssSelector if possible
//Then solve the task using XPATH only. Try to create 2 different
//XPATH locator if possible









Thread.sleep(2000);
driver.close();

    }

}
/*
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible
Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible


 */