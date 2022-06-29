package HomeWork;
/*
 * Write a program to find largest number among three numbers using nested if 
 * provided by a user (numbers must be distinct)
 */
import java.util.Scanner;
// *** HOW TO DEBUG ***

public class LargestNumber {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers to find the largest one!");
			
		int num1=in.nextInt();
		System.out.println("What is your next number?");
		int num2=in.nextInt();
		System.out.println("What is your last number?");
		int num3=in.nextInt();
		
		
		
		if (num1==num2 && num2==num3) {
			System.out.println("The numbers are equal");
		}
		
		
		if (num1>num2 && num1>num3) {
		System.out.println("Number"+num1+"is the biggest number");
		
		
		}else if (num2>=num3 && num2>num1) {
		
			System.out.println("Number"+num2+" is the biggest number");
			
			
		}else if (num3>=num1 && num3>num2) {
		System.out.println("Number "+num3+" is the biggest number");
		}
		
		/*
		 *  To debug must put breakpoint from any line you want
		 *  to debug your code
		 *  Click on debug
		 */
		
		
		
	}
}
