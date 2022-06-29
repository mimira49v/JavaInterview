package com.syntax.class10;

public class AllValuesFrom2Darray {

	public static void main(String[] args) {
		int[] [] numbers= {
				
				{10,20,30,40},
				
				{100,200,300,400},
				
				{1000,2000}
		};
		int size=numbers.length;
	//numbers.lenght ->gives # of rows
		System.out.println(size); // when used with 2d array gives # of 1d arrays that we stored
		
		
		//retriving all elements from 2d array
		//numbers.length here is 3
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[0].length; j++) {
				System.out.println(numbers[i][j]);

			int sizeOf1Array=numbers[0].length;
			System.out.println("Size of second array ="+sizeOf1Array); //4
			int sizeof2Array=numbers[1].length; //4
			System.out.println("Size of second array ="+sizeof2Array);
			int sizeof3Array=numbers[2].length; //4
			System.out.println("Size of third array ="+sizeof3Array);
		}
			
		}
	}
}
