package com.syntax.class05;

/*
 *  tO TEST MULTIPLE CONDITIONS IN 1 STATMENT??? && || ! ; and, or, not.
 *  Yes --> using logical operators
 *  and &&
 *  
 *  true && true -->true
 *  false && true -->false
 *  true && false -->false
 *  false && false -->false
 */

public class LogicalOperators {

	public static void main(String[] args) {
		boolean likeJava=false;
		boolean understandJava=false;
		
		if(likeJava && understandJava) {
			System.out.println("This is best combination");
		}
		System.out.println("End of code");
		
	/*when we want to compare 3 number
	 * if
	 * (num1>num2 && num1>num3) --> num1 is the largest
	 * else if 
	 * (num2>num1 && num2>num3) --> num2 is the largest
	 * else if
	 * (num3>num1 && num3>num2) --> num3 is the largest
	 * 
	 */

		int num1=10;
		int num2=20;
		int num3=30;
		
		if (num1>num2 && num1>num3) {
		System.out.println(num1+" is the largest number");
		}
		else if (num2>num1 && num2>num3){
			System.out.println(num2+" is the largest number");
			}
		else if (num3>num2 && num3>num1){
			System.out.println(num3+" is the largest number");
			}
		
	}	
}
