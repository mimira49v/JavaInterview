package com.syntax.class15;

public class StringMethodExample01 {

    public static void main(String[] args) {


        String s = "Mohammad Mohammad";

        if (s.length() <= 12) {
            //less than or equal to 12 characters in this/her name
            System.out.println("User name created");
        } else {
            System.out.println("This much long name is not allowed");
        }
    }
}