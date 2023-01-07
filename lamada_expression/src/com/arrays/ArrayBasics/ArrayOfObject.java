package com.arrays.ArrayBasics;

public class ArrayOfObject {

	public static void main(String[] args) {
		Object [][] arr = {{"Nitesh",32,5.11+ "Male"},
				{"Mayank",31,5.10+ " Male"},
				{"Ashish",30,5.8+ " Male"},
				{"Darbar",35,5.9+ " Male"}};
		for (Object[] objects : arr) {
			for (Object objects2 : objects) {
				System.out.print(objects2+ " ");
			}
			System.out.println("\n");
		}
	}
}
