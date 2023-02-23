package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_HoverTest {
    @Test
    public void hoverTest(){
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

  //Locate all the images here
        WebElement image1=Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2=Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3=Driver.getDriver().findElement(By.xpath("(//img)[3]"));
 //Locate all the user header
WebElement textUser1=Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement textUser2=Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement textUser3=Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));
//To be able to hover on images we need to create Actions class object, and pass 'driver' in the constructor

        Actions actions= new Actions(Driver.getDriver());
   //     2. Hover over to first image
actions.moveToElement(image1).perform();// img1- we located so we have it's location
   //3. Assert:
        //a. “name: user1” is displayed
        Assert.assertTrue(textUser1.isDisplayed());

        actions.moveToElement(image2).perform();
        Assert.assertTrue(textUser2.isDisplayed());

        actions.moveToElement(image3).perform();
        Assert.assertTrue(textUser3.isDisplayed());

    }

}
/*
TC #3: Hover Test
1. Go to https://practice.cydeo.com/hovers
2. Hover over to first image

4. Hover over to second image
5. Assert:
a. “name: user2” is displayed
6. Hover over to third image
7. Confirm:
a. “name: user3” is displayed

 */