package com.java.jumpstatements;

public class Break {
	/*
	 * Let's understand on how can we come out of a loop before it is completely executed.
	 */

	public static void main(String[] args) {
		/*
		 * It is possible to force an immediate exit from a loop with the help of break statement.
		 * By using a break statement, we can bypass any remaining code in the body of the loop and the loop’s conditional statements.
		 * When a break statement is encountered inside a loop, the loop is terminated and program control resumes at the next statement following the loop.
		 * 
		 * Previously we saw infinite loops, but we didn't read on how they can be terminated, if and when required.
		 * So the answer to this is break statement, for ex: If a user clicks on exit when playing a game, the game should get terminated.
		 * A pseudo code  for the above example can be...
		 * for( ; ; ) {
		 *   if (keyPress == 'exit')
		 *     break;
		 * }
		 */
		
		/*
		 * Let's take an example where you need to find the square root of a number(x), such that:
		 * 1. x > 0.
		 * 2. If x is a perfect square then answer will be sqrt where sqrt*sqrt = x.
		 * 2. If x is not a perfect square then answer will be sqrt where sqrt*sqrt is closest to & <= x.
		 */
		
		int x = 47; 
		int i = 1, sqrt = 1;
		
		for(i = 1; i <= x; i++) {
			if (i*i == x) {
				sqrt = i;
				break; // We found the square root, hence there is no need to look or execute the remaining statement/iterations.
			} else if (i*i > x) {
				sqrt = i - 1;
				break;
			}
		}
		
		System.out.println("Square root of " + x + " is " + sqrt + ".");
		
		/*
		 * One very important thing to remember about break statement is that...
		 * If we are using a set of nested loops, then the break statement will break out of the innermost loop, i.e. 
		 * from the code block in which it is written or from the scope under which it comes. For eg:
		 * 
		 * for() { --- Outer Loop
		 *   for() { --- Inner Loop 1
		 *     break;
		 *   }
		 *   
		 *   for() { --- Inner Loop 2
		 *   }
		 * }
		 * 
		 * So here the break statement will force out the control to come out of Inner Loop 1 and not from Outer Loop.
		 */
	}

}
