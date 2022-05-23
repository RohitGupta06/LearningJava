package com.java.operators;

public class ShortCircuitOperator {
	/*
	 * This program is a demonstration of the advantage of using short circuit operator.
	 * It determines whether a value "n" is a factor of "d" or not.
	 */

	public static void main(String[] args) {
		int n = 28, d = 7;
		
		if (d != 0 && n%d == 0) 
			System.out.println(d+" is a factor of "+n);
		
		d = 0; // Now let's set d = 0.
		
		if (d != 0 && n%d == 0) // Here the short-circuit AND operator prevents a division by 0, as the first condition itself results in false; hence won't check further
			System.out.println(d+" is a factor of "+n);
		
		if (d != 0 & n%d == 0) // Here the normal AND or bitwise AND will check both the conditions no matter what; hence will result in a division by 0 error. 
			System.out.println(d+" is a factor of "+n);
	}

}
