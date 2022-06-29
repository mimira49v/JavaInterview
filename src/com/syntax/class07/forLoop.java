package com.syntax.class07;

public class forLoop {

	public static void main(String[] args) {
		/*
		 * most widely loop in java
		 * i want to say hello 5 time
		 * 
		 * for (int i=1; i<=5; i++) {}
		 * syso("hello")
		 * 
		 * initialization
		 * condition
		 * increment or decrement
		 * 
		 */
		
		
		for (int i=1; i<=5; i++) {
			// i++ hapens after the code is executed first time!!!!!! Important
			System.out.println("Hello");
			
		}
		System.out.println(" I need to print numbers from 1 to 20: ");
		for(int i=1; i<=20; i++) {
			System.out.print(i+" ");
		}
	}

}
