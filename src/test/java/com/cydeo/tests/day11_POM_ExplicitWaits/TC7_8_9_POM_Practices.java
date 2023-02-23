package com.cydeo.tests.day11_POM_ExplicitWaits;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC7_8_9_POM_Practices {

   /* @Test
    public void t7_field_required_error_message_test(){
       //TC #7: Required field error message test
        //1- Open a chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com");

        //3- Do not enter any information
  //we need to use WebElements that we located in Pages
  //Step1-  to be able to use them we need to reach out to the object of this class
        //1A We're creating the object
        LibraryLoginPage LogInPage= new LibraryLoginPage();
 //driver will go to the constructor and will get LogInPage object familiar with all the WEBELEMENTS IN PAGES
        //4- Click to “Sign in” button
  //IF we want to click on Sign In button we will call the object.Object knows these elements and just click
     LogInPage.signInButton.click();
        //5- Verify expected error is displayed:
        Assert.assertTrue(LogInPage.fieldRequiredErrorMessage.isDisplayed());
        //Expected: This field is required.
        //NOTE: FOLLOW POM DESIGN PATTERN



    }*/

    LibraryLoginPage loginPage;
    @BeforeMethod
    public void setupMethod(){
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com
        Driver.getDriver().get("https://library1.cydeo.com ");
        loginPage = new LibraryLoginPage();
    }

    @AfterMethod
    public void tearDownMethod(){
        Driver.closeDriver();
    }

    @Test
    public void t7_field_required_error_message_test(){
        //TC #7: Required field error message test

        //3- Do not enter any information

        //4- Click to “Sign in” button
        loginPage.signInButton.click();

        //5- Verify expected error is displayed:
        Assert.assertTrue(loginPage.fieldRequiredErrorMessage.isDisplayed());


    }

    @Test
    public void t8_email_format_error_message_test(){
        //TC #8: Invalid email format error message test

        //3- Enter invalid email format
        loginPage.emailInput.sendKeys("username");
        loginPage.signInButton.click();
        //4- Verify expected error is displayed:
        //Expected: Please enter a valid email address.
        Assert.assertTrue(loginPage.enterValidEmailErrorMessage.isDisplayed());
    }

    @Test
    public void t9_wrong_email_or_password_error_message(){
        //TC #9: Library negative login

        //3- Enter incorrect username or incorrect password
        loginPage.emailInput.sendKeys("username@wrongsomething.com");
        loginPage.passwordInput.sendKeys("somethingIncorrect");
        loginPage.signInButton.click();

        //4- Verify expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(loginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
    }
}
/*
TC #7: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.
NOTE: FOLLOW POM DESIGN PATTERN
TC #8: Invalid email format error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter invalid email format
4- Verify expected error is displayed:
Expected: Please enter a valid email address.
TC #9: Library negative login
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Enter incorrect username or incorrect password
4- Verify title expected error is displayed:
Expected: Sorry, Wrong Email or Password
NOTE: FOLLOW POM DESIGN PATTERN
 */