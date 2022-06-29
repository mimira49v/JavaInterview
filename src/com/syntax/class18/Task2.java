package com.syntax.class18;

import java.sql.SQLOutput;

public class Task2 {
/*
Create a method that will take a string as a
parameter and return reversed String.
Method should be available to all classes within
your project and accessible by class name also.
 */

    public static String reverseString(String input){
    /*  StringBuilder stringBuilder = new StringBuilder(input); - creating the object
        stringBuilder.reverse(); - calling a method
        return stringBuilder.toString(); - calling a method on that object  */
        return new StringBuilder(input).reverse().toString();
        //return new StringBuilder(input).reverse().toString(); calling two methods on that object

    }

    public static void main(String[] args) {
        String name = "Emily";
        System.out.println(Task2.reverseString(name));
    }
}

