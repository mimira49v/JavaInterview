package com.syntax.class20;
// THIS KEYWORD CLASS //
public class Frog {
    String name;
    String color;
    int age;
    double weight;

    public Frog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        //double weight=20;   instance variable
        this.weight=10; //    local variable (always prefered)
    }

    public Frog(String name, String color, int age, double weight) {
        this(name,color,age); //another way if done like this
        // needs to be the first line in the constructor body rule 1)
        this.weight = weight;
        // if NO "this." java always prefers local variables!
    }
    void printInfo(){
        //this() not allowed inside the methods rule 2)
        System.out.println(name+" "+color+" "+age+" "+weight);
    }
}
