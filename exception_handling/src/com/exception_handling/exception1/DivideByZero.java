package com.exception_handling.exception1;

public class DivideByZero {

	public static void main(String[] args) {
		int num1 = 10;
		int num2=0;
		try {
			System.out.println(num2/num1);
		} catch (ArithmeticException e) {
			System.out.println("Problem is "+ e.getMessage());
		}
		System.out.println("After exception Excecution");
		Runtime.getRuntime().gc();
	}
}
