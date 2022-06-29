package com.syntax.class03;

import java.util.Scanner;

public class moreExample {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your full name");
		// if you need to capture more than 1 word -> use nextLine();
		String name=in.nextLine();
		System.out.println(name);
		
	}

}
