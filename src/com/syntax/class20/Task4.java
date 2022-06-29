package com.syntax.class20;

public class Task4 {
    /*
    Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */
    String bookName;
    double price;

    public Task4(){
        System.out.println("No argument constructor");
    }

    public Task4(String bookName, double price) {
        this(); // calls the Task4()constructor, calling constructor inside another one
        this.bookName = bookName;
        this.price = price;
        System.out.println("two argument constructor");
    }
}