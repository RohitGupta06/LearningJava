package com.java.operators;

public class Operators {

	public static void main(String[] args) {
		/*
		 * An operator is a symbol that tells the compiler to perform a specific mathematical or logical manipulation. 
		 * Java has six different types of operators: arithmetic, relational, logical, bitwise, assignment & shift. 
		 */
		
		 
		/* -----Arithmetic Operators-----
		 * 1. Operators - Unary Plus(+), Unary Minus(-), Multiplication(*), Division(/), Modulo(%), Increment(++), Decrement(--)
		 * 2. When Division(/) is applied to any integer, any remainder will be truncated.
		 * 3. In java Modulo(%) can be applied to both integer & floating point operators.
		 * 4. Increment(++) or Decrement(--) can be applied in 2 ways, i.e. as a Prefix or as a Postfix.
		 * 5. When an increment or decrement operator precedes its operand, Java will perform the corresponding operation prior to obtaining the operand’s value for use by the rest of the expression. 
		 * If the operator follows its operand, Java will obtain the operand’s value before incrementing or decrementing it. 
		 */
		int x = 11, y, z;
		
		x = x + 1; // Normal way of increment
		System.out.println("x contains: "+x);
		
		y = x++; // Post increment // Here first value of x will be assigned to y then x will get incremented
		System.out.println("x contains: "+x+" and y contains "+y);
		
		z = ++x; // Pre increment // Here first x will be incremented then value of x will be assigned to z
		System.out.println("x contains: "+x+" and z contains "+z);
		
		
		/* -----Relational Operators-----
		 * 1. In the term relational operator, relational refers to the relationships that values can have with one another.
		 * 2. Operators - Is Equal to(==), Not Equal to(!=), Less Than(<), Greater Than(>), Less Than or Equal to(<=), Greater Than or Equal to(>=)
		 */
		int a = 17, b = 19;
		System.out.println("\na = "+a+" and b = "+b+". So, ");
		System.out.println("a < b is "+(a < b));
		System.out.println("a > b is "+(a > b));
		System.out.println("a <= b is "+(a <= b));
		System.out.println("a >= b is "+(a >= b));
		System.out.println("a == b is "+(a == b));
		System.out.println("a != b is "+(a != b));
		
		
		/* -----Logical Operators-----
		 * 1. In the term logical operator, logical refers to the ways in which true and false values can be connected together.
		 * 2. Operators - Logical/Short-circuit AND(&&), Logical/Short-circuit OR(||), Logical NOT(!)
		 * 3. The only difference between the normal and short-circuit versions is that the normal operands will always evaluate each operand, but short-circuit versions will evaluate the second operand only when necessary.
		 */
		boolean p = true, q = false;
		System.out.println("\np = "+p+" and q = "+q+". So, ");
		System.out.println("p && q is "+ (p && q));
		System.out.println("p || q is "+ (p || q));
		System.out.println("!p is "+(!p)+ " and !q is "+(!q));
		
		
		/* -----Bitwise Operators-----
		 * 1. Bitwise operators are used to performing the manipulation of individual bits of any integral type i.e char, short, int, etc..
		 * 2. Operators - Bitwise AND(&), Bitwise OR(|), Bitwise XOR(^), Bitwise Complement(~)
		 */
		int i = 5, j = 7;
		System.out.println("\ni&j is "+(i&j));
		System.out.println("i|j is "+(i|j));
		System.out.println("i^j is "+(i^j));
		System.out.println("~i is "+(~i)+" and ~j is "+(~j));
		
		
		/*
		 * -----Assignment & Short-hand Assignment Operators-----
		 * 1. Assignment Operator - Equal Sign(=)
		 * 2. The assignment operator does have one interesting attribute that, it allows you to create a chain of assignments. 
		 * 3. Short-hand Assignment Operators - +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=
		 * 4. Because the Short-hand assignment operators combine an operation with an assignment, they are formally referred to as compound assignment operators.
		 */
		char ch, r, s, t;
		ch = 'R'; // Simple assignment
		System.out.println("\nch contains "+ch);
		
		r = s = t = 'M'; // Chain of assignments
		System.out.println("r = "+r+", s = "+s+", t = "+t);
		
		int d = 15;
		
		d += 5; // Short-hand Plus
		System.out.println("d contains "+d);
		
		d -=5; // Short-hand Minus
		System.out.println("d contains " +d);
		
		d *= 6; // Short-hand Multiplication
		System.out.println("d contains "+d);
		
		d /= 3; // Short-hand Division
		System.out.println("d contains "+d);
		
		d %= 7; // Short-hand Modulo
		System.out.println("d contains "+d);
		
		d &= 11; // Short-hand AND
		System.out.println("d contains "+d);
		
		d |= 13; // Short-hand OR
		System.out.println("d contains "+d);
		
		d ^= 16; // Short-hand XOR
		System.out.println("d contains "+d);
		
		d <<= 1; // Short-hand Left Shift
		System.out.println("d contains "+d);
		
		d >>= 1; // Short-hand Right Shift
		System.out.println("d contains "+d);
		
		
		/* -----Shift Operators-----
		 * 1. The shift operators in are used to shift bit patterns right or left.
		 * 2. Signed Left Shift(<<), Signed Right Shift(>>), Unsigned Right Shift(>>>)
		 */
		int n = 3; // 011 in binary
		System.out.println("\nn contains "+n);
		
		n = n << 4; // The left shift operator moves all bits by a given number of bits to the left.
		System.out.println("After left shift by 4, n contains "+n);
		
		n = n >> 2; // The right shift operator moves all bits by a given number of bits to the right.
		System.out.println("After right shift by 2, n contains "+n);
		
		n = n >>> 1; // It is the same as the signed right shift, But the vacant leftmost position is filled with 0 instead of the sign bit.
		System.out.println("After right shift(unsigned) by 1, n contains "+n);
	}

}
