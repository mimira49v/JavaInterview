package com.syntax.class14;

import java.util.Locale;


public class Main2 {
// Create a method that will say Hello in different language
// based on the country that will passed when method is executed.

    String sayHello(String country) {
        country=country.toLowerCase();
        switch (country) {
        case"USA":
            return "Hello";
        case "France":
            return "Bojour";
        case "Turkey":
            return "Merhaba";
        default:
            return "Zulfiya";
        }
    }



public static void main(String[] args){

        Main2 object=new Main2();
        String country=object.sayHello("Silva");
        System.out.println(country);
}
}
