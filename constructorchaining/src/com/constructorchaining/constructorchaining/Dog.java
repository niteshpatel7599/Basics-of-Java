package com.constructorchaining.constructorchaining;

public class Dog extends Animal {

	public Dog() {
		
	}
	public Dog(String name, String leg) {
		super(name);
		System.out.println(name + "Running very fast with" +leg);
	}
	
	public static void main(String[] args) {
		Animal m1 = new Animal("Sheru", "Four Legs");
		Animal m2 = new Animal("Sheru", "Four Leg", "Mou");
		Animal m3 = new Animal();
		Dog d1 =new Dog("Hera", "three");
	}
	
	
}
