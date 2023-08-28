package com.java.jumpstatements;

public class LabelledContinue {
	/*
	 * Just like a labelled break, we also have a labelled continue, let's understand it
	 */

	public static void main(String[] args) {
		/*
		 * Just like a labelled break, continue can also have a label to describe which enclosing loop to continue.
		 * Labelled break can be used with a standalone block as well, but labelled continue cannot be used with a standalone block.
		 * Labelled continue can only be used with a labelled loop.
		 */
		
		outerLoop:
			for(int i=1; i<=10; i++) {
				System.out.print("\nOuter loop iteration: " + i + ",\t Inner loop iteration: ");
				for(int j=1; j<=5; j++) {
					System.out.print(j);
					if (j == 3)
						continue outerLoop;
				}
			}

	}

}
