package com.java.iterativestatements;

import java.io.IOException;

public class ForLoopVariations {
	/*
	 * Let's have a look on the multiple ways in which for loop can be used.
	 */

	public static void main(String[] args) throws IOException {
		/*
		 * 1. For loop with multiple loop control variables
		 * 
		 * It means that we can have multiple variables controlling the for loop, i.e.
		 * Multiple initializations, Multiple conditions & Multiple increment/decrement 
		 */
		int i, j;
		System.out.println("i\tj");
		for (i=0, j=10; i<=5 && j>=5; i++, j--) { // (i<=5 && j>=5 can also be written as i<=j)
			System.out.println(i + "\t" + j);
		}
		// In the above example we can see that we had: 2 loop control variables, 2 initializations, 2 conditions, 2 increment/decrement.
		
		
		/*
		 * 2. For loop having condition without loop control variable
		 * 
		 * As we previously discussed that, condition is a Boolean expression that determines whether or not the loop will repeat.
		 * So it does not need to involve the loop's conditional variable.
		 */
		int k;
		System.out.println("Press R to say UNO.");
		for(k=0; System.in.read() != 'R' ;k++) { // alien uno -._.-
			/*
			 * One liner while loop or to be more precise, a loop with no body
			 * Also an example of nested loop, written here to discard unwanted characters if any [as we saw in Do While loop].
			 */
			while(System.in.read()!= '\n');
			
			System.out.println("Your turn: +" + k);
		}
		System.out.println("UNO!!!");
		
		
		/*
		 * 3. For loop with no body
		 * 
		 * In the above example we saw a while loop with no body, similarly we can also have a for loop with no body.
		 */
		int l, sum = 0;
		for(l=1; l<=10; sum += l++); // calculating sum of numbers from 1-10
		System.out.println("Sum of numbers from 1-10 is " + sum);
		/*
		 * In the above example, (sum += l++) means first add l to sum then increment l by 1.
		 * l is added to sum first because we have applied post-increment to l.
		 * Try using pre-increment and see the result.
		 */
		
		
		/*
		 * 4. For loop with empty initialization
		 */
		int m = 1;
		for( ; m<=5; m++) {
			System.out.println("Missing Pieces-I Pass #" + m);
		}
		
		
		/*
		 * 5. For loop with empty initialization and empty increment/decrement
		 */
		int n = 1;
		for( ; n<=5; ) {
			System.out.println("Misisng Pieces-II Pass #" + n);
			n++;
		}
	}

}
