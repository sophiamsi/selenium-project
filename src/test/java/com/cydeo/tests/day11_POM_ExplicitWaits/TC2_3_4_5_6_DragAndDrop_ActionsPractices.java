package com.cydeo.tests.day11_POM_ExplicitWaits;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2_3_4_5_6_DragAndDrop_ActionsPractices {
@BeforeMethod
public void setUp(){
    //TC2 #: Drag and drop default value verification
    //1. Go to https://practice.cydeo.com/drag_and_drop_circles
    Driver.getDriver().get("https://practice.cydeo.com/drag_and_drop_circles");
}
@AfterMethod
public void tearDown(){
    Driver.closeDriver();
}
@Test
    public void test2_default_value_verification(){
    //TC2 #: Drag and drop default value verification

    //2. Verify big circle default text is as below.
    WebElement bigCircle= Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
    //3. Assert:
    //-Text in big circle changed to: “Drag the small circle here.”
    String expectedText="Drag the small circle here.";
    String actualBigCircleText= bigCircle.getText();
    Assert.assertTrue(actualBigCircleText.equals(expectedText));

}
@Test
    public void test3_drop_into_the_big_circle(){
    //1. Go to https://practice.cydeo.com/drag_and_drop_circles - already done in Before Method
    // We aready have location of the big circle
    WebElement bigCircle= Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
    //now we will locate small circle
    WebElement smallCircle= Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

    //Creating the ACTIONS OBJECT FOR OUR ACTIONS
    Actions actions= new Actions(Driver.getDriver());
    //2. Drag and drop the small circle to bigger circle.
    actions.dragAndDrop(smallCircle,bigCircle).perform();
/*actions.clickAndHold(smallCircle)
        .pause(1000)
        .moveToElement(bigCircle)
        .pause(2000)
        .release()
        .perform();*/
    //3. Assert:
    //-Text in big circle changed to: “You did great!”
    String expectedText="You did great!";
    String actualBigCircleText= bigCircle.getText();
    Assert.assertTrue(actualBigCircleText.equals(expectedText));

}

@Test
    public void test4_clickAndHold(){
    //TC4 #: Click and hold
    //1. Go to https://practice.cydeo.com/drag_and_drop_circles - already done in Before Method
    // We aready have location of the big circle
    WebElement bigCircle= Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));
    //now we will locate small circle
    WebElement smallCircle= Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));

    //Creating the ACTIONS OBJECT FOR OUR ACTIONS
    Actions actions= new Actions(Driver.getDriver());
    //2. Drag and drop the small circle to bigger circle.
WebElement cydeoLink=Driver.getDriver().findElement(By.linkText("CYDEO"));
actions.clickAndHold(smallCircle)
        .pause(1000)
        .moveToElement(cydeoLink)
        .perform();
    //3. Assert:
    //-Text in big circle changed to: “Drop here.”
    String expectedText="Drop here.";
    String actualBigCircleText= bigCircle.getText();
    Assert.assertTrue(actualBigCircleText.equals(expectedText));


}

    @Test
    public void test5_drop_outside_of_big_circle(){
        //TC5 #: drop_outside_of_big_circle

        //Locating the circle web elements
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        //Creating the Actions object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        //2. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(cydeoLink)
                .pause(1000)
                .release()
                .perform();


        //3. Assert:
        //-Text in big circle changed to: “Try again!”
        String expectedText = "Try again!";
        String actualBigCircleText = bigCircle.getText();

      Assert.assertTrue(actualBigCircleText.equals(expectedText));
    }

    @Test
    public void test6_big_circle_hovering_text_verify(){
        //TC6 #: big_circle_hovering_text_verify

        //Locating the circle web elements
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));

        //Creating the Actions object to do our actions
        Actions actions = new Actions(Driver.getDriver());

        //2. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(bigCircle)
                .pause(1000)
                .perform();


        //3. Assert:
        //-Text in big circle changed to: "Now drop..."
        String expectedText = "Now drop...";
        String actualBigCircleText = bigCircle.getText();

        Assert.assertTrue(actualBigCircleText.equals(expectedText));
    }

}
/*
TC2 #: Drag and drop default value verification
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Verify big circle default text is as below.
3. Assert:
-Text in big circle changed to: “Drag the small circle here.”
TC3 #: Drag and drop into the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”
TC4 #: Click and hold
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Click and hold the small circle.
3. Assert:
-Text in big circle changed to: “Drop here.”

TC5 #: Drag and drop outside of the big circle
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “Try again!”

TC6 #: Drag and hover
1. Go to https://practice.cydeo.com/drag_and_drop_circles
2. Drag the small circle on top of the big circle, hold it, and verify.
3. Assert:
-Text in big circle changed to: “Now drop...”
 */