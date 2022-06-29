package com.syntax.class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo05 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.0);
        fruitMap.put("Kiwi",105.02);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);
        // entry set is a box inside we have boxes with keys and values.
        System.out.println(fruitMap.entrySet());
        System.out.println("==========================================");
        // sout is [Apple=20.0, Kiwi=105.02, Mango=20.0, Orange=16.5, Banana=10.0]

        for (Map.Entry<String,Double> entry:fruitMap.entrySet()) {
            System.out.println(entry); // gets both
            System.out.println(entry.getKey()); // gets just the key
            System.out.println(entry.getValue()); // gets just the value
            System.out.println("==========================================");
        }
    }
}
