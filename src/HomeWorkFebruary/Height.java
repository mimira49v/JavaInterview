package HomeWorkFebruary;

import java.util.Scanner;

public class Height {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height in inches");
		int P =scan.nextInt();
		int x = 60;
		int y = 72;
		
		if(P<x) {
			System.out.println("Short");
		}else if (P>x && P<y) {
			System.out.println("medium");
		}else {
			System.out.println("Tall");
		}
		
}
}
