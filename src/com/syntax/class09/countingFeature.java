package com.syntax.class09;

public class countingFeature {

	public static void main(String[] args) {
		
		// how many elements inside array? grade.lenth calculates 
		char[] grade= {'A','B','C','D'};
		
		int size=grade.length;
		
		System.out.println("Numbers of elements is = "+size);
		
		/*
		 *  System.out.println(grade[1]);
		 *  System.out.println(grade[2]);
		 * 	System.out.println(grade[3]);
		 */
		
	
		/*
		 * if  you put i<=grade.lenght youre getting an ERROR cuz theres only 3 grades cuz it starts from 0!!!
		 * thats why we shouldnt have an equal sign ***
		 * java.lang.ArrayIndexOutOfBoundsException
		 * 
		 */
		for(int i=0; i<grade.length; i++) {
		
			System.out.print(grade[i]+" ");
			System.out.println("-----------------------------");
			
		}
		
		String[] cities= {"Washington DC", "Boston", "Miami", "Los Angeles", "New York"};
		// if value is Miami -->i want to live in Miami
		
		for(int a=0; a<cities.length; a++) {
			System.out.print(cities[a]+" ");
			
		if(cities[a].equals("Maimi")) {
			System.out.println("I want to live in Miami");
		}
		}
		
		
	}		
}