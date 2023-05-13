package com.java.selectionstatements;

public class IfElseIfLadder {
	/*
	 * Let's understand the if-else-if ladder with an example, where given a point on the cartesian plane; determine in which quadrant it lies.
	 */

	public static void main(String[] args) {
		// Given the coordinates as (x,y)
		int x = 8, y = -6;
		
		// This demonstrates an example of if-else-if ladder
		if (x>0 && y>0)
			System.out.println("Given point is in 1st quadrant.");
		else if (x<0 && y>0)
			System.out.println("Given point is in 2nd quadrant.");
		else if (x<0 && y<0)
			System.out.println("Given point is in 3rd quadrant.");
		else
			System.out.println("Given point is in 4th quadrant.");
	}

}
