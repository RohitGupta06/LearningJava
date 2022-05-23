package com.java.datatypes;

public class EscapeSequences {

	public static void main(String[] args) {
		
		/* -----Escape Sequences-----
		 * Certain characters, such as the single and double quotes, have special meaning in Java, but we cannot use them directly.
		 * So for solving this issue java provides special escape sequences, sometimes referred to as backslash character constants.
		 * Some of the most commonly used escape characters are...
		 * \'  ->  Single Quote
		 * \"  ->  Double Quote
		 * \\  ->  Backslash
		 * \n  ->  New Line
		 * \t  ->  Horizontal Tab
		 * \b  ->  Backspace
		 */
		System.out.println("Displaying single quote -> \'");
		System.out.println("Displaying double quote -> \"");
		System.out.println("Displaying backslash -> \\");
		System.out.println("Demo for horizontal tab single quote -> R\tM\tG");
		System.out.println("Demo for backspace -> RM\bG"); // It moves the cursor one character back with or without deleting the character(depending upon compiler)
		
	}

}
