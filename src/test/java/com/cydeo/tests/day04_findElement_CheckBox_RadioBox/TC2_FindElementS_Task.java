package com.cydeo.tests.day04_findElement_CheckBox_RadioBox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class TC2_FindElementS_Task {
    public static void main(String[] args) {
//TC #2: FindElements Task
//1- Open a chrome browser
//2- Go to: https://practice.cydeo.com/abtest

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        driver.get(" https://practice.cydeo.com/abtest");

//3- Locate all the links in the page.
        List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));

//4- Print out the number of the links on the page.

        System.out.println("listOfLinks.size() = " + listOfLinks.size());

//5- Print out the texts of the links.
      //  for (WebElement each: listOfLinks) {
      //      System.out.println(each); will only print Object reference
      //  }

        for (WebElement each:listOfLinks) {
            System.out.println("Text of links: "+each.getText());// to see the text IN our case names of Links
            System.out.println("Href attributes values: "+ each.getAttribute("href"));
//get me the attributeValue of Href attribute
        }


//6- Print out the HREF attribute values of the links





    }
}
/*
TC #2: FindElements Task
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */