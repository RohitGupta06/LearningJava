package com.java.jumpstatements;

public class Continue {
	/*
	 * Now let's understand on how to jump to the next iteration of a loop before the ongoing iteration is even completed.
	 */

	public static void main(String[] args) {
		/*
		 * It is possible to force an early iteration of a loop with the help of continue statement.
		 * Using continue statement forces the next iteration of the loop to take place, skipping any code between itself and the conditional expression that controls the loop. 
		 * Thus, continue is essentially the complement of break.
		 */
		
		/*
		 * Let's take an example where, given numbers from 1 to 100, you need to print all the odd numbers 
		 */
		
		System.out.println("All the odd numbers between 1 to 100 are...");
		for(int i=1; i<=100; i++) {
			if (i%2 == 0) 
				continue; // Jump to the next number if even
			System.out.println(i);
		}
		
		/*
		 * One important thing to note about continue is that...
		 * In while and do-while loops, continue statement will cause control to go directly to the conditional expression and then continue the looping process. 
		 * In the case of the for loop, the iteration expression of the loop is evaluated, then the conditional expression is executed, and then the loop continues.
		 */
	}

}
