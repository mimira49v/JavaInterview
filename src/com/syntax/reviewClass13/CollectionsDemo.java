package com.syntax.reviewClass13;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<LinkedList<String>> complexData = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Medine");
        linkedList.add("Daria");
        linkedList.add("Charles");

        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Medine");
        linkedList2.add("Daria");
        linkedList2.add("Charles");

        complexData.add(linkedList);
        complexData.add(linkedList2);

        System.out.println(complexData);
    }
}
