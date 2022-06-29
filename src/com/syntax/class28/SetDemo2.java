package com.syntax.class28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        // IF YOU WANT TO MAINTAIN INSERTION ORDER
        // LinkedHashSet - still removes the duplicates
        // Slower performance
        LinkedHashSet<String> fruit = new LinkedHashSet<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);
    }
}
