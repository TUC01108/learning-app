package com.thomaslearns.jwa.week2and3;

import java.util.Scanner;

public class LearnSQL {
	Scanner scanner = new Scanner(System.in);
	int choice = 0;
	String answer = null;

	public void sqlWorld() {

		System.out.println("What does SQL stand for?");
		answer = scanner.nextLine();
		System.out.println("Structured Query Language");
		System.out.println();
		answer = null;
		
		System.out.println("What is SQL?");
		answer = scanner.nextLine();
		System.out.println("A language for interacting with a database.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the primary use of DML?");
		answer = scanner.nextLine();
		System.out.println("Data Manipulation Language. Houses commands for interacting with data in a database. Some examples are Delete, Update, Insert.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the primary use of DDL?");
		answer = scanner.nextLine();
		System.out.println("Data Definition Language. Houses commands that aim to construct, change, or deconstruct the actual table structure of a database. "
				+ "Some examples are Create, Alter, Drop.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the primary use of DCL?");
		answer = scanner.nextLine();
		System.out.println("Data Control Language. Houses commands for specifying access rights for the data. Some examples are Grant and Revoke.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the primary use of TCL?");
		answer = scanner.nextLine();
		System.out.println("Transaction Control Language. Houses commands for maintaining state of transaction, as well as finalizing or preventing "
				+ "them altogether. Some examples are Commit, Rollback, and Savepoint.");
		System.out.println();
		answer = null;
		
		System.out.println("Which command dictates the amount of columns we get in a given query?");
		answer = scanner.nextLine();
		System.out.println("SELECT. From Data Query Language/ DQL.");
		System.out.println();
		answer = null;
		
		System.out.println("Which command filters out records from the given query based on applying a condition to each and every record?");
		answer = scanner.nextLine();
		System.out.println("WHERE");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between WHERE and HAVING?");
		answer = scanner.nextLine();
		System.out.println("WHERE applies a condition to all records individually, whereas HAVING applies to groupings of records.");
		System.out.println();
		answer = null;
		
		System.out.println("What does LIKE do (In SQL)?");
		answer = scanner.nextLine();
		System.out.println("Provides a pseudo-regular expression for matching data through the use of wild card characters.");
		System.out.println();
		answer = null;
		
		System.out.println("Which are some examples of joins (In Oracle)?");
		answer = scanner.nextLine();
		System.out.println("CROSS JOIN / NATURAL LEFT JOIN / INNER JOIN / FULL OUTER JOIN");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between INNER JOIN and INTERSECT?");
		answer = scanner.nextLine();
		System.out.println("INNER JOIN joins two tables together based on a matching column(s) whereas INTERSECT "
				+ "joins queries together based on matching entire records with each other.");
		System.out.println();
		answer = null;
		
		System.out.println("What are some examples of set operators in SQL?");
		answer = scanner.nextLine();
		System.out.println("UNION ALL / UNION / EXCEPT / INTERSECT");
		System.out.println();
		answer = null;
		
		System.out.println("What is true about set operations in SQL?");
		answer = scanner.nextLine();
		System.out.println("UNION ALL will allow duplicate data to be shown in query results. "
				+ "Each query must have the same datatypes in the same order, HOWEVER, they do NOT need to be named the same.\n"
				+ "One could simulate a set operation with a join clause.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between GROUP BY and ORDER BY?");
		answer = scanner.nextLine();
		System.out.println("ORDER BY orders data in ascending or descending order whereas GROUP BY is uses group like data together for aggregation.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between EXCEPT and INTERSECT?");
		answer = scanner.nextLine();
		System.out.println("INTERSECT returns only rows returned by both queries. EXCEPT returns only unique rows returned by the first "
				+ "query but not by the second.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between UNION and UNION ALL?");
		answer = scanner.nextLine();
		System.out.println("UNION returns only distinct rows. While UNION ALL returns all rows.");
		System.out.println();
		answer = null;
		
		System.out.println("What does ACID stand for?");
		answer = scanner.nextLine();
		System.out.println("Atomicity, Consistency, Isolation, and Durability");
		System.out.println();
		answer = null;
		
		System.out.println("What are the different events in Triggers?");
		answer = scanner.nextLine();
		System.out.println("Delete, Update, Insert");
		System.out.println();
		answer = null;
		
		System.out.println("What is true about referential integrity?");
		answer = scanner.nextLine();
		System.out.println("A foreign key in any referencing table must always refer to a valid row in the referenced table. It ensures that the "
				+ "relationship between two tables remains synchronized\n during updates and deletes. Oracle supports referential integrity actions, "
				+ "such as DELETE CASCADE and DELETE SET NULL.");
		System.out.println();
		answer = null;
		
		System.out.println("What is a sequence used for?");
		answer = scanner.nextLine();
		System.out.println("To track sequence values.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the CHECK constraint used for?");
		answer = scanner.nextLine();
		System.out.println("Require any values in a column to satisfy a logical expression.");
		System.out.println();
		answer = null;
		
		System.out.println("Which command is used for defining new tables or databases?");
		answer = scanner.nextLine();
		System.out.println("CREATE");
		System.out.println();
		answer = null;
		
		System.out.println("Denormalization is");
		answer = scanner.nextLine();
		System.out.println("The process of adding redundancy to a database.");
		System.out.println();
		answer = null;
		
		System.out.println("Which of the following joins will return all records from the first table despite any condition specified?");
		answer = scanner.nextLine();
		System.out.println("LEFT JOIN");
		System.out.println();
		answer = null;
		
		System.out.println("Which of the following clauses is used to filter the results of a statement? It can apply to a SELECT, UPDATE, or DELETE statement.");
		answer = scanner.nextLine();
		System.out.println("WHERE");
		System.out.println();
		answer = null;
		
		System.out.println("Which normalized form introduces the concept of enforcing primary keys and removing composite columns?");
		answer = scanner.nextLine();
		System.out.println("FIRST / 1NF");
		System.out.println();
		answer = null;
		System.out.println("Which normalized form introduces the concept of removing duplicate data and creating separate tables for information?");
		answer = scanner.nextLine();
		System.out.println("SECOND / 2NF");
		System.out.println();
		answer = null;
		
		System.out.println("Which normalized form introduces the concept of removing columns whose values are derived from other columns in the table?");
		answer = scanner.nextLine();
		System.out.println("THIRD / 3NF");
		System.out.println();
		answer = null;
		
		System.out.println("Which of the following SQL datatypes is best used to represent a decimal number?");
		answer = scanner.nextLine();
		System.out.println("NUMBER");
		System.out.println();
		answer = null;
		
		System.out.println("What is true about user defined functions?");
		answer = scanner.nextLine();
		System.out.println("A user defined function can be invoked within a stored procedure. A user defined function can be invoked within another user "
				+ "defined function. \nUser defined functions can invoke system defined functions such as SUM and AVG.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the purpose of SQL indices?");
		answer = scanner.nextLine();
		System.out.println("They speed up queries for non unique columns of tables while slowing down inserts and deletes.");
		System.out.println();
		answer = null;
		System.out.println("What is TRUE about IN and EXISTS?");
		answer = scanner.nextLine();
		System.out.println("IN scans every record of a subquery whereas EXISTS stops searching as soon as it determines the scan as TRUE.");
		System.out.println();
		answer = null;
		
		System.out.println("Scalar functions are used for what?");
		answer = scanner.nextLine();
		System.out.println("To perform an operation on values returned from a query.");
		System.out.println();
		answer = null;
		
		System.out.println("Which aggregate function is used to combine values into a number representing the number of total values?");
		answer = scanner.nextLine();
		System.out.println("COUNT");
		System.out.println();
		answer = null;
		
		System.out.println("Which aggregate function is used to combine values into a number representing the combination of all of the values?");
		answer = scanner.nextLine();
		System.out.println("SUM");
		System.out.println();
		answer = null;

		System.out.println("That's all for SQL. Enter any key to return to the main menu");

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
