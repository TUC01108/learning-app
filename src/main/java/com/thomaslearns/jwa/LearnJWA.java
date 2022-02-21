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
		System.out.println("You are going to have so much fun!!!\n");
		
		System.out.println("Please select from the following areas-");
		System.out.println("0. The Data Types");
		System.out.println("1. The Langs / java.lang");
		System.out.println("2. Fun Da Mentals Warehouse / java fundamentals");
		System.out.println("3. Runtime track meet");
		System.out.println("4. Memory Block");
		System.out.println("5. Nam'ers / Non-access Modifiers");
		System.out.println("6. GIT");
		System.out.println("");
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
