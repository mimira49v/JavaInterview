package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		
		/* create a variable and assign a value
		 * 
		 * declare a variable and initialize
		 */
		
		double age = 25;
	// 2 way of doing it
		int num; // declare variable
		num = 10; // initialize it
		num = 100; // reassign the value
		
		
		int n1, n2, n3; //all 3 variables are on the int type
		
		n1 = 10;
		n2 = 20;
		n3 = 30;
		// ctrl+d removes entire line!!!
		
		age = 26; //reassign(changing) the value of the variable
		age = 26.5; // assigned a difrent data type ( Double )
		
		System.out.println(age);
		
		age = 100; //reassign not gonna work cuz it goes top to bottom
		
		
		//Java rules for identifiers
				// indentifier = name 
		
		//boolean break = false; ERROR:  cant use the keyword as identifier (Name)
		boolean Break = true; // no special meaning so we can use this box
		
		// char 1character='A';  ERROR:  Rule do not START identifier (name) with numbers 
		char character1 = 'a';//Number at the end is fine
		
		// double %value = 12.99;ERROR: dont START identifier (name) with special characters
		// Java allows to use _ OR $ as identifier
		
		double $price = 1.99; // Should not start with + $ based on oracle but it can be used
		double _value = 2.99;
		
		/* standard is to write the lower case code 
		 * class name shoult start with upper case
		 * give variables a meaningful name
		 * if name has 2 or more words -->follow camel casing
		 */
		
		int bigNumber = 12345; // dont start with upper case follow camel casing after
		
		// char is single quotes ''
		
		

			
	}

}
