package com.syntax.review09;

public class Doctor {

    // instance variables - declared inside the class but outside any method,constructor or block
    public String firstName;
    protected String lastName;
    String speciality;   // default
    private double salary;

    // Static variable - declared inside the class but outside any method, constructor or block
    // using static keyword

    static String hospital= "Jorge Washington";

    // static methods can access only static variables

    // constructor - initializing instance variables
    // Constructor can have access modifiers
    public Doctor(String fristName, String lastName){

        this.firstName=fristName;
        this.lastName=lastName;
    }
    // we can have multiple constructors by overloading them
    Doctor(String fristName, String lastName, String speciality){

        this(fristName, lastName);
        this.speciality=speciality;
    }


    // non-static methods can access static members and non-static members
    // can't put static before void cuz we are not using static variables
    public void printInfo(){
        hello(); // we do not need to put this (compiler adds it)
        System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality+" at "+hospital);
    }
    protected static void work(){

        System.out.println("All doctors work at "+hospital);
    }

    void hello(){
        System.out.println("Hello");

    }
    private void getPaid(){
        System.out.println("Doctor "+firstName+" "+lastName+" gets paid "+salary);
    }
    void work1(){

        System.out.println("All doctors work at "+hospital);
    }
}
