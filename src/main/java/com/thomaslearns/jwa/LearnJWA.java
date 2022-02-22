package com.thomaslearns.jwa;

import java.util.Scanner;

import com.thomaslearns.jwa.week2and3.LearnCollections;
import com.thomaslearns.jwa.week2and3.LearnExceptions;
import com.thomaslearns.jwa.week2and3.LearnJUnit;
import com.thomaslearns.jwa.week2and3.LearnMaven;
import com.thomaslearns.jwa.week2and3.LearnSQL;

public class LearnJWA {
	Scanner scanner = new Scanner(System.in);
	int choice = 0;
	
	public LearnJWA() {
		// TODO Auto-generated constructor stub
	}
	
	public void jwaWorld() {
		
		System.out.println("Welcome to Java with Automation World");
		System.out.println("You are going to learn a lot!\n");
		
		System.out.println("Please select from the following areas-");
		System.out.println("**** JAVA/FUNDAMENTALS ****");
		System.out.println("0. JAVA");
		System.out.println("1. HTML");
		System.out.println("2. HTTP");
		System.out.println("---- Week 1 is above ----");
		System.out.println("**** JAVA ****");
		System.out.println("10. JAVA");
		System.out.println("11. OOP CONCEPTS");
		System.out.println("12. UNIT TESTING");
		System.out.println("13. COLLECTIONS");
		System.out.println("14. MULTI-THREADING");
		System.out.println("---- Week 2 is above ----");
		System.out.println("**** JAVALIN/SQL ****");
		System.out.println("20. SQL SUBLANGUAGES");
		System.out.println("21. NORMALIZATION");
		System.out.println("22. JOINS");
		System.out.println("23. JDBC");
		System.out.println("24. DAO DESIGN PATTERN");
		System.out.println("25. JAVALIN");
		System.out.println("26. MOCKITO");
		System.out.println("---- Week 3 is above ----");
		System.out.println("**** CLIENT SIDE TECHNOLOGIES ****");
		System.out.println("30. HTML");
		System.out.println("31. CSS");
		System.out.println("32. JAVASCRIPT");
		System.out.println("33. JASMINE");
		System.out.println("---- Week 4 is above ----");
		
		System.out.println("0. The Data Types");
		System.out.println("1. Classes & Objects");
		System.out.println("2. Interfaces");
		System.out.println("3. OOP");
		System.out.println("4. Variables");
		System.out.println("5. Operators");
		System.out.println("6. Fundamentals");
		System.out.println("7. GIT");
		System.out.println("8. HTML");
		System.out.println("The Langs / java.lang, Memory Block, Runtime, Java Fundamentals, Nam'ers / Non-access Modifiers, GIT");
		System.out.println("---- Week 1 is above ----");
		System.out.println("10. JUnit");
		System.out.println("11. Collections");
		System.out.println("12. Exceptions");
		System.out.println("13. Maven");
		System.out.println("14. SQL");
		System.out.println("");
		System.out.println("---- Week 2 and 3 is above ----");
		System.out.println("");
		
		choice = scanner.nextInt();
		
		switch(choice) {
		case 10:
			// enter JUnit section
			System.out.println("WELCOME TO JUnit SECTION");

			LearnJUnit learnjunit = new LearnJUnit();
			learnjunit.junitWorld();
			
			break;
		case 11:
			// enter Collections section
			System.out.println("WELCOME TO COLLECTIONS SECTION");

			LearnCollections learncollections = new LearnCollections();
			learncollections.collectionsWorld();
			
			break;
		case 12:
			// enter Collections section
			System.out.println("WELCOME TO EXCEPTIONS SECTION");

			LearnExceptions learnexceptions = new LearnExceptions();
			learnexceptions.exceptionsWorld();
			
			break;
		case 13:
			// enter Collections section
			System.out.println("WELCOME TO MAVEN SECTION");

			LearnMaven learnmaven = new LearnMaven();
			learnmaven.mavenWorld();
			
			break;
		case 14:
			// enter Collections section
			System.out.println("WELCOME TO SQL SECTION");

			LearnSQL learnsql = new LearnSQL();
			learnsql.sqlWorld();
			
			break;
		default:
			System.out.println("Enter a valid response.");
		}
	}

}
