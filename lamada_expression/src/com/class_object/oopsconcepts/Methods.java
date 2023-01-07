package com.class_object.oopsconcepts;

public class Methods {

	/*
	 * Creating method in java 
	 * How does a method return value
	 */
	public static void main(String[] args) {
		Methods m1 = new Methods();
		m1.doThis();
		m1.addition(20, 30);
		int x =m1.multiply(10, 40);
		System.out.println(x);
		}
	public void doThis() {
		System.out.println("do this is excecuted");
	}
	
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	
	public int multiply(int num1, int num2) {
		int num3 = num1 * num2;
		return num3;
	}
	
}
