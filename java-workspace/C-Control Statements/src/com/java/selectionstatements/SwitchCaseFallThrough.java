package com.java.selectionstatements;

public class SwitchCaseFallThrough {

	public static void main(String[] args) {
		/*
		 * Technically, the break statement is optional.
		 * When encountered within the statement sequence of a case, the break statement causes program flow to exit from the entire switch statement and resume at the next statement outside the switch.
		 * However, if a break statement does not end the statement sequence associated with a case, then all the statements at and following the matching case will be executed until a break or the end of the switch is encountered.
		 * Thus, a case without a break will "fall through" to the next case.
		 */
		int i;
		
		for(i=0; i<5; i++) {
			switch(i) {
				case 0:
					System.out.println(i+" is less than 1.");
				case 1:
					System.out.println(i+" is less than 2.");
				case 2:
					System.out.println(i+" is less than 3.");
				case 3:
					System.out.println(i+" is less than 4.");
				case 4:
					System.out.println(i+" is less than 5.\n");
				
			}
		}

	}

}
