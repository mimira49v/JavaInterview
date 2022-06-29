package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */
public class Task_2 {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("France", "Paris");
        countries.put("Italy", "Rome");
        countries.put("Sweden", "Stockholm");
        countries.put("Germany", "Berlin");

        System.out.println("===================MAP SAME LINE=====================================");

        for (Map.Entry<String, String> entry : countries.entrySet()
        ) {
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
        System.out.println("===================MAP NEW LINE=====================================");

        Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("==================FOR EACH======================================");

        // PART 2 PRINT ALL VALUES USING FOR EACH LOOP AND ITERATOR
        for (String value: countries.values()
        ) {
            System.out.println(value);
        }

        System.out.println("==================ITERATOR======================================");

        Iterator<String> iterator2 = countries.values().iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
