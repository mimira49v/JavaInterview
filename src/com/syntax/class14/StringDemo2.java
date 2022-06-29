package com.syntax.class14;

import java.util.Locale;

public class StringDemo2 {


    public static void main(String[] args) {

        String name="     Moreed   d     ";

        System.out.println(name);
        System.out.println(name.trim());  // removes spaces before and after the spaces

        String name2="Run Moreed";
        System.out.println(name2.toLowerCase().startsWith("run")); // method chaining
        System.out.println(name2.toLowerCase().startsWith("Moreed"));
        System.out.println(name2.startsWith("Moreed"));  // what it starts with
        System.out.println(name2.endsWith("d"));  // what char it ends
        System.out.println(name2.toLowerCase(Locale.ROOT).contains("m")); // finds a char inside method

    }
}
