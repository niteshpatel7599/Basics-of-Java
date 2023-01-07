package com.arrays.ArrayBasics;

import java.util.Scanner;

public class EnhanchedForLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter any number");
		
		int num1 = s.nextInt();
		int [] arr = new int[10];
		
		for (int i = 1; i <= 10; i++) {
			arr[i-1] = num1 * i;
		}
		for (int i : arr) {
			System.out.println(i);
		}
		s.close();
	}
}
