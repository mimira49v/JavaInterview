package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 16;

		System.out.println(num1 > num2); // false
		System.out.println(num1 == num2);// false
		System.out.println(num1 < num2);// true

		// result is always a boolean value

		boolean result = num1 != num2;
		System.out.println("Result is " + result);
		// one = is an assignment operator
		// == is a comparing operation

		System.out.println(num1 = num2); // you are assining 16 to num 1
		System.out.println(num1); // 16
		System.out.println(num1 == num2); // here num1 is 16 cuz of the line 20 so this is true!!!! so 16=16

	}

}
