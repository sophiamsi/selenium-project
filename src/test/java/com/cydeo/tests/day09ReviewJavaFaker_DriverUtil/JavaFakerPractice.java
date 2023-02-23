package com.cydeo.tests.day09ReviewJavaFaker_DriverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {


    @Test
    public void test1(){

        //Create the object
        Faker faker= new Faker();

//Print out random first name using Faker object
        String name= faker.name().firstName();
        System.out.println("Random name: "+ name);
        String lastName =faker.name().lastName();
        System.out.println(lastName);
        System.out.println("faker.address().city() = " + faker.address().city());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\",\"Mukhtar\") = " +
                "" + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Mukhtar"));



    }







}
