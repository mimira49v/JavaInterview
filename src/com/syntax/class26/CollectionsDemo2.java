package com.syntax.class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Usa");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("Gana");
        countries.add("Eritea");
        countries.add("Afghanistan");
        // System.out.println(countries.get(3));
        // System.out.println(countries.get());
        System.out.println(countries);
        countries.add(3,"Pakistan"); // it inserts the elements at this specified index
        System.out.println(countries);
        System.out.println(countries.size());
        // countries.clear(); clears the array prints :  []
        countries.remove("Pakistan");
        System.out.println(countries);
    }
}
