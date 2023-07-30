package com.java.iterativestatements;

public class WhileLoop {
	/*
	 * Let's understand the while loop with an example, where we will print all the alphabets from A-Z.
	 */

	public static void main(String[] args) {
		/*
		 * Another of Java's loop is the while loop. 
		 * 
		 * The general form of while loop is...
		 * while(condition) {
		 *     Block of statements;
		 * }
		 * 
		 * The while loop executes as long as the conditional expression is true.
		 * When the condition becomes false, program control passes to the line immediately following the loop.
		 */
		
		char ch = 'A';
		
		while(ch <= 'Z') {
			System.out.println(ch);
			ch++; // incrementing the character value by 1.
		}
	}

}
