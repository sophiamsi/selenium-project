package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_Registration_form_confirmation {
@Test
    public void registration_form(){
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
    //Driver.getDriver()-->Will return driver
    Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
//3. Enter first name
    WebElement inputFirstName =Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
    inputFirstName.sendKeys("Anna");
//4. Enter last name
    WebElement inputLastName =Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
    inputLastName.sendKeys("Kayson");
//5. Enter username
    WebElement userName=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
    userName.sendKeys("CandyAK");
//6. Enter email address
    WebElement emailName=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
    emailName.sendKeys("janedoe@example.com");
//7. Enter password
    WebElement inputPassword=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
    inputPassword.sendKeys("56739272F");
//8. Enter phone number
    WebElement inputPhone=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
    inputPhone.sendKeys("571-980-0087");
//9. Select a gender from radio buttons
    WebElement genderButton=Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
    genderButton.click();
//10.Enter date of birth
    WebElement inputBirthday=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
    inputBirthday.sendKeys("10/11/2001");
//11.Select Department/Office
    Select selectDepartment=new Select(Driver.getDriver().findElement(By.name("department")));
selectDepartment.selectByVisibleText("Department of Engineering");

//12.Select Job Title
    Select selectJobTitle=new Select(Driver.getDriver().findElement(By.name("job_title")));
    selectJobTitle.selectByVisibleText("SDET");

//13.Select programming language from checkboxes
    WebElement javaCheckBox= Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
javaCheckBox.click();
//14.Click to sign up button
    WebElement signUpButton= Driver.getDriver().findElement(By.id("wooden_spoon"));
    signUpButton.click();
//15.Verify success message “You’ve successfully completed registration.” is
//displayed.

    WebElement successMessage =Driver.getDriver().findElement(By.xpath("//div[@role='alert']"));

    Assert.assertTrue(successMessage.isDisplayed());
//driver.quit()
    //Driver.getDriver().quit();---> we do not use this method anymore. Because we want to assign the value back to null
    //so if we have another test our code can continue executing.
    Driver.closeDriver();
}
}
/*
TC#1: Registration form confirmation
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10.Enter date of birth
11.Select Department/Office
12.Select Job Title
13.Select programming language from checkboxes
14.Click to sign up button
15.Verify success message “You’ve successfully completed registration.” is
displayed.
 */