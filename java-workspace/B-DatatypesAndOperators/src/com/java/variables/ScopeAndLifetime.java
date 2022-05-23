package com.java.variables;

public class ScopeAndLifetime {

	public static void main(String[] args) {
		/*
		 * Java allows variables to be declared within any block. 
		 * A block is begun with an opening curly brace and ended by a closing curly brace. A block defines a scope.
		 * A scope determines what objects are visible to other parts of your program. It also determines the lifetime of those objects.
		 * 
		 * Two of the most common scopes in Java are those defined by a class and those defined by a method.
		 * if a method has parameters, they too are included within the method’s scope.
		 * 
		 * As a general rule, variables declared inside a scope are not visible (i.e., accessible) to code that is defined outside that scope. 
		 * Thus, when we declare a variable within a scope, we are localizing that variable and protecting it from unauthorized access and/or modification from outside the scope.
		 * 
		 * Scopes can be nested. For example, each time you create a block of code, you are creating a new, nested scope. When this occurs, the outer scope encloses the inner scope. 
		 * This means that objects declared in the outer scope will be visible to code within the inner scope. However, the reverse is not true. 
		 * Objects declared within the inner scope will not be visible outside it.
		 */
		
		int x = 30;
		System.out.println("x is equal to "+x);
		
		// This is an anonymous block, we'll discuss in detail about it later.
		{
			int y = 50; //Accessible/known to only this block 
			System.out.println("x and y are equal to "+x+" and "+y+" respectively."); // Both x & y are accessible/known in this block
			
			x = 70;
		}
		
		// System.out.println("y is equal to "+y); // Error "y cannot be resolved to a variable" because y is not accessible outside its scope
		System.out.println("x is equal to "+x); // x = 70, as its value was changed in nested scope
		
		
		/*
		 * Within a block, variables can be declared at any point, but are valid only after they are declared. 
		 * Thus, if we define a variable at the start of a method, it is available to all of the code within that method. 
		 * Conversely, if we declare a variable at the end of a block, it is effectively useless, because no code will have access to it.
		 */
		
		x = 100;
		System.out.println("x is equal to "+x+" [x is accessible at this line because it is being already declared above at the start of the program.]");
		
		// System.out.println("z is equal to "+z); // Error because we haven't decalred z yet
		int z = 20;
		System.out.println("z is equal to "+z); // z is accessible/known now, because we declared it befoe this line.
		
		
		/*
		 * Here is another important point to remember: variables are created when their scope is entered, and destroyed when their scope is left. 
		 * This means that a variable will not hold its value once it has gone out of scope. Thus, the lifetime of a variable is confined to its scope.
		 */
	}

}
