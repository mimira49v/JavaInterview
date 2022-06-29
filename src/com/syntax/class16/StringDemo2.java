package com.syntax.class16;

import java.util.Locale;

public class StringDemo2 {
    public static void main(String[] args) {
        String str="123456!#$%dahfafAHUSERHU";
        String str2=str.toLowerCase();
        System.out.println(str.replaceAll("[0-9]","Julia"));
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[A-Z]",""));
        System.out.println(str.replaceAll("[A-Z]",""));
        System.out.println(str.replaceAll("[A-Za-z0-9]",""));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));

    }
}
