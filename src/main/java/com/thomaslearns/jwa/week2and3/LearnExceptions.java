package com.thomaslearns.jwa.week2and3;

import java.util.Scanner;

public class LearnExceptions {
	Scanner scanner = new Scanner(System.in);
	int choice = 0;
	String answer = null;

	public void exceptionsWorld() {

		System.out.println("Do you need a catch block? Can you have more than 1? Order of them?");
		answer = scanner.nextLine();
		System.out.println("Catch block is not necessary - try/finally will compile. You can have "
				+ "more than one catch block, but the order must be from most narrow exception to most broad/general.");
		System.out.println();
		answer = null;
		
		System.out.println("What is base class of all exceptions? What interface do they all implement?");
		answer = scanner.nextLine();
		System.out.println("The base class is `Exception`, which implements the `Throwable` interface");
		System.out.println();
		answer = null;
		
		System.out.println("List some checked and unchecked exceptions?");
		answer = scanner.nextLine();
		System.out.println("Checked - `IOException`, `ClassNotFoundException`, `InterruptedException` "
				+ "Unchecked - `ArithmeticException`, `ClassCastException`, `IndexOutOfBoundsException`, `NullPointerException`");
		System.out.println();
		answer = null;
		
		System.out.println("`throw` vs `throws` vs `Throwable`?");
		answer = scanner.nextLine();
		System.out.println("`Throwable` - the root interface of exceptions, allow a class to be \"thrown\" / `throws` - keyword "
				+ "in method signature after params that declare which exception the method might throw / `throw` - the keyword "
				+ "that will actually \"throw\" an exception in code");
		System.out.println();
		answer = null;
		
		System.out.println("An Error is more like a RuntimeException or an Exception?");
		answer = scanner.nextLine();
		System.out.println("RuntimeException / Errors can't really be checked for ahead of time, since a program cannot predict problems in its execution environment");
		System.out.println();
		answer = null;
		
		System.out.println("Assuming a method contains code which may raise an Exception (but not a RuntimeException), what is the correct way for the method to indicate "
				+ "that it expects the caller to handle that exception?");
		answer = scanner.nextLine();
		System.out.println("throws Exception");
		System.out.println();
		answer = null;
		
		System.out.println("What are some rules for catch blocks?");
		answer = scanner.nextLine();
		System.out.println("You can have more than 1 catch block associated with a try block / You can catch more than 1 type of exception in a given catch block / "
				+ "Catch blocks catching specific exceptions must come BEFORE catch blocks catching more generic exceptions");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between checked and unchecked exceptions?");
		answer = scanner.nextLine();
		System.out.println("Checked exceptions must be handled or declared by the programmer, otherwise compilation will fail; unchecked exceptions need not be "
				+ "handled or declared.");
		System.out.println();
		answer = null;
		
		System.out.println("How would you create a custom checked exception?");
		answer = scanner.nextLine();
		System.out.println("Create a class which extends Exception");
		System.out.println();
		answer = null;
		
		System.out.println("What is an Error?");
		answer = scanner.nextLine();
		System.out.println("A Throwable which represents a serious problem which the application should not try to handle");
		System.out.println();
		answer = null;
		

		System.out.println("That's all for Exceptions. Enter any key to return to the main menu");

		/*
		 System.out.println("default?"); 
		 answer = scanner.nextLine();
		 System.out.println("DEFAULT."); 
		 System.out.println(); 
		 answer = null;
		 */

		answer = scanner.nextLine();
	}

}
