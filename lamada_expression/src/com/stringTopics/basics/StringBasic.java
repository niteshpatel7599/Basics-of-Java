package com.stringTopics.basics;

public class StringBasic {

	/*
	 * Concatenate
	 * length
	 * trim
	 * upper case
	 * lower case
	 * empty
	 */
	public static void main(String[] args) {
		String str1 = "Nitesh";
		String str2 = "Patel";
		
		//Concatenate
		System.out.println("This is Mr. " + str1 + str2);
		
		//length
		System.out.println(str1.length()+" " + str2.length());
		String str3 = "    xxnsjcn mskxmsksk    ";
		//trim
		System.out.println("Normal String"+ str3);
		System.out.println("Trimed String" + str3.trim());
		
		//upper case
		System.out.println(str3.toUpperCase());
		//lower case
		System.out.println(str3.toLowerCase());
		String str4 = "";
		System.out.println(str3.isEmpty());
		System.out.println(str4.isEmpty());
	}
}
