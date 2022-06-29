package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;
 */
public class Task3 {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet<>();
        cities.add("Los Angeles");
        cities.add("San Francisco");
        cities.add("New York");
        cities.add("Miami");
        cities.add("Atlanta");
        cities.add("Walnut Creek");
        cities.add("Arlington");
        cities.add("Oakland");
        cities.add("Boston");
        System.out.println(cities);


        // replaces 4 lines of code (Functional programing)
        // s represents elements one by one Los Angeles San Francisco ....
        cities.removeIf(s -> s.startsWith("A"));
        System.out.println(cities);
        /*

        Iterator<String> iterator = cities.iterator();
        while(iterator.hasNext()){
            if(iterator.next().startsWith("A")){
                iterator.remove();
            }
        }

        */
    }
}
