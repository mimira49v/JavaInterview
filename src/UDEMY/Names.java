package UDEMY;

import java.util.HashSet;

public class Names {
    public static void main(String[] args) {
        HashSet <String> names = new HashSet<String>();
        names.add("David");
        names.add("Bryan");
        names.add("Cynthia");
        System.out.println(names.size());
        for (String name: names){
            System.out.println(name);
        }
        names.remove("David");
        names.add("Raymond");
        String name = "David";
        if (name.contains(name)){
            System.out.println(name+" is in the collections");
        } else {
            System.out.println(name + " is not in the collections");
        }
        // Printing out new names
        for (String n : names){
            System.out.println(n);
        }
        names.clear();
        System.out.println("The number of names is 0");
    }
}
