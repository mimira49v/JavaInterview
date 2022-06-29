package HomeWorkFebruary;

import java.util.Scanner;

public class valueForSale {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Is there a sale:");
		String sale = scan.next();
		
		if (sale.equalsIgnoreCase("No")) {
			System.out.println("You are not going for shopping?");
		}else {
		System.out.println("What is the price?");
	}
		double price = scan.nextDouble();
		double comp = 0;
		
		if (price<20) {
			comp = 10;
		}else if (price>=20 && price<100) {
			comp = 20;
		}else if (price>=100 && price<500) {
			comp = 30;
		}else {
			comp=50;
		}
		double afterComp= price - (price*comp/100);
		
		System.out.println("After discount "+comp+" % the price of the item reduce from "+price+" to "+afterComp);
		System.out.println("-----------------------------------------------------------------------------------");
		int price1 = 0;
		switch (price1) {
		
		}

		
		
		
		
}
	}