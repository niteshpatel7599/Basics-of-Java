package com.arrays.ArrayBasics;

public class ArrayExcersie {

	/*
	 * write a program to reverse the content of an array
	 */
	
	public static void main(String[] args) {
		
		int [] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int j = x.length-1;
		int  temp=0;
		for (int i = 0; i <= (x.length-1)/2; i++) {
			temp = x[i];
			x[i] = x[j];
			x[j] = temp;
			j--;
		}
		for (int i : x) {
			System.out.println(i);
		}
		
		String [] y = {"abc", "sdr", "gtr", "dfr"};
		int j1 = y.length-1;
		String  temp1="";
		for (int i1 = 0; i1 <= (y.length-1)/2; i1++) {
			temp1 = y[i1];
			y[i1] = y[j1];
			y[j1] = temp1;
			j1--;
		}
		for (String string : y) {
			System.out.println(string);
		}
	
}
}
