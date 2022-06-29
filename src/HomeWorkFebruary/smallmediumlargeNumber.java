package HomeWorkFebruary;

import java.util.Scanner;

public class smallmediumlargeNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int x = scan.nextInt();
		
		if(x<=10 && x>=1) {
			System.out.println("Small number");
		}
		else if (x>=11 && x<=100) {
			System.out.println("Medium number");
		}
		else {
			System.out.println("Large number");
		}
	
	
	
	
	
	}

}
