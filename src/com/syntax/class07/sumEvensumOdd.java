package com.syntax.class07;

public class sumEvensumOdd {

	public static void main(String[] args) {
		/*
		 * i want to find out the sum of all even 
		 * and then all odd numbers from the range 1-50
		 */
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1; i<=50; i++) {
			
			if(i%2==0) {
				sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
			}
		}
		System.out.println(sumEven); // sum of even
		System.out.println(sumOdd);  // sum of odd
	
		
		
	}

}
