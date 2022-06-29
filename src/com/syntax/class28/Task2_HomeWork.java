package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2_HomeWork {
    //Create an arrayList of words. Remove every word that ends with “e”.
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Love");
        arrayList.add("Lahore");
        arrayList.add("cake");

        arrayList.removeIf(s -> s.toLowerCase().endsWith("e"));
        // s - is a variable (box)
        // java will pass one by one element to the s
        System.out.println(arrayList);
    }
}
