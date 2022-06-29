package com.syntax.class12;

import java.util.Scanner;

public class Dog {
	//attributes, fields, properties
	String name;
	String color;
	String breed;
	char gender;
	int age;
	double weight;
	// Behaviors, functions and methods 
	void bark() {
		System.out.println("Dog is barking");
	}
	
	void eat() {
		System.out.println("Dog is eating");
	}
	
	void sleep() {
		System.out.println("Dog is sleeping");
	}
	
	
	
	public static void main(String[] args) {
		
		//creating an object scooby from class Dog
		
		Dog scooby = new Dog();
		
		//dog is a class
		//scooby is an object
		//=is an assignment operator
		//Scanner scan=new Scanner(System.in);
		//new is a keyword that we use to create the objects of a class
		//Dog() we are calling the constructor of the class
		Scanner scan=new Scanner(System.in);
		scan.nextInt();
		
		scooby.eat();
		scooby.sleep();
		
		
		
		
	}

}
