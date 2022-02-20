package com.thomaslearns.jwa.week2and3;

import java.util.Scanner;

public class LearnJUnit {
	Scanner scanner = new Scanner(System.in);
	int choice = 0;
	String answer = null;
	
	public void junitWorld() {
		System.out.println("Welcome to JUnit");
		
		System.out.println("What is JUnit?");
		answer = scanner.nextLine();
		System.out.println("A testing framework for testing code. We use it for Test Driven Development");
		System.out.println();
		answer = null;
		
		System.out.println("What is TDD?");
		answer = scanner.nextLine();
		System.out.println("The process of writing tests first before writing the application code, then ensuring the tests pass.");
		System.out.println();
		answer = null;
		
		System.out.println("What is unit testing?");
		answer = scanner.nextLine();
		System.out.println("Testing the smallest, individual components of the application in isolation from the rest of the system.");
		System.out.println();
		answer = null;
		
		System.out.println("Give an example of a test case?");
		answer = scanner.nextLine();
		System.out.println("Adding two numbers, check that the method returns the sum.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the biggest advantage to utilizing test-driven development?");
		answer = scanner.nextLine();
		System.out.println("It ensures that application code always meets the required functionality.");
		System.out.println();
		answer = null;
		
		System.out.println("Which are some JUnit annotations?");
		answer = scanner.nextLine();
		System.out.println("@Test / @Ignore / @Before / @BeforeClass");
		System.out.println();
		answer = null;
		
		System.out.println("What are some best practices when writing unit tests?");
		answer = scanner.nextLine();
		System.out.println("Utilize dependency injection to make testing easier / Isolate components from other parts of the system / Do negative testing as well as positive testing.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the order in which JUnit annotations will run?");
		answer = scanner.nextLine();
		System.out.println("@BeforeClass, @Before, @Test, @After, @AfterClass");
		System.out.println();
		answer = null;
		
		System.out.println("What are some Assert classes in JUnit?");
		answer = scanner.nextLine();
		System.out.println("AssertEquals, AssertTrue, AssertFalse, AssertArrayEquals");
		System.out.println();
		answer = null;
		
		System.out.println("In JUnit, if you want a test to pass if an exception is thrown, what should you do?");
		answer = scanner.nextLine();
		System.out.println("Use: @Test(expected \\= Exception.class)");
		System.out.println();
		answer = null;
		
		System.out.println("In order to use the Assert methods in JUnit without specifying the fully qualified class name, you must use what?");
		answer = scanner.nextLine();
		System.out.println("static import");
		System.out.println();
		answer = null;
		
		System.out.println("To tell JUnit to not run a test, what do you use?");
		answer = scanner.nextLine();
		System.out.println("the @Ignore annotation");
		System.out.println();
		answer = null;
		
		System.out.println("JUnit Assert methods take what as parameters?");
		answer = scanner.nextLine();
		System.out.println("an expected value and a test value to check against the expected value");
		System.out.println();
		answer = null;
		
		System.out.println("That's all for JUnit. Enter any key to return to the main menu");
		
		
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
