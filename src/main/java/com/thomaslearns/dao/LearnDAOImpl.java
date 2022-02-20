package com.thomaslearns.dao;

import com.thomaslearns.model.Learn;

public class LearnDAOImpl implements LearnDAO {

	@Override
	public void addMemoryItem(Learn item) {
		System.out.println("Adding memory item : "+item);
		
	}

	@Override
	public void updateMemoryItem(Learn item) {
		System.out.println("Updating memory item : "+item);
		
	}

	@Override
	public void deleteMemoryItem(int memoryId) {
		System.out.println("Deleting memory item with memoryId : "+memoryId);
		
	}

	@Override
	public void searchByMemoryId(int memoryId) {
		System.out.println("Searching for memory item with memoryId : "+memoryId);
		
	}

	@Override
	public void searchByMemoryName(String memoryName) {
		System.out.println("Searching for memory item with memory name : "+memoryName);
		
	}

	@Override
	public void printAllMemoryItems() {
		System.out.println("Printing all products ");
		
	}

}
