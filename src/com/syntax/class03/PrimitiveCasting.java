package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		// main +ctrl+space
		//auto complete
		
		
		int i=10;
		
		double d1=10;
		
		
		System.out.println(i); 
		System.out.println(d1); 
		
		// int=10.0; //type mismatch: cannot convert from double to int
		//***Casting*** - is a process of converting the value from one type to another 
		
		//   2 types of casting : widening / implicit / automatic
		
		//       *widening int to a double ( small to a big )
		//       * narrowing double to a int -->   int in =(int) 10.99;
		
		//   narrowing / explicit / manual
		
		// byte -> short -> int -> long -> float -> double
		
		// we can cast primitive and non primitive
		
		// int i=10.99 -> error: cannot convert from double to int 
		
		// why : Cannot convert to a smaller value!!!
		
		// narrowing or explicit casting
		// we store double value 10.99 into int variable
		
		double d=10;
		
		int num=(int) 10.99;
		System.out.println(num);
		
		//  float f = 10.99;    Type mismatch: cannot convert a double to a float
		float f = 10.99f;
		// byte b=128;  128 is too big for byte
		byte b=(byte)128;
		System.out.println(b);
		
		// casting is converting one type to another type
		
		long number=12334234324324l;
		
		// narrowing - taking a long number and converting to int
		
		int numb=(int)12334234324324l;
		System.out.println(numb);
		
		/*Operators:
		 * 
		 * assignment = 
		 * arithmetical =, -, *, /, %
		 * relational and equal
		 * 
		 * 
		 */
		
		
	}
	
}
