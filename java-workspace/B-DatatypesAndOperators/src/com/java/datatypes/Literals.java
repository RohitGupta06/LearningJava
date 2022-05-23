package com.java.datatypes;

public class Literals {

	public static void main(String[] args) {
		
		/* -----Literal-----
		 * Literals refer to fixed values that are represented in their human-readable form. For example, the number 100 is a literal. 
		 * Literals are also commonly called constants.
		 * 
		 * character constants are enclosed in single quotes.
		 * Integer literals are specified as numbers without fractional components.
		 * Floating-point literals require the use of the decimal point followed by the number’s fractional component.
		 * 
		 * By default, integer literals are of type int. If you want to specify a long literal, append an l or an L. For eg: 12 is an int, but 12L is a long.
		 * By default, floating-point literals are of type double. To specify a float literal, append an F or f to the constant. For eg: 10.19F is of type float.
		 * 
		 * It is possible to specify an integer literal by use of binary. To do so, precede the binary number with a 0b or 0B.
		 * 
		 * The number system based on 8 is called octal, and it uses the digits 0 through 7.
		 * An octal literal begins with a zero.
		 * 
		 * The base 16 number system is called hexadecimal and uses the digits 0 through 9 plus the letters A through F, which stand for 10, 11, 12, 13, 14, and 15.
		 * A hexadecimal literal must begin with 0x or 0X (a zero followed by an x or X).
		 * 
		 * Java supports another type of literal: the string. A string is a set of characters enclosed by double quotes.
		 * 
		 * You can embed one or more underscores into an integer or floating-point literal. Doing so can make it easier to read values consisting of many digits. 
		 * When the literal is compiled, the underscores are simply discarded. For eg: 123_45_678 is same as 12345678 once compiled.
		 * 
		 * Let's verify what we learnt about literals
		 */
		
		System.out.println("Type of literal 12 is "+((Object)12).getClass().getSimpleName());
		System.out.println("Type of literal 12l is "+((Object)12l).getClass().getSimpleName());
		System.out.println("Type of literal 12L is "+((Object)12L).getClass().getSimpleName());
		
		System.out.println("\nType of literal 10.19 is "+((Object)10.19).getClass().getSimpleName());
		System.out.println("Type of literal 10.19f is "+((Object)10.19f).getClass().getSimpleName());
		System.out.println("Type of literal 10.19F is "+((Object)10.19F).getClass().getSimpleName());
		
		System.out.println("\nType of literal 0b1011 is "+((Object)0b1011).getClass().getSimpleName()); // Type will be Integer as we are only representing 11 in binary
		System.out.println("Type of literal 0B1011 is "+((Object)0B1011).getClass().getSimpleName());
		System.out.println("Value of literal 0b1011 is "+0b1011); // Integer literal 11 represented in binary
		
		System.out.println("\nType of literal 016 is "+((Object)016).getClass().getSimpleName()); // Type will be Integer as we are only representing 14 in octal
		System.out.println("Value of literal 016 is "+016 ); // Integer literal 14 represented in octal
		
		System.out.println("\nType of literal 0x28 is "+((Object)0x28).getClass().getSimpleName()); // Type will be Integer as we are only representing 40 in hexadecimal
		System.out.println("Type of literal 0X28 is "+((Object)0X28).getClass().getSimpleName());
		System.out.println("Value of literal 0x28 is "+0x28); // Integer literal 40 represented in hexadecimal
		
		String str = "Hello! I am Java.";
		System.out.println("\nString literal str contains... "+str);
		
		/* Is a string consisting of a single character the same as a character literal? For example, is "R" the same as 'R'?
		 * No. We must not confuse strings with characters. A character literal represents a single letter of type char. A string containing only one letter is still a string. 
		 * Although strings consist of characters, they are not the same type.
		 */
		
		System.out.println("\n123_45_678 after compilation is same as "+123_45_678);
		
	}

}
