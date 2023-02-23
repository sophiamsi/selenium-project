package com.cydeo.tests.day02_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library2.cybertekschool.com/login.html");

 //3. Enter username: “incorrect@email.com”
  //Locate username input box using “className” locator
        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrect@email.com");


 //4. Enter password: “incorrect password
// Locate password input box using “id” locator

WebElement passwordInput = driver.findElement(By.id("inputPassword"));
passwordInput.sendKeys("incorrect password234");

//5. Verify: visually “Sorry, Wrong Email or Password” displayed
 //Locate Sign in button using “tagName” locator
        WebElement signIn = driver.findElement(By.tagName("button"));
      signIn.click();





    }
}
/*
TC #4: Library verifications
1. Open Chrome browser
2. Go to http://library2.cybertekschool.com/login.html
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Verify: visually “Sorry, Wrong Email or Password”
displayed
PS:
Locate password input box using “id” locator
Locate Sign in button using “tagName” locator
 */