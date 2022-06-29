package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		/*
		 * Create a secret number
		 * 
		 * we want user to guess our secret number
		 * 
		 * the moment user guessed my secret number -->my program should stop
		 * otherwise it should continue asking to guess my number
		 * 
		 * (first we are asking cuz theres no condition at first so we are using do)
		 */
		
		int secretNumber=12;
		Scanner scan = new Scanner(System.in);
		int guessNumber; // declaration outside !!!! IMPORTANT 
		

		do {
			System.out.println("Please enter the number to win:");
			guessNumber=scan.nextInt();  // storing inside !!!!
			
		}while(guessNumber!=secretNumber);
		
		System.out.println("Congratulations");
	}

}
