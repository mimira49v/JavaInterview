package com.syntax.reviewClass13;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> personInfo = new HashMap<>();
        personInfo.put(1111,"Manana");
        personInfo.put(1234,"Gulden");
        personInfo.put(45664,"Pot");
        personInfo.put(845856,"Eric");

        for (Map.Entry<Integer,String> entry:personInfo.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
