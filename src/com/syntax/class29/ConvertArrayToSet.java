package com.syntax.class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ConvertArrayToSet {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("C");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(arrayList);
        System.out.println(linkedHashSet);     // sout [B, A, C]
        TreeSet <String > treeSet = new TreeSet<>(arrayList);
        System.out.println(treeSet);           // sout [A, B, C]

        arrayList.clear();   // we need to clear the list because
        arrayList.addAll(linkedHashSet);
        System.out.println("Array");
        System.out.println(linkedHashSet);
        // duplicates removed insertion order maintained

    }
}
