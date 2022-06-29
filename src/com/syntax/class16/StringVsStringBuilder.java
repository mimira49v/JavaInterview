package com.syntax.class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        // class 01 original string doesn't get modified
        String s=new String("Ashgar is great");
        System.out.println(s.replaceAll(" ",""));
        System.out.println(s);

        StringBuilder stringBuilder=new StringBuilder("Ashgar is great");
        // class 02 here string gets modified with stringBuilder
        System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder);

        //Showed differently

        // class 01 original string doesn't get modified
        String s1=new String("Ashgar is great"); // original string
        s.concat("hahaha");    // add new String hahaha to the string
        System.out.println(s); // printing out the original string

        // class 02 here string gets modified with stringBuilder
        StringBuilder stringBuilder2=new StringBuilder("Ashgar is Great"); // original string
        stringBuilder.append("Hahaha");    // add new String hahaha the string
        System.out.println(stringBuilder); // printing out the original string




        }
    }
