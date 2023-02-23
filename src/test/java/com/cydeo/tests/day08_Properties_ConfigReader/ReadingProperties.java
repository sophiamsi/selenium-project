package com.cydeo.tests.day08_Properties_ConfigReader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test
    public void reading_from_properties_test() throws IOException {
//Create object of Properties
        Properties properties = new Properties();
//We need to open file in Java memory using File InputStream
        FileInputStream file = new FileInputStream("/Users/dmytrodovhun/IDesktop/JavaProject/selenium-project/configuration.properties");

 //Load the properties file in the Properties object
properties.load(file);
//Use the"properties" object to read value from file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));
        System.out.println("properties.getProperty(\"password\") = " + properties.getProperty("password"));


    }




}
