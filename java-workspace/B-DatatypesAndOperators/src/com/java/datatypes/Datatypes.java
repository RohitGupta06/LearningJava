package com.java.datatypes;

public class Datatypes {

	public static void main(String[] args) {
		/* 
		 * Java is a strongly Typed Language which means all the operations are type-checked by the compiler for type compatibility,
		 * in order to prevent errors and enhance reliability.
		 * 
		 * Java contains two general categories of built-in data types: object-oriented and non-object-oriented. 
		 * Java’s object-oriented types are defined by classes.
		 * Java's non-object-oriented types are also called as simple, elemental or primitive datatypes which includes ---> 
		 * boolean[true/false], byte[8bits], char[Unicode-16bits], short[16bits], int[32bits], long[64bits], float[single precision(32bits)], double[double precision(64bits)].
		 * 
		 * Why most of the people categorize char as an integral type in java?
		 * The formal specification for Java defines a type category called integral types, which includes byte, short, int, long, and char. 
		 * They are called integral types because they all hold whole-number, binary values. However, the purpose of the first four is to represent numeric integer quantities. 
		 * The purpose of char is to represent characters. Therefore, the principal uses of char and the principal uses of the other integral types are fundamentally different.
		 */
		
		
		/* -----char-----
		 * characters in java are not 8-bit quantities like they are in many other computer languages. Instead, Java uses Unicode. 
		 * Unicode defines a character set that can represent all of the characters found in all human languages. 
		 * In Java, char is an unsigned 16-bit type having a range of 0 to 65,535. The standard 8-bit ASCII character set is a subset of Unicode.
		 * A character variable can be assigned a value by enclosing the character in single quotes.
		 * 
		 * Since char is an unsigned 16-bit type, it is possible to perform various arithmetic manipulations on a char variable.
		 */
		char ch = 'R';
		System.out.println("ch contains "+ch);
		System.out.println("Integral value of "+ch+" is = "+(int)ch);
		
		ch++;
		System.out.println("ch contains "+ch);
		
		ch--;
		System.out.println("ch contains "+ch);
		
		ch += 5;
		System.out.println("ch contains "+ch);
		
		ch = 71;
		System.out.println("ch contains "+ch);
		System.out.println("__________________________________________________\n");
		
		
		/* -----boolean-----
		 * The boolean type represents true/false values. Java defines the values true and false using the reserved words true and false. 
		 */
		boolean bool = true;
		System.out.println("bool is "+bool);
		
		bool = false;
		System.out.println("bool is "+bool+" whereas !bool is "+!bool);
		System.out.println("16>24 is "+(16>24));
		
	}

}
