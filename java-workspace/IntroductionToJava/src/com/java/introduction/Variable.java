package com.java.introduction;

public class Variable {
	/*
	 *  This program demonstrates a variable declaration & assignment
	 */
	
	public static void main(String[] args) {
		int var1; // This declares an integer variable
		float var2; // This declares a floating-point variable with single precision
		double var3; // This declares a floating-point variable with double precision
		
		// This shows how values are assigned to variables
		var1 = 20;
		var2 = 20;
		var3 = 20.0;
		
		System.out.println("Original value of var1: " + var1);
		System.out.println("Original value of var2: " + var2);
		System.out.println("Original value of var3: " + var3);
		System.out.println();
		
		// Re-assignment
		var1 = var1/6;
		var2 = var2/6;
		var3 = var3/6;
		
		System.out.println("Value of var1 after division: " + var1);
		System.out.println("Value of var2 after division: " + var2);
		System.out.println("Value of var3 after division: " + var3);
	}

}
