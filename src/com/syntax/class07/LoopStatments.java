package com.syntax.class07;

public class LoopStatments {

	public static void main(String[] args) {
		
		int num=10;
		
		num=num+1;
		
		num+=1;
		
		num++; // ++ adds one to the variable  (variable only)
		
		System.out.println(num);
		num++;
		System.out.println(num);
		// 10++ wont work (only with variable)
		//  CE: Invalid argument to operation ++/--
		
		// decrement operator subtract 1 from a variable
		
		num--;
		num--;
		num--;
		System.out.println(num); //11
		
		// loop statements repeats the code as long as condition is true
		// why do we need them?
		// while is loop -->repeats block of code as long as the condition is true;
		
		int time=11;
		if (time<12) {
			System.out.println("Morning"); // one time output cuz one time Syso
		}
		while (time<12) {
			System.out.println("Morning"); // it repeats the same code 
		}
	}

}
