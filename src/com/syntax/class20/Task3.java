package com.syntax.class20;

public class Task3 {
    /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
     Print name & address of given  student using displayInfo method.
     */

    String name;
    String adress;

    public Task3(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    void displayInfo(){
        System.out.println(this.name+" "+this.adress);
    }
}
