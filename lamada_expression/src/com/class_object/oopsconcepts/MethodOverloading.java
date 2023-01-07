package com.class_object.oopsconcepts;

public class MethodOverloading {

	/*
	 * Method Overloading
	 */
	public void addition(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public void addition(double num1, int num2) {
		System.out.println(num1 + num2);
	}
	public void addition(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	public void addition(int num1, double num2) {
		System.out.println(num1 + num2);
	}
	public void addition(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	public void addition(String str1, int num2) {
		System.out.println(str1 + num2);
	}
	public void addition(int num1, String str1) {
		System.out.println(num1 + str1);
	}
}
