package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("Java");
        courses.add("Java");
        courses.add("Selenium");
        // USING LOOP TO PRINT THE ARRAY AND REMOVE ITEM JAVA
        Iterator<String> iterator=courses.iterator();
        System.out.println(courses);

        while(iterator.hasNext()){
           if(iterator.next().equals("Java")){
               iterator.remove();
           }
        }
        System.out.println(courses);
    }
}
// When you are doing any operations on the Lists that can change
// its size use Iterator otherwise use loops