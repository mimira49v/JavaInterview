package com.syntax.class28;

import java.util.ArrayList;

public class Task3_HomeWork {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coke");
        drinks.add("Tea");
        drinks.add("coffee");
        drinks.add("milk");

        for (int i = 0; i < drinks.size() ; i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
    }
}
