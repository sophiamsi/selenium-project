package com.cydeo.tests.day02_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();//set up our browser
        WebDriver driver = new ChromeDriver();//created out driver instance
        driver.manage().window().maximize();//maximizec the size
        //2- Go to: https://google.com
        driver.get("https://google.com");// sent driver to url
       // 3- Write “apple” in search box
        //in order to do it we have additional steps:
        // a.locate search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));//located our google search box using
        //find_element()and name locator specificly
        // b.enter "apple" key,and press Enter
        googleSearchBox.sendKeys("apple");
        // press enter
        googleSearchBox.sendKeys(Keys.ENTER);//send Keys Apple and press ENTER
        // or googleSearchBox.sendKeys("apple"+Keys.Enter);

        //5- Verify title:
        //Expected: Title should start with “apple” word

        String expectedInBeginningOfTitle ="apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInBeginningOfTitle)){
            System.out.println("Title Verification is Passed ");
        }else{
            System.out.println("Title Verification is Filed ");
        }



    }
}
/*
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Press ENTER to search
5- Verify title:
Expected: Title should start with “apple” word
 */