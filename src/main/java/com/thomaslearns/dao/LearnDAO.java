package com.thomaslearns.dao;

import com.thomaslearns.model.Learn;

public interface LearnDAO {
	public void addMemoryItem(Learn item);
	public void updateMemoryItem(Learn item);
	public void deleteMemoryItem(int memoryId);
	public void searchByMemoryId(int memoryId);
	public void searchByMemoryName(String memoryName);
	public void printAllMemoryItems();

}
