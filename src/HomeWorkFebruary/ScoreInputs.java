package HomeWorkFebruary;
/*
 * Write a program that will read three inputs of scores (quiz, mid term, and final scores) 
 * and determine the grade based on the following rules: 

if the average score >=90 			 grade=A
if the average score >= 70 and <90   grade=B
if the average score>=50 and <70  	 grade=C
if the average score<50  			 grade=F

 */

import java.util.Scanner;

public class ScoreInputs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the scores:");

		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		int total = x+y+z;
		
		if (total>=90) {
			System.out.println("Grade A");
		}
		else if (total>=70 && total<90) {
			System.out.println("Grade B");
		}
		else if (total>=50 && total<70) {
			System.out.println("Grade C");
		}
		else if (total<50) {
			System.out.println("Grade F");
		}
		
	}

}
