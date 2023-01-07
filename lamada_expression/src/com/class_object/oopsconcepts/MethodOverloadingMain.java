package com.class_object.oopsconcepts;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		MethodOverloading over = new MethodOverloading();
		over.addition(10, 15);
		over.addition(20, 15.2);
		over.addition(12.5, 20);
		over.addition(20.5, 7.5);
		over.addition(50, "years old");
		over.addition("Nitesh got out of 100", 65);
		over.addition(10, 20, 40);
	}
}
