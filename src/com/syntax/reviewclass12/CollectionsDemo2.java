package com.syntax.reviewclass12;

import java.util.ArrayList;

public class CollectionsDemo2 {

    public static void main(String[] args) {

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.remove("Mango");
        System.out.println(fruit);
        ArrayList<Fruit> f=new ArrayList<>();
        f.add(new Fruit("Apple"));
        f.add(new Fruit("Orange"));
        f.add(new Fruit("Mango"));
        f.remove(new Fruit("Mango"));
        System.out.println(f);
    }
}
class Fruit {
    String name;
    Fruit(String name) {
        this.name = name;
    }

    //instead of checking the address of objects we check if the fruit name is
    //same or not if it is same we consider the object also the same
    //Equals method when we overwrite it we can check for the equality of two objects
    // based on the fields of that class instead
    public boolean equals(Object o) {
        return name.equals(((Fruit) o).name);
    }
    //By default, toString method from the Object class is used to printout an
    // object, but it only prints the addresses of objects if we want to print out the
    //actual fields of a class we override the toString method
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
