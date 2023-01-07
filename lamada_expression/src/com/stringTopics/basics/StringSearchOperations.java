package com.stringTopics.basics;

public class StringSearchOperations {

	/*
	 * Contains
	 * Starts with
	 * Ends With
	 * Index of 
	 * Last Index of
	 * 
	 */
	public static void main(String[] args) {
		
		String str = "I love java love and Spring boot";
		String str1 = "JAVA";
		//contains
		System.out.println(str.toLowerCase().contains(str1.toLowerCase()));
		//starts with
		System.out.println(str.startsWith("I"));
		//Ends with
		System.out.println(str.endsWith("boot"));
		
		//index of
		System.out.println(str.indexOf("Spring"));//always return first occurrence
		System.out.println(str.indexOf("love", 6));
		System.out.println(str.lastIndexOf("love"));
		
		
		
	}
}
