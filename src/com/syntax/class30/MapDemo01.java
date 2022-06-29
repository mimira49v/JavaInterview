package com.syntax.class30;

import java.util.HashMap;

public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap = new HashMap<>();
        // fruitMap.put("Apple",20); auto casting does not happen in collections and maps
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.0);
        fruitMap.put("Kiwi",105.02);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);
        fruitMap.put("Banana",12.5); // duplicate values are overwritten!!!!! its being reassigned
        System.out.println(fruitMap);
        System.out.println(fruitMap.get("Kiwi")); // sout 105; case sensitive
        System.out.println(fruitMap.remove("Mango")); // removes Mango
        System.out.println(fruitMap);
        System.out.println(fruitMap.containsKey("Kiwi"));
        System.out.println(fruitMap.containsKey("Camel"));
        System.out.println(fruitMap.containsValue(20.0));
        System.out.println(fruitMap.isEmpty());
        System.out.println(fruitMap.size());
        fruitMap.replace("Banana",50.0);
        System.out.println(fruitMap);


    }
}
