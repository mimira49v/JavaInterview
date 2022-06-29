package com.syntax.class16;

public class Task3 {


    public static void main(String[] args) {
    /*
    You have a String a=”Is it saturday? Is it raining?
    Do we have a Java Class today?”
    How would you find out how many sentences are in that String?
     */

        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(a.length()); // .length is a method /here coming from string class
        System.out.println(a.split("[?]").length); // .length is a property /here coming from array class
        int[] arr={10,10};
        System.out.println(arr.length);

        Task3 task3=new Task3();
        System.out.println(task3.method(arr).length);

    }
    String [] method(int[] numbers){
        String [] stringArr=new String[numbers.length];
        return stringArr;
    }
}
