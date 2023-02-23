package com.cydeo.tests.day09ReviewJavaFaker_DriverUtil;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC2_DriverUtil_Practice {
  /*  WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));*/



    @Test
    public  void bingSearch_practice() {
//Driver.getDriver() ---> will return me the "driver"
// instead of writing         "driver" from now one we will write Driver.getDriver();
   Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));

        WebElement bingSearch = Driver.getDriver().findElement(By.xpath("//input[@id='sb_form_q']"));
        bingSearch.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Search";;
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"Title does not match");

    }
    @AfterMethod
    public void tearDownMethod(){
      /* We won't be using the selenium quit method directly anymore.
      Driver.getDriver().quit(); ---> no more using this method
      We will be using Drive.closeDriver(); method

        Driver.getDriver().quit();
       */
        Driver.closeDriver();
    }
}
