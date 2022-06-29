package com.syntax.class15;

public class StringDemo02 {
    // charAt(int index)
    public static void main(String[] args) {

        String name = "How are you guys @";
        System.out.println(name.charAt(1));

        System.out.println("*********");

        // write a loop to print all the characters of a string

        for (int i = 0; i < name.length(); i++) {
            if (name.endsWith("_")) {
                name = name.substring(0,name.length()-1);
                System.out.println(name);
            } else {
                System.out.print(name.charAt(i) + "_");
            }
        }
    }
}