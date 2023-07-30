package com.java.iterativestatements;

public class InfiniteLoops {
	/*
	 * Let's see what is an infinite loop? When it is or it can be used? How it can written? 
	 */

	public static void main(String[] args) {
		/*
		 * An infinite loop is a code that never terminates or executes indefinitely, also called as indefinite loop or an endless loop.
		 * 
		 * An infinite loop is used in the following situations:
		 * 1. Operating system command processors, as it does not exits after performing a task. It ends only when user shuts down the system.
		 * 2. Web servers, as they responds to each an every request that client makes. It stops only when the admin shuts them down.
		 * 3. Games, as they continuously interact with the user(s) by accepting their requests and ends only when the user exits the game etc.
		 * 
		 * Infinite loops can be created using any of the 3 loops which we discussed.
		 */
		
		
		// Infinite loop using Do While loop
		do {
			System.out.println("Hello! from infinite do-while loop.");
		} while(true);
		
		// Infinite loop using While loop
		while(true) {
			System.out.println("Hello! from infinite while loop.");
		}
		
		// Infinite loop using For loop
		// This is also one variation of for loop where we have empty initialization, empty increment/decrement and empty condition.
		for( ; ; ) {
			System.out.println("Hello! from infinite for loop.");
		}
		
		/*
		 * PS: At a time we can have only 1 infinite loop in our program, else the code written after the infinite loop will give us code unreachable error.
		 */
	}

}
