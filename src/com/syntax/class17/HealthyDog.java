package com.syntax.class17;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class HealthyDog   {
    //when the information is expected to be different from object to object
    //we store that information in an instance variable

    String name;  //instance variable
    String color; // instance variable

    //if we know that a value will stay same for all the objects of a class
    //we create a static variable for that why because

    static int numberOfLegs; // static variable
    // telling java please reserve only one memory slot using static!!!

    void eat(){
        int noOfTimes=3; //local variable
        System.out.println(name+" eats "+noOfTimes);
    }
       //  void sleep(); {
      //     int noOfTimes=3;
     //          System.out.println(name+" eats "+noOfTimes); can access local variables in other methods
    //     }



    public static void main(String[] args) {
        HealthyDog dog=new HealthyDog(); // dog is a local variable cuz its inside psvm

        dog.name="scooby";
        dog.color="pink";
        HealthyDog.numberOfLegs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="tomy";
        dog.name="navi blue";

        HealthyDog.numberOfLegs=4;
        dog2.eat();
     // if else VS switch we should always prefer switch //
    }
}