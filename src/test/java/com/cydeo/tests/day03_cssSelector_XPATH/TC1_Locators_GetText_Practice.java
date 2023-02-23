package com.cydeo.tests.day03_cssSelector_XPATH;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Locators_GetText_Practice {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com");
        WebElement inputUserName= driver.findElement(By.className("login-inp"));
  inputUserName.sendKeys("alohamuchscho");

  WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
inputPassword.sendKeys("perfect345");

WebElement logInButton= driver.findElement(By.className("login-btn"));
logInButton.click();

String expectedErrorText="Incorrect login or password";
String actualErrorText=driver.findElement(By.className("errortext")).getText();
if (actualErrorText.equals(expectedErrorText)){
    System.out.println("Error verification is passed");
}else{
    System.out.println("Error verification is failed");
}




    }
}
