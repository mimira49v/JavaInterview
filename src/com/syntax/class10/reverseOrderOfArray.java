package com.syntax.class10;

public class reverseOrderOfArray {

	public static void main(String[] args) {
		// create an array and retrive all elements in reverse order
		
		int[] numbers= {10,20,30,40,50,60};
		
		
		for(int y=numbers.length-1; y>=0; y--) {
			
			System.out.println(numbers[y]+" ");
			
		}
		System.out.println("/n------------------------------------");
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[numbers.length-i-1]);
		}
	}

}
