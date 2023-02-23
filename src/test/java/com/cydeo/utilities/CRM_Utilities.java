package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
This class will store the method related to CRM
 */
public class CRM_Utilities {

    public static void login_crm(WebDriver driver){

        WebElement inputUserName= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUserName.sendKeys("helpdesk1@cydeo.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        WebElement logInButton= driver.findElement(By.xpath("//input[@value='Log In']"));
        logInButton.click();

    }

public  static void login_crm(WebDriver driver,String username,String password){
    WebElement inputUserName= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
    inputUserName.sendKeys(username);
    WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
    inputPassword.sendKeys(password);
    WebElement logInButton= driver.findElement(By.xpath("//input[@value='Log In']"));
    logInButton.click();
}


}
