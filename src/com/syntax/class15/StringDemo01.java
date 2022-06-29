package com.syntax.class15;

public class StringDemo01 {

    public static void main(String[] args) {
        String userName="LILLY";
        String password="Lilly123";

        if("Lilly".equals(userName)&& "Lilly123".equals(password)){
            System.out.println("Welcome back");
        }else {
            System.out.println("UserNamer or password is not correct");
        }
        System.out.println("************************************");

        if("Lilly".equalsIgnoreCase(userName)&& "Lilly123".equals(password)){
            System.out.println("Welcome back");
        }else {
            System.out.println("UserNamer or password is not correct");
        }
    }
}
