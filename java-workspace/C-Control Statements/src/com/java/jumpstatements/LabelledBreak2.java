package com.java.jumpstatements;

public class LabelledBreak2 {
	/*
	 * Let's understand more on the labelled break statement with some more examples
	 */

	public static void main(String[] args) {
		/*
		 * Example 1: 
		 * This time, break is being used to jump outside of a series of nested for loops.
		 */
		
		System.out.println("Example 1...");
		exit: {
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=5; j++) {
					for(int k=1; k<=5; k++) {
						System.out.println("Have a nice day!");
						if (k == 3) 
							break exit;
					}
				}
			}
		}
		System.out.println("Good Night!\n");
		
		
		/*
		 * Example 2:
		 * Playing with the position of labels when working with loops
		 * 
		 * 1. Add label before for loop
		 *   --> Here the label precedes the outer for loop. 
		 *   --> In this case, when the break executes, it transfers control to the end of the entire for block, skipping the rest of the outer loop’s iterations.
		 * 
		 * 2. Add label after for but before the opening brace of for, i.e. before {
		 *   --> Here the label precedes the outer for’s opening curly brace. 
		 *   --> Thus, when break exit2 executes, control is transferred to the end of the outer for’s block, causing the next iteration to occur.
		 */
		
		System.out.println("Example 2...");
		exit1: {
			for(int i=0; i<5; i++) {
				for(int j=0; j<5; j++) {
					System.out.println("i: " + i + " and  j: " + j);
					if (j == 2) 
						break exit1;
				}
			}
		}
		System.out.println("______________\n");
		
		for(int i=0; i<5; i++) 
			exit2: {
			for(int j=0; j<5; j++) {
				System.out.println("i: " + i + " and  j: " + j);
				if (j == 2) 
					break exit2;
			}
		}
	}
}
