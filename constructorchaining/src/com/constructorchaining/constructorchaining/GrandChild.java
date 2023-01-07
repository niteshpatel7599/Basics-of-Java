package com.constructorchaining.constructorchaining;
//Nested Class
public class GrandChild extends Child{

	public GrandChild() {
		System.out.println("Constructor from GrandChild");
	}
	public static void main(String[] args) {
		GrandChild g1 = new GrandChild();
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("Constructor from child class");
	}
}

class Parent{
	public Parent() {
		System.out.println("Constructor from Parent class");
	}
	
}
