package com.syntax.class18;

public class Task3 {
    private static String onlyvowels(String input){
        //String newStr = input.replaceAll("[^aeiouAEIOU]","");
        //return newStr;

        return input.replaceAll("[^aeiouAEIOU]",""); //2 STEPS IN ONE
    }
    public static void main(String[] args) {

        System.out.println(onlyvowels("Emily"));

        /*
        Create a method that will accept a String as a parameter and
        return a new String that consist only of vowels.
        Method should be available inside the class only where it was
        declared and executed by calling its name.
         */
        /*
        Static methods can access other static methods and fields without
        needing an object of that class or the class name if they are inside the same class
         */



    }
}
