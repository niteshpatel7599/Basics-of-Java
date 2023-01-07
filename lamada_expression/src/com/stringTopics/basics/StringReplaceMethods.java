package com.stringTopics.basics;

public class StringReplaceMethods {

	/*
	 * replace - normal
	 * replace all - regEx
	 */
	public static void main(String[] args) {
		
		String str1 ="concentrat1234on 1234mproves w1234th pract1234ce";
		String str2 ="1234";
		String str3 = "i";
		System.out.println(str1.replaceAll(str2, str3));
		
		
		//replace all
		String str4 = "Hi^([a-zA-Z0-9My##&&$$$$_\\-\\.]+)@([a-zA-Z0-9name_\\-\\.]+)i\\.(s[a-zA-Z]{2,5})nitesh$";
		String str5 = "[^A-Za-z0-9\\s]";
		System.out.println(str4.replaceAll(str5, ""));
	}
}
