package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		// array is one variable that can hold a multiple values!!!
		
		int num=1;
		//declare an array
		int[] numbers=new int[4];
		// storing values/elements inside an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		//print 99
		System.out.println(numbers[3]);
		System.out.println(numbers[3]+numbers[0]);
		
		//I want to create an array of countries
		
		String [] countries = new String[5];
		//index always start with 0!!!!!
		countries[0]="Usa";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		
		// if you do : 
		// countries[5]="Turkey";
		// syntax look good but array index of bounds exception
	
		System.out.println(countries[3]+" "+countries[4]);
		
		String[] names=new String[5];
		names[1]="Orsan";
		names[2]="Gulnar";	
		names[3]="Zakirullah";
		
		System.out.println(names[1]); //Orsan
		System.out.println("Value in index 0 is ="+names[0]);
		
		//change of variable 1 
		names[1]="Daniyar";
		System.out.println(names[1]);
		
		//Create an array to store 4 different prices
		// find an average of how much we spent
		
		Double[] prices=new Double[4];
		
		prices[0]=10.99;
		prices[1]=30.21;
		prices[2]=2.30;
		prices[3]=3.23;
		
		double price = (prices[0]+prices[1]+prices[2]+prices[3])/4;
		
		System.out.println(price);
		
		
		
		
		
	}

}
