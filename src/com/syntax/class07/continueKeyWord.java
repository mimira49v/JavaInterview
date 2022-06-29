package com.syntax.class07;

public class continueKeyWord {

	public static void main(String[] args) {
		
		for(int i=1; i<=7; i++) {
		
		// basically when 4==3 cuz its false continue makes it go on!!!!
		// skip  current cycle skip whatever you have after 

			if(i==3) {
				continue; 
				}
			System.out.println("Hello");
			System.out.println("Batch 12");
			
		}
		System.out.println("=================================================");
		// i want to print all numbers from 1-10 EXCEPT num 4 and 7
		// now we wont see number 4
		// thats why we gonna use || cuz both cant be true at the same time
		for(int i=1; i<=10; i++) {
			
			if(i==4 || i==7) {
				continue;
			}
			System.out.print(i+" ");
		}
	}

}
