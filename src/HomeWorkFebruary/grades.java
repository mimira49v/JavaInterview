package HomeWorkFebruary;

import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your GRADE:");
		char grade = scan.next().charAt(0);
		String value;
		switch(grade) {
			case 'A':
				value="Excellent";
				break;
			case 'B':
			value="Good";
			break;
			case 'C':
				value="Average";
				break;
			case 'D':
				value="Bad";
				break;	
			default:
				value="Not Acceptable";
				break;
		
	}
		   System.out.println(grade+" = "+value);

}
}
