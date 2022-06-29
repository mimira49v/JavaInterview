package com.syntax.class23;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;
    //  overloading the constructors

    Dog(){ //constructor
        System.out.println("No Argument constructor");
    }
    Dog(String name){
       this.name=name;
    }

    public Dog(String name, String color, String breed, int age, double weight) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    void changeInfo(String name,String color){
        this.name=name;
        this.color=color;

    }void changeInfo(String name,String color,String bread){
        this.name=name;
        this.color=color;
        this.breed=bread;


    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", age='" + age + '\'' +
                ", weight=" + weight +
                '}';
    }
    // 1 if else conditions
    // 2 loops
    // 3 methods
    // 4 inheritance(just go through)
    // 5 constructors and this keyword how to call a constructor and pass a parameter
    // 6 Access modifiers
    // 7 Types of variables
    // go through the slides!!!
}
