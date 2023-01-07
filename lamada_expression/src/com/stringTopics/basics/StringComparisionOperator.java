package com.stringTopics.basics;

public class StringComparisionOperator {

	/* ==
	 * equals
	 * compare to
	 * matches
	 */
	public static void main(String[] args) {
		String str1 = "AABCD";
		String str2 = "ABCD";
		String str3 ="ABCD";
		String str4 ="abcdefgh";
		String str5 ="abcdefghijkl";
		String str6 ="abcdefgh";
		String str7 ="abcdefgh";
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		
		//compare to
		System.out.println(str1.compareTo(str3));
		System.out.println(str4.compareTo(str5));
		System.out.println(str4.compareTo(str6));
		System.out.println(str5.compareTo(str6));
		
		String reg ="[A-Z]{1,}";
		System.out.println(str1.matches(reg));
	}
	
	
	
}
