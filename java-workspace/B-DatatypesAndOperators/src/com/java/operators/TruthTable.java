package com.java.operators;

public class TruthTable {
	
	/*
	 * This program displays a truth table for Java's bitwise(AND, OR, XOR) operators
	 * Use tabs for better display
	 */

	public static void main(String[] args) {
		int P, Q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR");
		
		P = Q = 0;
		System.out.print(P+"\t"+Q+"\t");
		System.out.println((P&Q)+"\t"+(P|Q)+"\t"+(P^Q));
		
		P = 0; Q = 1;
		System.out.print(P+"\t"+Q+"\t");
		System.out.println((P&Q)+"\t"+(P|Q)+"\t"+(P^Q));
		
		P = 1; Q = 0;
		System.out.print(P+"\t"+Q+"\t");
		System.out.println((P&Q)+"\t"+(P|Q)+"\t"+(P^Q));
		
		P = Q = 1;
		System.out.print(P+"\t"+Q+"\t");
		System.out.println((P&Q)+"\t"+(P|Q)+"\t"+(P^Q));
	}

}
