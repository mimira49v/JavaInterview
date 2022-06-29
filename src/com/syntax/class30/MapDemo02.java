package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/*
set             vs      map
one value               pair of values
 */
public class MapDemo02 {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> fruitMap = new LinkedHashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.0);
        fruitMap.put("Kiwi",105.02);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);

        Set<String> keys = fruitMap.keySet();
        System.out.println(keys);
        Iterator<String> iterator =keys.iterator();
        while (iterator.hasNext()){
            if(iterator.next().contains("e")){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);

    }
}
