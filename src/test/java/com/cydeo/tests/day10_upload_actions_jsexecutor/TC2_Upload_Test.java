package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_Upload_Test {
    @Test
    public void uploadingTest(){
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get(ConfigurationReader.getProperty("upload.practice"));

        //2. Find some small file from your computer, and get the path of it.
     String path="/Users/dmytrodovhun/Desktop/automation/Locators_table_1_0_2.pdf";

        //3. Upload the file.
        WebElement chooseFileButton= Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        chooseFileButton.sendKeys(path);
        WebElement uploadButton= Driver.getDriver().findElement(By.xpath("//input[@value='Upload']"));
        uploadButton.click();
        //4. Assert:
        WebElement fileUploadedHeader =Driver.getDriver().findElement(By.tagName("h3"));
        //-File uploaded text is displayed on the page
        Assert.assertTrue(fileUploadedHeader.isDisplayed());
    }
}
/*
TC #2 Upload Test
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the page
 */