package com.constructorchaining.constructorchaining;

public class Animal {

	public Animal() {
	}
	protected Animal(String Dogname) {
		this();
	}
	
	protected Animal(String Dogname, String leg) {
		this(Dogname);
		System.out.println("Dog Name is :"+ Dogname + "Dog Having:" + leg);
	}
	protected Animal(String Dogname, String leg, String catName) {
		this(catName, leg);
		System.out.println("Cat is Having:" + leg+"Cat Name is :"+ catName);
	}
	
}
