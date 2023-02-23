package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC4_loginScenario {

    /*
    TC #4: Login scenario
    1. Create new test and make setups
    2. Goto:http://login1.nextbasecrm.com/
    3. Enter valid username
    4. Enter valid password
    5. Click to`LogIn`button
    6. Verify title is as expected:
     Expected: Portal
    USERNAME helpdesk1@cydeo.com helpdesk2@cydeo.com
     */
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get("https://login1.nextbasecrm.com/");


    }
@Test
   public void test1_crm1_login(){
   // CRM_Utilities.login_crm(driver);
    WebElement inputUserName= driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
    inputUserName.sendKeys("helpdesk1@cydeo.com");
    WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
    inputPassword.sendKeys("UserUser");
WebElement logInButton= driver.findElement(By.xpath("//input[@value='Log In']"));
logInButton.click();

    BrowserUtils.sleep(3);
    BrowserUtils.verifyTitle(driver,"Portal");
}




}