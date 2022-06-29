package HomeWork;
/*
 * Write a program to ask user to enter 
 * numbers of worked years and annual salary. 
 * If user worked for more or equals to 5 years 
 * than user is eligible for the bonus, otherwise he is not. 
 * Once user is eligible and salary is larger than 50000 
 * than bonus = 5000, otherwise bonus=3000.
 */
import java.util.Scanner;

public class SalaryAndYears {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many years you worked here?");
		int yearsWorked=in.nextInt();
		System.out.println("You have worked for "+yearsWorked+" years "+"how much is your salary?");
		int salary=in.nextInt();
		
		
		
		if (yearsWorked>5) {
			System.out.println("Eligible for a bonus");
		}
		if (salary>50000) {
		System.out.println("Eligible for 5000$ BONUS");
		
		
		}else if (salary<=5000) {
			System.out.println("Eligible for 3000$ BONUS");
		}else {
			System.out.println("Not eligible for a BONUS");
		}
		
		
		
		
 }
}