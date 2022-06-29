package HomeWork;

public class HomeWork1 {

	public static void main(String[] args) {
		/*
		 * Write a program to check whether number is positive or negative
		 */
		// task 3

		int num = 7;

		if (num < 0) {

			// condition was true thats why code was executed

			System.out.println(num + " - this number is negative ");
		} else if (num > 0) {
			System.out.println(num + " - this number is positive ");
		} else {
			System.out.println("The number is " + num);
			
			
		}
// we go for if else if when we have to test multiple conditions
		
		/*
		 * Write a java program to check whether number is even or odd.
		 */
		
		//interview question ****
		
		int num1 = 100;

		if (num1 % 2==0) {

		System.out.println("This "+num1 + " is an even Number");
		} else if (num > 0) {
			System.out.println("The"+num1 + " is an Odd Number");
		} 
	}

}
