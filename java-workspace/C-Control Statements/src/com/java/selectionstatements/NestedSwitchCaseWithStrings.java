package com.java.selectionstatements;

import java.io.IOException;

public class NestedSwitchCaseWithStrings {
	

	public static void main(String[] args) throws IOException {
		/*
		 * It is possible to have a switch as part of the statement sequence of an outer switch. This is called a nested switch.
		 * Even if the case constants of the inner and outer switch contain common values, no conflicts will arise.
		 */
		
		char choice;
		String alphabetCase;
		
		System.out.println("What do you want to print?");
		System.out.println("1. Vowels");
		System.out.println("2. Consonants");
		System.out.print("Your choice: ");
		choice = (char) System.in.read();
		
		switch(choice) {
			case '1':
				alphabetCase = "Upper";
				switch(alphabetCase) {
					case "Upper":
						System.out.println("A\tE\tI\tO\tU");
						break;
					case "Lower":
						System.out.println("a\te\ti\to\tu");
						break;
				}
				break;
			case '2':
				alphabetCase = "Lower";
				switch(alphabetCase) {
					case "Upper":
						System.out.println("B\tC\tD\tF\tG\tH\tJ\tK\tL\tM\tN\tP\tQ\tR\tS\tT\tV\tW\tX\tY\tZ");
						break;
					case "Lower":
						System.out.println("b\tc\td\tf\tg\th\tj\tk\tl\tm\tn\tp\tq\tr\ts\tt\tv\tw\tx\ty\tz");
						break;
				}
				break;
		}
	}
	
}
