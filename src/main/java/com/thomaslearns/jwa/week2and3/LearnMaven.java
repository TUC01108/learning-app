package com.thomaslearns.jwa.week2and3;

import java.util.Scanner;

public class LearnMaven {
	Scanner scanner = new Scanner(System.in);
	int choice = 0;
	String answer = null;

	public void mavenWorld() {

		System.out.println("What is Maven?");
		answer = scanner.nextLine();
		System.out.println("A build automation and dependency management tool for Java applications");
		System.out.println();
		answer = null;
		
		System.out.println("What is the Maven lifecycle?");
		answer = scanner.nextLine();
		System.out.println("process resources - copy and process the resources into destination directory "
				+ "/ compile - compile the source code / process-test-resources - same for test directory / test-compile - compile the test code "
				+ "/ test - run the test code / \r\n"
				+ "package - combine compiled source code into a .jar or .war file / install - install package to local repo / deploy - copy package "
				+ "and install in remote repo");
		System.out.println();
		answer = null;
		
		System.out.println("Where / when does Maven retrieve dependencies from? Where are they stored locally?");
		answer = scanner.nextLine();
		System.out.println("Maven first looks to see if the dependency is in the local repo under `.m2` directory. If not, it will download the "
				+ "necessary .jar file(s) from the remote central Maven repository into the `.m2` directory");
		System.out.println();
		answer = null;
		
		System.out.println("What is the POM and what is the pom.xml?");
		answer = scanner.nextLine();
		System.out.println("POM stands for project object model and is the model used by Maven to understand project attributes and dependencies. "
				+ "The pom.xml is the xml document which lists those attributes and dependencies");
		System.out.println();
		answer = null;
		
		System.out.println("What data make up the Maven project coordinates?");
		answer = scanner.nextLine();
		System.out.println("group-id, artifact-id, and version");
		System.out.println();
		answer = null;
		
		System.out.println("Which of the following commands invokes Maven on the command line?");
		answer = scanner.nextLine();
		System.out.println("mvn install");
		System.out.println();
		answer = null;
		
		System.out.println("What is a Maven artifact?");
		answer = scanner.nextLine();
		System.out.println("The end result, a file, produced by the Maven build");
		System.out.println();
		answer = null;

		System.out.println("That's all for Maven. Enter any key to return to the main menu");

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
