package com.java.introduction;

public class WeightOnMoon {
	/*
	 * This program computes effective weight on moon, for a given weight on earth.
	 */

	public static void main(String[] args) {
		double g = 9.8;
		double massOnEarth = 70; // holds mass on earth
		double weightOnEarth, weightOnMoon; 
		
		weightOnEarth = massOnEarth * g; // (We = m*g)
		weightOnMoon = weightOnEarth * 0.17; // (Wm = m*g*0.17 or Wm = We*0.17)
		
		System.out.println("Man weighing " + weightOnEarth + "N on earth weighs " + weightOnMoon + "N on moon.");
	}

}
