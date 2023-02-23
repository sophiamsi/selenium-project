package com.cydeo.tests.day09ReviewJavaFaker_DriverUtil;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC1_ConfigProp_BingSearch {
    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
    driver= WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    driver.get(ConfigurationReader.getProperty("bingURL"));


    }
    @Test
            public  void bingSearch_practice() {
        WebElement bingSearch = driver.findElement(By.xpath("//input[@id='sb_form_q']"));
  bingSearch.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Search";;
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"Title does not match");




    }
}
/*
TC #1: Bing search
1- Open a chrome browser
2- Go to: https://bing.com
3- Write “apple” in search box
4- Verify title:

Expected: apple - Search

Use `configuration.properties` for the following:
1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail.
 */