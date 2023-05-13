package com.java.introduction;

public class HelloWorld {
	/*
	 * This is a simple java program
	 * [This is a multi-line comment]
	 */
	
	/*
	 * The first thing to learn in Java is the name we give to a source file.
	 * By convention, the name of the class should match the name of the file that holds the program.
	 */
	
	public static void main(String[] args) {
		// A java program begins with a call to main() [This is a single line comment]
		System.out.println("Let's drive the world through java!");
		
		/*
		 * In the above line
		 * System is a predefined class that provides access to the system.
		 * out is the output stream that is connected to the console. 
		 * Thus, System.out is an object that encapsulates console output.
		 * 
		 * main() must always be declared as public, since it is called by outside of its class when the program is started.
		 * The keyword static allows main() to be called before an object of the class has been created.
		 * This is necessary because main() is called by the JVM before any objects are made.
		 * 
		 * One very important thing to remember is that Java is case sensitive language. Forgetting about this can cause serious issues.
		 */
	}

}
