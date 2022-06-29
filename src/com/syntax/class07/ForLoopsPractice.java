package com.syntax.class07;

public class ForLoopsPractice {

	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			System.out.println("Hello "+i);
			
		}
		
		System.out.println("    MULTIPLICATION TABLE   ");
		
		int num=7;
		int result;
		
		for(int i=1; i<=10; i++) {
			
			result=num*i;
			
			System.out.println(num+" X "+i+" = "+result);
		}
		
		System.out.println(" - What is the output- ");
	
		for(int i=0; i<=10; i+=3) { // adding 3 ( i+=3 ) !!
			System.out.println(i+" ");
		}
		
		System.out.println("---------------------------");
	
		int sum=0;
		for (int i=1; i<=5; i++) {
		
			// loop runs until its true!!!! thats why it cant exit right away
		
		sum+=1;
		
		System.out.println(sum); 
		
		// if this is out of block of code it prints only one time ( 5 )
		
		// inside the block of code prints all 1 2 3 4 5
		
		
		} System.out.println("---------------------------------------------------");
	
	

		int value=1;
		for(int i=1; i<4; i++) {
			value*=1;
		}
			System.out.println(value);
			
			System.out.println("--------------------------------------------------");
			
			
			
			
			
}	
}