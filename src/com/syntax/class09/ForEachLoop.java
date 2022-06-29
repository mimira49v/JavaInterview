package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		String[] cities= {"Washington DC", "Boston", "Miami", "Los Angeles", "New York"};
		
		//if you have an array you can use for each loop to iterate/loop through the entire array
		
		for(String city:cities) {
			System.out.println(city);
			
		}
		System.out.println("----------------------------------------------");
	
		int[] numbers= {10, 20, 30, 40};
		
		for(int num:numbers) {
			System.out.println(num);
		}
		System.out.println("/n--------------------------------------------");
		
		
		String[] cars= {"Audi", "Bmw", "Honda", "Ford"};
		
		//for each
		
		for(String car:cars) {
			System.out.println(car+" ");
		}
	}

}
