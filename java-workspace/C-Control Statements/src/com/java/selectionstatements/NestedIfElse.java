package com.java.selectionstatements;

import java.io.IOException;

public class NestedIfElse {
	/*
	 * Let's understand the nesting of if-else statement with a game, where user needs to guess the letter.
	 */

	public static void main(String[] args) throws IOException {
		/*
		 * If the target code of if and else are single statements, then general form of if-else is...
		 * if (condition)
		 *     statement;
		 * else
		 *     statement;
		 * 
		 * If the target code of if and else is a block of statements, then general form of if-else is...
		 * if (condition) {
		 *     Block of statements;
		 * }
		 * else {
		 *     Block of statements;
		 * }
		 * 
		 * if the conditional expression is true, the target code of the if will be executed; otherwise, the target code of the else will be executed(if it exists).
		 */
		
		char ch, ans = 'M';
		
		System.out.println("I am thinking of a letter between A to Z.");
		System.out.print("Can you guess it: ");
		ch = (char) System.in.read();
		
		// This demonstrates an example of nested if-else
		if (ch == ans)
			System.out.println("Awesome! You guessed it right.");
		else {
			if (ch < ans)
				System.out.println("You're guessing it too low...");
			else
				System.out.println("You're guessing it too high...");
		}
	}

}
