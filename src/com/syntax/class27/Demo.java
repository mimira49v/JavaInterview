package com.syntax.class27;

import java.util.ArrayList;

public class Demo {
    // Create an ArrayList that will store 5 names into it.
//Find out whether the given ArrayList is empty or not?
//Check whether the specific name is present in an ArrayList or not?
//Find the size of your arrayList and print all values from that
    public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
        names.add("Zakirullah");
        names.add("Emilia");
        names.add("Mila");
        names.add("Cece");
        names.add("Basir");

        System.out.println("Is the names array list empty? " + names.isEmpty());
        System.out.println("Zakirullah is present? " + names.contains("Zakirullah"));
        System.out.println("Size of names Array List? " + names.size());
        System.out.println(names);
    }
}
