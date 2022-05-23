package com.java.datatypes;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * The process of converting one type of variable to another type is called as Typecasting.
		 * When compatible types are mixed in an assignment, the value of the right side is automatically converted to the type of the left side. This is inbuilt/implicit typecasting.
		 * However, because of Java’s strict type checking, not all types are compatible, and thus, not all type conversions are implicitly allowed. For eg, boolean and int are not compatible.
		 */
		
		
		/* -----Implicit Typecasting-----
		 * When one type of data is assigned to another type of variable, an automatic or implicit typecasting will take place only if:
		 * 1. The two types are compatible.
		 * 2. The destination type is larger than the source type.
		 * When these two conditions are met, a widening conversion takes place. 
		 * 
		 * Below is the list, in which we can do inbuilt typecasting from left to right, i.e. for every datatype we can typecast it into all the types on the right of it. 
		 * [byte, short, int, float, long, double]
		 * 
		 * There are no automatic conversions from the numeric types to char or boolean. Also, char and boolean are not compatible with each other. 
		 * However, an integer literal can be assigned to char.
		 */
		int a = 14;
		float b = a;
		System.out.println("a contains "+a+" and b contains "+b);
		
		long x = 300987415L;
		double y = x;
		System.out.println("x contains "+x+" and y contains "+y);
		
		// double p = 300987415.0;
		// long q = p; // Error: Cannot convert from double to long
		
		int s = 76;
		// char ch = m; // Error: Cannot convert from int to char (integer variable cannot be assigned)
		char ch = 76; // But we can assign an integer literal directly
		System.out.println("ch contains "+ch);
		
		
		/* -----Explicit Typecasting-----
		 * When the datatypes are not compatible for casting, then an explicit typecasting is being done.
		 * General form of explicit typecasting is: [(target datatype) expression]
		 * 
		 * When a cast involves a narrowing conversion, information might be lost. For eg:
		 * When casting a long into a short, information will be lost if the long’s value is greater than the range of a short because its high-order bits are removed. 
		 * When a floating-point value is cast to an integer type, the fractional component will also be lost due to truncation. For eg, if the value 1.23 is assigned to an integer, the resulting value will simply be 1. The 0.23 is lost.
		 */
		double c = 20.0;
		double d = 6.0;
		
		long l = (long)(c/d); // Information loss
		System.out.println("\nIntegral division of (c/d) = "+l);
		
		int m = 264;
		byte n = (byte) m; // Out of range, so again information loss
		System.out.println("n contains "+n);
		
		int q = 81;
		char t = (char) q;
		System.out.println("t contains "+t);
		
		
		/* -----Typecasting in Expression-----
		 * Within an expression, it is possible to mix two or more different types of data as long as they are compatible with each other. For eg, 
		 * You can mix short and long within an expression because they are both numeric types. 
		 * 
		 * When different types of data are mixed within an expression, they are all converted to the same type. This is accomplished through the use of Java’s type promotion rules.
		 * First, all char, byte, and short values are promoted to int. Then, if one operand is a long, the whole expression is promoted to long. If one operand is a float operand, the entire expression is promoted to float. If any of the operands is double, the result is double.
		 * 
		 * It is important to understand that type promotions apply only to the values operated upon when an expression is evaluated. For eg, if the value of a byte variable is promoted to int inside an expression, outside the expression, the variable is still a byte.
		 */
		char ch1 = 'a', ch2 = 'b';
		char ch3 =  (char) (ch1 + ch2); // ch1 & ch2 gets converted to int implicitly, but without explicit cast int cannot be cast to ch3 
		System.out.println("\nch3 contains "+ch3);
		
		char i = 106;
		int z = 50;
		long j = 100L;
		double h = 60000;
		double exp = h/20 - 25*j + i%4 + z; // char(i) promoted to int, then ((i%4)+j) which is int got promoted to long, then ((25*j) + ((i%4)+j)) which is long finally got promoted to double.
		System.out.println("Value of exp = "+exp);
	}

}
