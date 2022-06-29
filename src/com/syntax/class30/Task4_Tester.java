package com.syntax.class30;

import java.util.Map;
import java.util.TreeMap;

public class Task4_Tester {
    public static void main(String[] args) {
        TreeMap<String,Person> personTreeMap = new TreeMap<>();
        personTreeMap.put("a",new Person("Safiul","Daddaa",25,15000));
        personTreeMap.put("b",new Person("Safiul","Daddaa",25,15000));
        personTreeMap.put("c",new Person("Safiul","Daddaa",25,15000));
        personTreeMap.put("d",new Person("Safiul","Daddaa",25,15000));

        for(Map.Entry<String,Person> p:personTreeMap.entrySet()){
            System.out.println(p);
        }
    }
}
