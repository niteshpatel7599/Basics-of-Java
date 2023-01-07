package com.class_object.oopsconcepts;

public class StaticKeyword {

	static String name ="ABC";
	byte age = 12;
	String grade ="1st";
	
	public void displayDetails() {
		System.out.println("Student "+ name + " is "+ age+" year old and in "+ grade + " grade ");
	}
	
	public static void doThis() {
		System.out.println("Do This");
	}
	
	
}
