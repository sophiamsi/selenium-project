package com.cydeo.tests.day08_Properties_ConfigReader;

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

public class TC4_use_config_reader {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        //     driver= WebDriverFactory.getDriver("chrome");
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));//new way ,dynamic
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get(ConfigurationReader.getProperty("googleURL"));
    }
        @Test
        public void google_search_test(){
//3- Write “apple” in search box
            WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
    //        searchBox.sendKeys("apple" + Keys.ENTER);
            searchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
//4- Verify title:
//Expected: apple - Google Search
            String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Google Search";
            String actualTitle = driver.getTitle();
            Assert.assertEquals(expectedTitle, actualTitle, "Title DOES NOT MATCH");


        }

    }


/*
TC #4: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Verify title:
Expected: apple - Google Search

Use `configuration.properties` for the following:
1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail.
 */