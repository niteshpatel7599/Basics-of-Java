package com.exception_handling.exception1;

public class StackOverFlow {

	public static void main(String[] args) {
		System.out.println("-----------Main Start------------");
		method1();
		System.out.println("------------Main End-------------");
		
	}

	private static void method1() {
		System.out.println("-----------Method1 Start------------");
		method2();
		System.out.println("------------Method1 End-------------");
		
	}

	private static void method2() {
		System.out.println("-----------Method2 Start------------");
		method2();
		System.out.println("------------Method2 End-------------");
		
	}
}
