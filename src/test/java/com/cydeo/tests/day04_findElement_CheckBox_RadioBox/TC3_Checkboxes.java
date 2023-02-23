package com.cydeo.tests.day04_findElement_CheckBox_RadioBox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class TC3_Checkboxes {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://practice.cydeo.com/checkboxes");
//Locate checkbox#1 and #2
 WebElement checkBox1= driver.findElement(By.xpath("//input[@name='checkbox1']"));
 WebElement checkBox2= driver.findElement(By.xpath("//input[@name='checkbox2']"));
//2. Confirm checkbox #1 is NOT selected by default
        System.out.println("checkBox1.isSelected(),expecting false = " + checkBox1.isSelected());//
//3. Confirm checkbox #2 is SELECTED by default.
        System.out.println("checkBox2.isSelected() expecting TRUE= " + checkBox2.isSelected());
//        4. Click checkbox #1 to select it.
        checkBox1.click();
//        5. Click checkbox #2 to deselect it.
        checkBox2.click();
//        6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1.isSelected(),expecting True = " + checkBox1.isSelected());
//        7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkBox2.isSelected(),expecting false = " + checkBox2.isSelected());



    }
}
/*TC#3: Checkboxes
        1. Go to https://practice.cydeo.com/checkboxes
        2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
        4. Click checkbox #1 to select it.
        5. Click checkbox #2 to deselect it.
        6. Confirm checkbox #1 is SELECTED.
        7. Confirm checkbox #2 is NOT selected.*/