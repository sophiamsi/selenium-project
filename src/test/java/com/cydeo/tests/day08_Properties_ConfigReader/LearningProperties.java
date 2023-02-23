package com.cydeo.tests.day08_Properties_ConfigReader;

import org.testng.annotations.Test;

public class LearningProperties {
//Java is tracking some information about our computer, project,user name and some other
    //Let's print them
    @Test
    public void java_properties_reading_test(){

 //key= value
 //we pass the key it will return the value
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }







}
