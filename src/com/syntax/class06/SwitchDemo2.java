package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// remember the value needs to match 
		// data type needs to match
		
		String answer;
		char choice='Y';
		
		
		switch(choice) { 
		
		case 'Y':
			answer="Yes";
			break;
		case 'N':
			answer="No";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
		}	
	
		System.out.println(answer);
		System.out.println("----------------------------");
		
	/*
	 * declare a variable to store a car 
	 * based on the value of the car define the country of origin
	 * 
	 */
	
	 String car="Lada";
	 String country;
		
		// if youre converting to lower case you have to make sure 
		// that all the matching cases are witten in lower case
		
		switch (car.toLowerCase()) {
			case "bmw":
			
				country="Germany";
				break;
			case "ford":
				country="USA";
				break;
			case "lada":
				country="Russia";
				break;
			case "toyota":
				country="japan";
				break;
			default:
				country="Unknown";
		}
		System.out.println(car+" is from "+country);
	}
}





