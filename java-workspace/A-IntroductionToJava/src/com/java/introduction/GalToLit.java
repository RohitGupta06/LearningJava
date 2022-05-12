package com.java.introduction;

public class GalToLit {
	/*
	 * This program converts gallons to litres
	 */
	
	public static void main(String[] args) {
		double gallons; // holds number of gallons
		double litres; // holds equivalent number of litres 
		
		gallons = 20;
		litres = gallons * 3.7854; // conversion formula
		
		System.out.println(gallons + " gallons is equivalent to " + litres + " litres.");
	}

}
