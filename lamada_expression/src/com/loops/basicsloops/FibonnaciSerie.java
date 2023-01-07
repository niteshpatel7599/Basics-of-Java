package com.loops.basicsloops;

import java.util.Iterator;

public class FibonnaciSerie {

	/*
	 * Write a program to find first 20 numbers of Fibonaci Series
	 * 01123581321
	 * 
	 */
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for (int i = 1; i <=18; i++) {
			num3 = num2 +num1;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}

}
