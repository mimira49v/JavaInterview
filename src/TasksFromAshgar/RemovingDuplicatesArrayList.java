package TasksFromAshgar;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicatesArrayList {
    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("Jbds");
        aList.add("John");
        aList.add("John");


        HashSet<String>set = new HashSet<>(aList);
        System.out.println(set);


        HashSet<String>hset=new HashSet<>();
        for(String name:aList){
            hset.add(name);
        }
        System.out.println(hset);
    }
}
