package com.syntax.class02;

public class NonPrimitivveType {

	public static void main(String[] args) {
		
		String name = "Kristina"; 
		// always inside dbl quotes " when using string
		// string is a class!! 
		// String is a data type that is a part of non primitives
		String lastName = "Leshtarova";
		long phoneNumber = 1234567890;
		String mobileNumber ="123-456-7890";
		String num = "123";
		int num1 =123;
		String greeting = "Hello Friends";
		
		System.out.println(name);
		System.out.println(lastName); 
		
		//syso+ctrl+space -->autocomplete print statement 
		//we are using a plus sign to make it in the same row
		
		System.out.println(name+" "+lastName);
		
		/*using + we can concatenete (attach)
		 * String +String
		 * String +int
		 * String +bolean
		 * String +double, char et...
		 */
		int age = 29;
		//Aizhan is 25 years old
		System.out.println(name+" is "+age+" years old");
		String feeling = "I like";
		String food = "to yell";
		System.out.println(feeling+" "+food);
		
		feeling = "Im a";
		food = "losotija";
		
		System.out.println(feeling+" "+food);
		/*String - is class that can represent combination of multiple characters
		 * when we have a String value and we want to attach any other type of value to it we use
		 * +=> plays roles as concatenation operator
		 *
		 * = assignment operator
		 * arithmetical operators:
		 * +. -, *,
		 */
		
		
		
	}

}
