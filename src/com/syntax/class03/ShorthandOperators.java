package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		// +, -, *, /, %
		// = is an assignment operator
				
		int num = 100;
		num = num + 100;
		
		System.out.println(num); // 200
		
		num +=100; // this exact means --> this num = num + 100
		System.out.println(num); //300 output cuz of the addition
		
		num-=20; // output 280
		
		num/=10; // output 280 ; shorter way of num = num/10
		System.out.println(num); //20
		
		num%= 2;
		System.out.println(num); //
		num%=3;
		System.out.println(num); //1

	}

}
