package com.java.selectionstatements;

public class SwitchCaseBasic {

	public static void main(String[] args) {
		/*
		 * The second of Java's selection statements is the switch. The switch provides for a multiway branch.
		 * Thus, it enables a program to select among several alternatives.
		 * 
		 * The traditional switch works like this: The value of an expression is successively tested against a list of constants.
		 * When a match is found, the statement sequence associated with that match is executed.
		 * 
		 * The general form of the traditional switch statement is
		 * switch(expression) {
		 *     case {{constant1}}:
		 *         Statements;
		 *         break;
		 *     case {{constant2}}:
		 *         Statements;
		 *         break;
		 *     .
		 *     .
		 *     .
		 *     default:
		 *         Statements;
		 * }
		 * 
		 * For versions of Java prior to JDK 7, the expression controlling the switch must resolve to type byte, short, int, char, or an enumeration.
		 * However, Post JDK7, expression can also be of type String. This means that modern versions of Java can use a string to control a switch.
		 * 
		 * Each value specified in the case statements must be a unique constant expression (such as a literal value). Duplicate case values are not allowed.
		 * The type of each value must be compatible with the type of expression.
		 * 
		 * The default statement sequence is executed if no case constant matches the expression. Default case is always checked at last no matter where it is being written.
		 * The deafult is optional; if it is not present, no action takes place if all matches fail.
		 * When a match is found, the statements associated with that case are executed until the break is encountered or, in the case of default or the last case, until the end of the switch is reached.
		 */
		
		int day;
		
		// We will discuss about loops & break statement in detail later in this module
		for(day=0; day<=8; day++) {
			switch(day) {
				case 1:
					System.out.println("It's Monday");
					break;
				case 2:
					System.out.println("It's Tuesday");
					break;
				case 3:
					System.out.println("It's Wednesday");
					break;
				case 4:
					System.out.println("It's Thursday");
					break;
				case 5:
					System.out.println("It's Friday");
					break;
				case 6:
					System.out.println("It's Saturday");
					break;
				case 7:
					System.out.println("It's Sunday");
					break;
				default:
					System.out.println("It's a Ghost Day!");
			}
		}
		
		/* Tricky TODO's
		 * 1. Check the output by mentioning empty case statements. [Stacking of Case]
		 * 2. Check the output by removing the break keyword from one or many case statements. [Fall Through]
		 * 3. Check if we can change the default statement from last to in the begining or somewhere in the middle. (Yes we can, but as mentioned above, no matter where we write it, it is always checked at last)
		 * 4. Check if we can write break keyword under the default case. (Yes we can)
		 * 5. Check if we can write a Sysout statement just before any case statement. (No we can't, its invalid in Java, but in C++ we can write it)
		 */

	}

}
