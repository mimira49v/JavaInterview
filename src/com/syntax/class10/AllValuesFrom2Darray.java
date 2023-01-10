package com.syntax.class10;

public class AllValuesFrom2Darray {

	public static void main(String[] args) {
		int[] [] numbers= {
				
				{10,20,30,40},
				
				{100,200,300,400},
				
				{1000,2000}
		};

// 		ACCESSING INDIVIDUAL ARRAYS
		for (int[] innerArray : numbers) {
// 			second for...each loop access EACH element inside the row
			for (int data : innerArray) {
				System.out.println(data);
			}
		}





		int size=numbers.length;
		//numbers.lenght ->gives # of rows
		System.out.println(size); // when used with 2d array gives # of 1d arrays that we stored
		
		

		
//		for(int i=0; i<numbers.length; i++) {
//			for(int j=0; j<numbers[0].length; j++) {
//				System.out.println(numbers[i][j]);
//			}
//		}


	}
}
