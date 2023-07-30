package com.java.iterativestatements;

public class ForLoop {
	/*
	 * Let's understand the for loop with an example, where we have to print the squares of the numbers from 1-25.
	 */

	public static void main(String[] args) {
		/*
		 * The last of Java's loop is the for loop. 
		 * 
		 * The general form of while loop is...
		 * for(initialization; condition; increment) {
		 *     Block of statements;
		 * }
		 * 
		 * The initialization is usually an assignment statement that sets the initial value of the loop control variable, which acts as the counter that controls the loop. 
		 * The condition is a Boolean expression that determines whether or not the loop will repeat. 
		 * The iteration expression defines the amount by which the loop control variable will change each time the loop is repeated.
		 * 
		 * The for loop will continue to execute as long as the condition tests true. 
		 * Once the condition becomes false, the loop will exit, and program execution will resume on the statement following the for loop.
		 * 
		 * An important point about for loops is that the conditional expression is always tested at the top of the loop.
		 */
		
		// Declaring the loop control variable (i)
		int i, square;
		
		// initializing i to 1; defining a conditional expression for restricting i below 26; incrementing i by 1.
		for(i=1; i<=25; i++) { 
			square = i*i; // calculating square
			System.out.println("Square of " + i + " = " + square);
		}
	}

}
