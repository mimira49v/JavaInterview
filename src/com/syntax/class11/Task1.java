package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of int values using a scanner and calculate
		 * the sum of all stored elements in that array
		 * pseudo programing
		 * a class that helps use take the input from the user
		 */
		
		//take the size of the array using scanner class from the user 
		//create an int array of above size
		//fill the array with elements from the user using scanner class
		//sum all the elements of the array
		
		Scanner scanner=new Scanner(System.in);
		//promt the user for the size
		System.out.println("Please enter the size of the array :");
		//take the size from the user and store it in the size variable
		int size=scanner.nextInt();
		//print out the size
		System.out.println("Size of the array "+size);
	
		//2)create an int array of above size
		int[] array=new int[size];
		//fill the array with elements from the user using scanner class
		System.out.println("Please enter "+size+"element");
		for(int i=0; i<size; i++) {
			System.out.println("Please enter the element for index "+i);
			array[i]=scanner.nextInt();
			
		}
		//3)print out the elements of an array without a loop
		System.out.println(Arrays.toString(array));
		//sum all the elements of the array
		int sum=0;
		for(int x=0; x<size; x++) {
			sum=sum+array[x];
			//sum+=array[x];
		}
		System.out.println("Sum of Array "+sum);
	}

}
