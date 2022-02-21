package com.thomaslearns.jwa.week2and3;

import java.util.Scanner;

public class LearnCollections {
	Scanner scanner = new Scanner(System.in);
	int choice = 0;
	String answer = null;
	
	public void collectionsWorld() {
		
		System.out.println("What are collections in Java?");
		answer = scanner.nextLine();
		System.out.println("A general data structure that contains Objects. Also the name of the API.");
		System.out.println();
		answer = null;
		
		System.out.println("What are the interfaces in the Collections API?");
		answer = scanner.nextLine();
		System.out.println("Iterator, Collection, List, Queue, Set, Map, SortedSet, SortedMap");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between a `Set` and a `List`?");
		answer = scanner.nextLine();
		System.out.println("`Set` does not allow duplicates (its members are unique)");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between an `Array` and an `ArrayList`?");
		answer = scanner.nextLine();
		System.out.println("An array is static and its size cannot be changed, but an ArrayList can grow/shrink.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between `ArrayList` and `Vector`?");
		answer = scanner.nextLine();
		System.out.println("`Vector` is synchronized whereas `ArrayList` is not.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between `TreeSet` and `HashSet`?");
		answer = scanner.nextLine();
		System.out.println("The two general purpose `Set` implementations are `HashSet` and `TreeSet`. `HashSet` "
				+ "is much faster (constant time versus log time for most operations) but offers no ordering guarantees.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the difference between HashTable and HashMap?");
		answer = scanner.nextLine();
		System.out.println("a. `Hashtable` is synchronized whereas `Hashmap` is not. / b. `Hashmap` permits `null` values and the `null` key.");
		System.out.println();
		answer = null;
		
		System.out.println("Are Maps in the Collections API?");
		answer = scanner.nextLine();
		System.out.println("Yes, but they do not implement `Collection` or `Iterable` interfaces");
		System.out.println();
		answer = null;
		
		System.out.println("What interface is used to define the natural ordering?");
		answer = scanner.nextLine();
		System.out.println("Comparable");
		System.out.println();
		answer = null;
		
		System.out.println("A ______ comprises a sequence of nodes with each node containing a reference to its "
				+ "successor and can be used to implement Stacks and Queues.");
		answer = scanner.nextLine();
		System.out.println("LinkedList");
		System.out.println();
		answer = null;
		
		System.out.println("A ______ is more efficient for random access and less efficient for inserting/removing elements when compared to ______");
		answer = scanner.nextLine();
		System.out.println("ArrayList, LinkedList");
		System.out.println();
		answer = null;
		
		System.out.println("A ______ supports the insert and remove operations using a first-in first-out (FIFO) order.");
		answer = scanner.nextLine();
		System.out.println("Queue");
		System.out.println();
		answer = null;
		
		System.out.println("What are Generics?");
		answer = scanner.nextLine();
		System.out.println("They enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods.");
		System.out.println();
		answer = null;
		
		System.out.println("What is the Collections class?");
		answer = scanner.nextLine();
		System.out.println("A utility class with useful static methods.");
		System.out.println();
		answer = null;
		
		System.out.println("What do collections only accept?");
		answer = scanner.nextLine();
		System.out.println("Objects");
		System.out.println();
		answer = null;
		
		System.out.println("What does the comparator interface declare?");
		answer = scanner.nextLine();
		System.out.println("It declares the method compare. It's a functional interface, it only has that "
				+ "method and it's used to define an order different than the natural one.");
		System.out.println();
		answer = null;
		
		System.out.println("What classes are Iterable?");
		answer = scanner.nextLine();
		System.out.println("HashSet, ArrayDeque, LinkedList, TreeSet");
		System.out.println();
		answer = null;
		
		System.out.println("What is the root interface of the Collection API?");
		answer = scanner.nextLine();
		System.out.println("Collection");
		System.out.println();
		answer = null;
		
		System.out.println("What do Generics provide?");
		answer = scanner.nextLine();
		System.out.println("They provide compile time safety.");
		System.out.println();
		answer = null;
		
		System.out.println("______ is a List implementation that also implements the Queue and Deque interfaces.");
		answer = scanner.nextLine();
		System.out.println("LinkedList");
		System.out.println();
		answer = null;
		
		System.out.println("A _____ is a collection that is based on the last-in-first-out (LIFO) policy.");
		answer = scanner.nextLine();
		System.out.println("Stack");
		System.out.println();
		answer = null;
		
		System.out.println("A _____ is comprised of a set of vertices and a set of edges. Each edge represents a "
				+ "connection between two vertices. Two vertices are neighbors if they are connected \nby an edge, and "
				+ "the degree of a vertex is its number of neighbors.");
		answer = scanner.nextLine();
		System.out.println("Graph");
		System.out.println();
		answer = null;
		
		System.out.println("A ______ is a binary tree that contains a key–value pair in each node and for which "
				+ "the keys are in symmetric order\\: The key in a node is larger than the key of every\n node in its "
				+ "left subtree and smaller than the key of every node in its right subtree.");
		answer = scanner.nextLine();
		System.out.println("Binary search tree");
		System.out.println();
		answer = null;
		
		System.out.println("A _______ is a data structure in which we use a hash function to divide the keys into m groups, "
				+ "which we expect to be able equal in size. For each group, we keep the keys in an\n unordered linked list and use sequential search.");
		answer = scanner.nextLine();
		System.out.println("Hashtable");
		System.out.println();
		answer = null;
		
		System.out.println("What does HashMap do?");
		answer = scanner.nextLine();
		System.out.println("HashMap in Java will resolve collisons by checking the hashcode first, then iterating over all elements with that "
				+ "hashcode using the equals method and generating\n a new entry if none of the elements are equal.");
		System.out.println();
		answer = null;
		
		System.out.println("The elements of a ____ are ordered according to their natural ordering, or by a Comparator provided at construction "
				+ "time, depending on which constructor is used.");
		answer = scanner.nextLine();
		System.out.println("PriorityQueue");
		System.out.println();
		answer = null;
		
		System.out.println("______ is a resizable array implementation of Deque that is likely to be "
				+ "faster than Stack when used as a stack, and faster than LinkedList when used as a queue.");
		answer = scanner.nextLine();
		System.out.println("ArrayDeque");
		System.out.println();
		answer = null;
		
		System.out.println("______ is an array-backed collection that acts as a \"bounded buffer\", in which a "
				+ "fixed-sized array holds elements inserted by producer threads and extracted by consumer threads.\n "
				+ "Attempts to put an element into a full queue will result in the operation blocking; attempts to take an "
				+ "element from an empty queue will similarly block.");
		answer = scanner.nextLine();
		System.out.println("ArrayBlockingQueue");
		System.out.println();
		answer = null;
		
		System.out.println("___________, which is implemented as a hash table with a linked list running through it, orders "
				+ "its elements based on the order in which they were inserted into the collection (insertion-order).");
		answer = scanner.nextLine();
		System.out.println("LinkedHashSet");
		System.out.println();
		answer = null;
		
		System.out.println("______, which stores its elements in a hash table, is the best-performing Set implementation; however "
				+ "it makes no guarantees concerning the order of iteration.");
		answer = scanner.nextLine();
		System.out.println("HashSet");
		System.out.println();
		answer = null;
		
		
		System.out.println("That's all for Collections. Enter any key to return to the main menu");
		
		
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
