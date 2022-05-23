package com.java.variables;

public class DynamicInitialization {
	/*
	 * This program calculates volume of a cylinder, given its radius & height.
	 */

	public static void main(String[] args) {
		
		// Declaring radius & height
		double radius = 5, height = 6;
		
		// Dynamic initialization of volume
		double volume = 3.1416 * radius * radius * height;
		
		System.out.println("Volume of cylinder with radius as "+radius+"units & height as "+height+"units is "+volume+"cubic units.");

	}

}
