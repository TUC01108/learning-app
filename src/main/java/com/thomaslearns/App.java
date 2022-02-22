package com.thomaslearns;

/**
 * Learning app welcome class
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
    	Class.forName("org.postgresql.Driver");
        System.out.println("Driver Loaded");
    	LearnApp learnApp = new LearnApp();
        learnApp.startLearnApp();
    }
}
