package com.syntax.class19;

public class Cow {
 /*
   the constructor that is provided automatically when we don't create any
   constructors in a class is called
   default constructors
    */

   static int normalNumberOfLegs = 4;
   /*
   when we don't assign values to
   the instance fields java assigns default
   values to these fields
   private String name;
   int age;
   double weight;
   String breed;
   char gender;
    */

    private String name;
    int age;
    double weight;
    String breed;
    char gender='\u263a';
   /*
   below is zero argument or no argument constructor
   this is not
    */
    Cow(){
        /*
        you might want to execute some code to set up the resources for your class
        like opening the connections to database checking if internet is available
        or not etc
         */
    }
    void printName(){
        System.out.println(gender);
    }
}
