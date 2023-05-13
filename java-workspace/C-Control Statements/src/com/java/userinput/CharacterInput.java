package com.java.userinput;

import java.io.IOException;

public class CharacterInput {

	public static void main(String[] args) throws IOException {
		/*
		 * To read a character from the keyboard, we use System.in.read().
		 * System.in is the complement to System.out. It is the input object attached to the keyboard.
		 * The read() method waits until the user presses a key and then returns the result.
		 * The character is returned as an integer, so it must be cast into a char to assign it to a char variable.
		 */
		
		/*
		 * By default, console input is line buffered.
		 * Here, the term buffer refers to a small portion of memory that is used to hold the characters before they are read by your program.
		 * In this case, the buffer holds a complete line of text. As a result, you must press ENTER before any character that you type will be sent to your program.
		 */
		
		/*
		 * System.in.read() uses the input stream, so in case of any error it throws an exception, i.e. java.io.IOException.
		 * That is the reason why main method consists of "throws IOException".
		 * We will understand Exception Handling concept in more detail further.
		 */
		
		char key;
		int value;
		
		System.out.print("Enter a character: ");
		value = System.in.read(); // Reads only the first pressed key and return its equivalent int/ascii value
		key = (char) value; // typecasting int to char
		
		System.out.println("The entered character is "+key+" and its value is "+value);
		
		/* TODO
		 * When you are supposed to enter a character, see what is the output if we directly hit enter without pressing any key before it.
		 */

	}

}
