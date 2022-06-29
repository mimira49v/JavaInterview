package com.syntax.class19;

public class Car {
    String name="toyota";  // instance variables
    String make;  // instance variables
    String color; // instance variables
    String type;  // instance variables

    public Car(String name, String make, String color, String type) {
        this.name = name;
        this.make = make;
        this.color = color;
        this.type = type;
    }
    void PrintCar(){
        String name = "Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }
    Car(){

    }
}
