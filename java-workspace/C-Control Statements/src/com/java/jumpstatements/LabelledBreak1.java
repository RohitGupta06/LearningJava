package com.java.jumpstatements;

public class LabelledBreak1 {
	/*
	 * Let's understand on how can we use the break statement in the form of goto.
	 */

	public static void main(String[] args) {
		/*
		 * Java does not have a goto statement, because it provides an unstructured way to alter the flow of program execution. 
		 * Programs that make extensive use of the goto are usually hard to understand and hard to maintain. 
		 * 
		 * There are, however, a few places where the goto is a useful and valid construct. 
		 * For example, the goto can be helpful when exiting from a deeply nested set of loops.
		 * 
		 * To counter such situations, Java defines an extended form of the break statement.
		 * By using this form of break, you can specify precisely where execution will resume, because this form of break works with a label.
		 */
		
		/* 
		 * The general form of the labeled break statement is...
		 * break label;
		 * 
		 * Typically, label is the name of a label that identifies a block of code. 
		 * When this form of break executes, control is transferred out of the named block of code.
		 * 
		 * The labeled block of code must enclose the break statement.
		 * This means that you can use a labeled break statement to exit from a set of nested blocks. 
		 * But you cannot use break to transfer control to a block of code that does not enclose the break statement.
		 */
		
		/*
		 * To name a block, put a label at the start of it. The block being labeled can be a stand-alone block, or a statement that has a block as its target. 
		 * A label is any valid Java identifier followed by a colon. Once you have labeled a block, you can then use this label as the target of a break statement. 
		 * Doing so causes execution to resume at the end of the labeled block.
		 */
		
		int turn;
		for(turn=1; turn<=6; turn++) {
			one: {
				two: {
					three: {
						four: {
							five: {
								if (turn != 6)
									System.out.println("\nChance " + turn + "...");
								
								if (turn == 1)
									break one; // Control comes out of block one
								if (turn == 2)
									break two; // Control comes out of block two
								if (turn == 3)
									break three; // Control comes out of block three
								if (turn == 4)
									break four; // Control comes out of block four
								if (turn == 5)
									break five; // Control comes out of block five
								
								System.out.println("\nYou cannot get more chances!");
								break; // No label specified, hence it will come out of the immediate parent iterative statement, i.e. the for loop.
							}
							System.out.println("You scored 50 points.");
						}
						System.out.println("You scored 40 points.");
					}
					System.out.println("You scored 30 points.");
				}
				System.out.println("You scored 20 points.");
			}
			System.out.println("You scored 10 points.");
		}
		System.out.println("The snake caught you, your score is 0 points.");
	}
}
