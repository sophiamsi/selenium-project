package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Dropdowns_T6_T7_T8 {
    WebDriver driver;
    @BeforeMethod
   public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
@Test
    public void dropdowns_task6(){
        //TC #6: Selecting date on dropdown and verifying
    // included in BeforeMethod
        //1. Open Chrome browser

        //2. Go to https://practice.cydeo.com/dropdown


        //3. Select “December 1st, 1933” and verify it is selected.
   //Locate dropdowns and pass them in Select object constructor
    Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
    Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
    Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        //use this objects to select the values
        //Select year using : visible text
yearDropdown.selectByVisibleText("1933");
        //Select month using : value attribute
 monthDropdown.selectByValue("11");
        //Select day using : index number
  dayDropdown.selectByIndex(0);
//create expected values
String expectedYear="1933";
String expectedMonth="December";
String expectedDay="1";
//getting actual values from browser
String actualYear =yearDropdown.getFirstSelectedOption().getText();
String actualMonth=monthDropdown.getFirstSelectedOption().getText();
String actualDay= dayDropdown.getFirstSelectedOption().getText();
//creating Assertions:
    Assert.assertEquals(actualYear,expectedYear);
    Assert.assertTrue(actualMonth.equals(expectedMonth));
    Assert.assertTrue(actualDay.equals(expectedDay));

    }
@Test
    public void dropdown_task7(){
  //TC #7: Selecting state from State dropdown and verifying result
    //1. Open Chrome browser
    //2. Go to http://practice.cybertekschool.com/dropdown

    // locate the dropdown and create select object
    Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));
    //3. Select Illinois
    stateDropdown.selectByVisibleText("Illinois");
    //4. Select Virginia
    stateDropdown.selectByValue("VA");
    //5. Select California
    stateDropdown.selectByIndex(5);
    //6. Verify final selected option is California.
    String expectedOptionText="California";
    String actualOptionText=stateDropdown.getFirstSelectedOption().getText();
    //Use all Select options. (visible text, value, index)
Assert.assertEquals(actualOptionText,expectedOptionText,"State DROPDOWN VALUE IS NOT Expected");
}
@Test
public void dropdown_task8(){
      //3. Click to non-select dropdown
    //Locate the non-select dropdown
    WebElement webSiteDropdown=driver.findElement(By.linkText("Dropdown link"));
    webSiteDropdown.click();

    //4. Select Facebook from dropdown
   WebElement facebookLink= driver.findElement(By.linkText("Facebook"));
   facebookLink.click();
    //5. Verify title is “Facebook - log in or sign up”
    String expectedFacebookTitle ="Facebook - log in or sign up";
    String actualFacebookTitle= driver.getTitle();
    Assert.assertEquals(actualFacebookTitle,expectedFacebookTitle,"Titles are not equal");
}

}
/*
TC #6: Selecting date on dropdown and verifying
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select “December 1st, 1933” and verify it is selected.
Select year using : visible text
Select month using : value attribute
Select day using : index number
 */
/*
TC #7: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
 */
/*
TC #8: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */