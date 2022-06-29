package com.syntax.class29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MapsDemo01 {
    public static void main(String[] args) {

        ArrayList <String> names= new ArrayList<>();
        names.add("Asghar Nazir");
        names.add("Muhammed");
        System.out.println(names);


        // what you provide in the header that's what you need to use
        HashMap<Integer, String > map = new HashMap<>();
        map.put(123,"Asghar");
        map.put(123456,"Muhammed");

        System.out.println(map);

        HashMap<String, String> groceries = new HashMap<>();
        groceries.put("Lilly","Eggs,milk,bread etc");
        groceries.put("Tayfur","Mac,pro,Monitor etc");
        groceries.put("Asghar","Windows,key,xps etc");

        System.out.println(groceries.get("Lilly"));
    }
}
