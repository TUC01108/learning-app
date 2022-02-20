package com.thomaslearns;

import java.util.Scanner;

import com.thomaslearns.dao.LearnDAO;
import com.thomaslearns.dao.LearnDAOImpl;
import com.thomaslearns.jwa.LearnJWA;
import com.thomaslearns.model.Learn;

public class LearnApp {
	Scanner scanner = new Scanner(System.in);
	int choice = 0;
	LearnDAO learnDAO = new LearnDAOImpl();
	Learn learn = new Learn();

	public void startLearnApp() {
		// declaring local variables for input
		int sectionId = 0;

		while (true) {

			System.out.println("L E A R N I N G      -    APP    MENU");
			System.out.println("1. Start Learning ");
			System.out.println("9. E X I T ");

			System.out.println("Please enter your choice : ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				// enter learning section
				System.out.println("WELCOME TO LEARNING SECTION");

				LearnJWA learnjwa = new LearnJWA();
				learnjwa.jwaWorld();
				
				break;
				
			case 9:
				System.out.println("Thanks for using my learning app!");
				System.exit(0);

			default:
				System.out.println("Invalid choice , Please enter 1 (or 9 to EXIT)");
				break;

			}
		}

	}
}
