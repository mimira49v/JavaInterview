package com.syntax.reviewClass13;

import java.util.ArrayList;
import java.util.ListIterator;

public class CollectionsDemo2 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Orsan");
        names.add("Nassir");
        names.add("Mujeeb");
        names.add("Tolga");
        /*
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            if(iterator.next().length()>5){
                iterator.remove();
            }
        }
        System.out.println(names);
    }*/
        ListIterator<String> stringListIterator = names.listIterator();
        while(stringListIterator.hasNext()){
            String name = (String)stringListIterator.next();
            stringListIterator.add("Zulfiya");
        }
        System.out.println(names);
    }
}
