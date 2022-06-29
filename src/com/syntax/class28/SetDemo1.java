package com.syntax.class28;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        // this class is not maintaining insertion order
        // NO DUPLICATES
        HashSet<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit); // only  one Apple is printed!
    }

}