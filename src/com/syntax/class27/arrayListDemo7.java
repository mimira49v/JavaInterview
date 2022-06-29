package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class arrayListDemo7 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(20);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(1,100);


        // here computer won't be doing a lot of work
        // better way to store the data
        // does not use an ARRAY!!! to store the data
       LinkedList<Integer>numbers=new LinkedList<>();
       numbers.add(10);
       numbers.add(12);
       numbers.add(20);
       numbers.add(40);
       numbers.add(50);
       numbers.add(1,100);
    }
}
