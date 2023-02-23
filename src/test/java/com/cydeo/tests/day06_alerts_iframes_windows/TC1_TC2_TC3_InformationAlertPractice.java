package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC1_TC2_TC3_InformationAlertPractice {
   WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }
@Test
    public void InfoAlert(){
        //3. Click to “Click for JS Alert” button
    WebElement informationAlertButton= driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
    informationAlertButton.click();
//4. Click to OK button from the alert
//we are switching Selenium attention on alert
    Alert alert1=driver.switchTo().alert();
    alert1.accept();
//5. Verify “You successfully clicked an alert” text is displayed.
    WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
    //we're verifying that text is displayed
    Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");
    //we are verifying that actual"You successfully clicked an alert" is displayed actual/expected match

    String expectedText="You successfully clicked an alert";
    String actualText=resultText.getText();
    Assert.assertEquals(expectedText,actualText);

}
@Test
    public void confirmation_alert_test2(){
        //3. Click to “Click for JS Confirm” button
    WebElement confirmationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
    confirmationAlertButton.click();
    //4. Click to OK button from the alert
    Alert alert2=driver.switchTo().alert();
    alert2.accept();

    //5. Verify “You clicked: Ok” text is displayed.
WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
    Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");
    String expectedText="You clicked: Ok";
    String actualText=resultText.getText();
    Assert.assertEquals(expectedText,actualText);
}
@Test
    public void informAlert2(){
       //TC #2: Confirmation alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Prompt” button
    WebElement confirmationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
    confirmationAlertButton.click();
    //4. Click to OK button from the alert
    Alert alert3= driver.switchTo().alert();


    //4. Send “hello” text to alert
    alert3.sendKeys("hello");
    //5. Click to OK button from the alert
    alert3.accept();
    //6. Verify “You entered: hello” text is displayed
    WebElement resultText= driver.findElement(By.xpath("//p[@id='result']"));
    Assert.assertTrue(resultText.isDisplayed());



}


}
/*
TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
 3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.


 */
/*
TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed.
 */
/*
TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered: hello” text is displayed

 */