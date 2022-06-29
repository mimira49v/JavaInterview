package com.syntax.class09;

public class hwArray {

	public static void main(String[] args) {
		
	/*
	 * Create an array of cars and store 6 elements into it. 
	 * Using 2 different loops print all values from the array.

	 */
	
		String[] cars=new String[3];
		cars[0]="bmw";
		cars[1]="toyota";
		cars[2]="mercedes";
		
		int car=cars.length;
		
		for(int x=0; x<cars.length; x++) {
			System.out.println(cars[x]+" ");
			}
		System.out.println("-------------------------------------");
 		System.out.println(cars[0]+" "+cars[1]+" "+cars[2]);
 		System.out.println("----------------------------------------");
 		
 		/*
 		 * Create an array of animals and store 5 elements into it. 
 		 * Using 2 different loops print all elements from the array.

 		 */
 		
 		String[] animals=new String[5];
 		
 		animals[0]="cat";
 		animals[1]="dog";	
 		animals[2]="lion";
 		animals[3]="bird";
 		animals[4]="turtle";
 		
 		int anim=animals.length;
 		
 		for(int y=0; y<animals.length; y++) {
 			
 			System.out.println(animals[y]);
 		}
 		System.out.println("-------------------------------------------");
 		System.out.println(animals[0]+" "+animals[1]+" "+animals[2]+" "+animals[3]+" "+animals[4]);
 		
 		/*
 		 * Create an array on integers and 
 		 * calculate the sum of all elements in an array
 		 */
 		
 		int[] numbers= {1,2,3,4,5,6};
		int sum=(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]+numbers[5]);
		System.out.println(sum);
		System.out.println("---------------------------------------------");
	}
}
		/*
		 * From an array of integer elements find the largest number.
		 * (wrote a diferent way that Asel did
		 */

		