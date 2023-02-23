package com.cydeo.tests.day02_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {
    public static void main(String[] args) throws InterruptedException {


// TC #2: Back and forth navigation
//1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

 //2 maximize the size
      driver.manage().window().maximize();

//3- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

//4- Click to A/B Testing from top of the list.
//driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));//to reuse
        abTestLink.click();

Thread.sleep(3000);


//5- Verify title is:
//Expected: No A/B Test
        String expectedTitle ="A/B Testing";
        String actualTitle= driver.getTitle();
  if(actualTitle.equals(expectedTitle)){
      System.out.println("Title verification is passed");
  }else {
      System.out.println("Title verification is failed");
  }
Thread.sleep(2000);
//6- Go back to home page by using the .back();
        driver.navigate().back();
//7- Verify title equals:
       expectedTitle="Practice";
       actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed");
        }else {
            System.out.println("Title verification is failed");
        }
//Expected: Practice







    }
}
