package com.java.selectionstatements;

public class SwitchCaseStacking {

	public static void main(String[] args) {
		/*
		 * The "stacking" of cases, as shown in this example, is common when several cases share common code.
		 */
		int i;
		
		for (i=0; i<5; i++) {
			switch(i) {
				case 0: // Empty Case statements
				case 1:
				case 2:
				case 3:
					System.out.println("i is either 0, 1, 2 or 3.");
					break;
				case 4:
					System.out.println("i is 4");
					break;
			}
		}

	}

}
