package com.java.introduction;

public class GalToLitTable {
	/*
	 * This programs displays a conversion tables of gallons to litres (Leave a empty line after every 10 conversions)
	 * This program will also give an overview of conditionals & looping
	 */
	
	public static void main(String[] args) {
		double gallons, litres;
		int counter = 0;
		
		// Basic for loop
		for(gallons=1; gallons<=100; gallons++) {
			litres = gallons * 3.7854; // conversion formula
			System.out.println(gallons + " gallons is equivalent to " + litres + " litres.");
			
			counter++;
			if(counter == 10) {
				System.out.println(); // After every 10th line is a blank line
				counter = 0; // Resetting the counter
			}
		}
	}

}
