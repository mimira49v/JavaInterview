package com.syntax.class11;

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		//1) create a 2d array of intengers
		//2) develop a program which will calculate the sum of even and odd 
		//3) number for that array.
		//4) check the if element is even if it is add it to sumEven variable
		//5) check the if element is odd if it is add it to oddEven variable
		//6) print the values of both variables 
		
		int[][] array2D= {{2,3,4},{5,6},{12,6,8}};
		int sumEven=0;
		int sumOdd=0;
		for(int[] row:array2D) {				 //getting rows
			for(int element:row) { 				// getting individual elements form the rows
				if(element%2==0) { 
					sumEven+=element;
				} else {
					sumOdd+=element;
				}
			}
		}
		System.out.println("Sum of even numbers"+sumEven);
		System.out.println("Sum of odd number"+sumOdd);
	}
	}