package com.syntax.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapDemo03 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap = new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.0);
        fruitMap.put("Kiwi",105.02);
        fruitMap.put("Orange",16.5);
        fruitMap.put("Mango",20.0);
        Collection<Double> values = fruitMap.values();
        System.out.println(values);
        Iterator<Double> iterator = values.iterator();
        while(iterator.hasNext()){
            if(iterator.next()>=20){
                iterator.remove();
            }
        }
        System.out.println(values);
    }
}
