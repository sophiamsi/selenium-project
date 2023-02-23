package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
// go to Tesla
        driver.get("https://www.tesla.com");

        String currentTitle1 =driver.getTitle();
        System.out.println("currentTitle1 = " + currentTitle1);
//Use navigate back() to go back;
Thread.sleep(3000);
        driver.navigate().back();
// user navigate forward() to go forward
Thread.sleep(3000);
        driver.navigate().forward();
Thread.sleep(3000);
//user refreshes the page using navigate.refresh
driver.navigate().refresh();

//navigate to google.com using navigate()to
        Thread.sleep(3000);
        driver.navigate().to("https://www.google.com");


// get title of the page
        Thread.sleep(3000);
       // driver.getTitle();
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle =driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.close();
    }
}
