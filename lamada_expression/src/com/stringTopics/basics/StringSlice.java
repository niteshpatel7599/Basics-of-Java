package com.stringTopics.basics;

public class StringSlice {

	/*
	 * Char At
	 * Sub String
	 * Split
	 */
	public static void main(String[] args) {
		String str1 ="ABCDEFG";
		System.out.println(str1.charAt(4));
		
		//Write a program to reveres a string
		System.out.println(str1.length());
		for (int i = str1.length(); i >= 1; i--) {
			System.out.print(str1.charAt(i-1));
		}
		System.out.println("\n");
		
		//write a program to reverse a string
		String temp ="";
		for (int i = 0; i <= str1.length()-1; i++) {
			temp = str1.charAt(i) +temp;
		}
		System.out.println(temp);
		
		//substring
		String temp1 = str1.substring(2,4);
		String temp2 = str1.substring(0,2);
		String temp3 = str1.substring(4,7);
		System.out.println(temp2 + temp3 +temp1);
		
		//Split
		String str2 = "A_B_C_D_E_F_G_H";
		String del = "_";
		String [] arr = str2.split(del);
		String temp4 ="";
		for (int i = 0; i <= arr.length-1; i++) {
			temp4 = arr[i] + temp4;
		}
		System.out.println(temp4);
	}
}
