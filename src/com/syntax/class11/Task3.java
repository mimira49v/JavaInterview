package com.syntax.class11;


import java.util.Arrays;


				public class Task3 {

					public static void main(String[] args) {
						
						/*
						 * Create an 2Darray of int values using a scanner and calculate
						 * the sum of all stored elements in that array
						 * pseudo programing
						 * 1)Create the 2d array
						 * 2)print the sum of all numbers
						 */
						
						
						//Create the 2D array
						int[][] array2D= {{2,3,4},{5,6},{12,6,8}};
						//3)print out the elements of an array without a loop
						//sum all the elements of the array
						for(int i=0; i<array2D.length; i++) {
						System.out.println(Arrays.toString(array2D));
						//4)sum all the elements of the array
						int sum=0;
						for(int x=0; x<array2D.length; x++) {
							
						for(int i1=0; i1<array2D[x].length; i1++) {
						int	element=array2D[x][i1];
						if(element%2==0) {
							System.out.println(element);
						}
						}
						}
						}
						
						
						
						
					}

		


	}

