package com.cydeo.tests.day05_DynamicWebElements_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class TC3_radio_buttons {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  //Locate all the 'sports' radio buttons, and store them in a List<WebElement>

        List<WebElement>sportsRadioButtons =driver.findElements(By.xpath("//input[@name='sport']"));
//    storing all Radio Buttons; each is getting them one by one
        for (WebElement each : sportsRadioButtons) {
  // getting ID attribute value and storing inside actualID string
            String actualID= each.getAttribute("id");
 // every time we run it's get the element , attribute value  and print it out
            System.out.println("actualID = " + actualID);
   // actual ID is comming from browser . If actual ID equals to hockey I want you to click on current elemnt
   // which is stored in each
            if(actualID.equals("hockey")){
                each.click();
   //if condition is making sure the actualID is 'hockey'is Selected .We are using Selenium to print T/F
                System.out.println(actualID +" is Selected: "+each.isSelected() );
              break;
            }
        clickAndVerifyRadioButton(driver,"color","red");

            
            
        }

    }
    private static void clickAndVerifyRadioButton(WebDriver driver,String nameAttribute,String expectedId){

        //Locate all the 'sports' radio buttons, and store them in a List<WebElement>

       // List<WebElement>sportsRadioButtons =driver.findElements(By.xpath("//input[@name='"+nameAttribute+"']"));
        // String xpath ="//something";
        //String str ="abc";
        //xpath = "//some" +str+ "thing";
        List<WebElement>RadioButtons =driver.findElements(By.name(nameAttribute));
//    storing all Radio Buttons; each is getting them one by one
        for (WebElement each : RadioButtons) {
            // getting ID attribute value and storing inside actualID string
            String actualID= each.getAttribute("id");
            // every time we run it's get the element , attribute value  and print it out
            System.out.println("actualID = " + actualID);
            // actual ID is comming from browser . If actual ID equals to expectedID I want you to click on current elemnt
            // which is stored in each
            if(actualID.equals(expectedId)){
                each.click();
                //if condition is making sure the actualID is 'hockey'is Selected .We are using Selenium to print T/F
                System.out.println(actualID +" is Selected: "+each.isSelected() );
                break;
            }



        }

    }

    }




/*
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
Create a utility method to handle above logic.
Method name: clickAndVerifyRadioButton
Return type: void or boolean
Method args:
1. WebDriver
2. Name attribute as String (for providing which group of radio buttons)
3. Id attribute as String (for providing which radio button to be clicked)
Method should loop through the given group of radio buttons. When it finds the
matching option, it should click and verify option is Selected.
Print out verification: true
 */