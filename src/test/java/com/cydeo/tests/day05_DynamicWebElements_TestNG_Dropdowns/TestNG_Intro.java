package com.cydeo.tests.day05_DynamicWebElements_TestNG_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass
    public void setUpClass(){
        System.out.println("Before class is running");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("After class is running");
    }
@BeforeMethod
    public void setupMethod(){
        System.out.println("--> Before method is running");
    }
@AfterMethod
public void tearDownMethod(){//conventional
    System.out.println(">>After method is running<<");
}

  @Test(priority = 1)
    public void test1(){
      System.out.println("Test #1 is running");

      Assert.assertEquals("apple","apple");


    }
@Test
public void test2(){
    System.out.println("Test  #2 is running");
    String actual ="White";
    String expected ="White";
    Assert.assertTrue(actual.equals(expected));
}

}
