package com.lamada_expression.lamadaexpression;

public class JavaTester {

	public static void main(String[] args) {
		JavaTester operate = new JavaTester();
		
		GreetingService greet = message -> System.out.println("Hello Mr. "+ message);
		greet.sayMessage("Nitesh Patel");
	}
}
