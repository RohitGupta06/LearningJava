package com.java.iterativestatements;

import java.io.IOException;

public class DoWhileLoop {
	/*
	 * Let's understand the do-while loop with an example, where we'll enhance our guessing game which we saw while we were learning nested-if-else.
	 */

	public static void main(String[] args) throws IOException {
		/*
		 * The first of Java's loop is do-while loop. 
		 * 
		 * Unlike other loops like while & for, the do-while loop checks the condition at the bottom of the loop.
		 * This signifies that no matter what, the do-while loop will execute at least once.
		 * 
		 * The general form of do-while loop is...
		 * do {
		 *     Block of statements;
		 * } while(condition);
		 * 
		 * The do-while loop executes as long as the condition is true.
		 * The condition may be any valid Boolean expression.
		 */
		
		char ch, ignore, ans = 'M';
		
		System.out.println("I am thinking of a letter between A to Z.");
		System.out.println("Let's see how early you can guess it!");
		
		
		do {
			System.out.print("\nPredict: ");
			ch = (char) System.in.read();
			
			/*
			 * In the first iteration of the loop, when you enter a character and press Enter, two characters are actually being read from the standard input:
			 *     - The character you entered (e.g., 'A', 'B', 'C', etc.).
			 *     - The newline character ('\n') that is automatically added when you press Enter.
			 * and as discussed earlier, the console input is line buffered, so both the characters being entered will go and sit in the buffer.
			 * 
			 * So, in the first iteration, the loop reads the character you entered and then reads the newline character, but the newline character is not consumed by the ch variable.
			 * As a result, in the next iteration, the newline character is read by System.in.read(), and this can cause unexpected behavior in your code.
			 * 
			 * Similarly, in case if we enter more then 1 characters before pressing Enter, then all of them will go & sit into the input buffer.
			 * Hence this additional loop is used to discard all those extra characters being entered after the first character along with the newline character.
			 */	 
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
			
			if (ch < ans)
				System.out.println("You're guessing it too low...");
			else if (ch > ans)
				System.out.println("You're guessing it too high...");
		} while(ch != ans);
		
		System.out.println("Awesome! You guessed it right.");

	}

}
