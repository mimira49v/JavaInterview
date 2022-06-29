package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

		public class Task2 {

			public static void main(String[] args) {
				
				/*
				 * Create an 2D array of int values using a scanner and calculate
				 * the sum of all stored elements in that array
				 * pseudo programing
				 * 1)Create the 2d array
				 * 2)print the sum of all numbers
				 */
				
				
				//Create the 2D array
				int[][] array2D= {{10,10,10},{20,20,20},{30,30,30}};
				//3)print out the elements of an array without a loop
				//sum all the elements of the array

				System.out.println(Arrays.toString(array2D));
				//4)sum all the elements of the array
				int sum=0;
				for(int x=0; x<array2D.length; x++) {
					System.out.println(Arrays.toString(array2D[x]));
				for(int i=0; i<array2D[x].length; i++) {
					sum=sum+array2D[x][i];
				}
				}
				System.out.println("Sum of Array "+sum);
				
				
				
				
			}

	}

