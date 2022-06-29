package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> groceries=new ArrayList<>();
        groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");
        System.out.println(groceries);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple"); // all the elements that are added to this list
        itemsToBeRemoved.add("Onion"); // and are present inside groceries list will be removed
        itemsToBeRemoved.add("Onion");

        groceries.removeAll(itemsToBeRemoved);
        System.out.println(groceries);
    }
}
