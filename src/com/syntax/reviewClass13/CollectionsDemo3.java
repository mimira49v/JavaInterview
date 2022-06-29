package com.syntax.reviewClass13;

import java.util.ArrayList;

public class CollectionsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            names.add("adfdafdafafafafafa");
        }
        long startTime = System.currentTimeMillis();
        long count = names.stream().filter(x->x.length()>5).count();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

        long startTime1 = System.currentTimeMillis();
        // beast mode uses all cores and divides the tasks
        long count1 = names.parallelStream().filter(x->x.length()>5).count();
        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
    }
}
