package HomeWorkFebruary;

import java.util.Scanner;

public class WeekendOrWeekday {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter numerical value of today's day");
		String day = "weekday";
		int x = scan.nextInt();

		if (x>=1 && x<= 5) {
			System.out.println("It is a week day");
		}else if (x>5 && x<7) {
		System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		System.out.println("----------------------------");
		
		if (x==1 || x==2 || x==3 || x==4 || x==5) {
			System.out.println("It is a week day");
		}else if (x>5 && x<7) {
		System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		System.out.println("----------------------------");

		
	}
}
