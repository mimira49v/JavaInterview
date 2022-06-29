package com.syntax.class11;

public class Task9 {

	public static void main(String[] args) {
		/*
		 *  Maximum and minimum number in the array?
		 * 	
		 */
		
		int[] arr= {10,20,90,50,70}; 
		// assuming first number is the largest number
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		// assuming first number is the smallest number
	
		for(int elements:arr) {
			
			if(elements>largest) {
				secondLargest=largest;
				largest=elements;
				
			}
		
			

		}
		System.out.println("Largest number is "+largest);
	}

}
