package HomeWorkFebruary;

import java.util.Scanner;

public class userInputTime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the time:");
		
		int x = scan.nextInt();
		
		if (x>=1 && x<=11) {
			System.out.println("Morning");
		}
		else if (x>=12 && x<=15) {
			System.out.println("Afternoon");
		}
		else if (x>=16 && x<=20) {
			System.out.println("Evening");
		}
		else if (x>=21 && x<=24)  {
			System.out.println("Night");
		}
		
		
		
		
	}

}

