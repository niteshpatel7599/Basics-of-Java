package com.constructorchaining.constructorchaining;

public class ThisKeyword {

	public ThisKeyword() {
		this("Hari");
		System.out.println("Default Constructor");
	}
	public ThisKeyword(String name) {
		this("Pavan", "299 Lig Vikas");
		System.out.println("Constructor with one argument");
	}
	public ThisKeyword(String name, String address) {
		this("Ramesh", "Indore", "29 year old");
		System.out.println("Constructor with Two argument");
	}
	public ThisKeyword(String name, String address, String age) {
		this("Nitesh", "Shikarji Dreaz Indore", "32 year old", "1st");
		System.out.println("Constructor with Three argument");
	}
	public ThisKeyword(String name, String address, String age, String rank) {
		System.out.println("Constructor with Four argument");
	}
	public static void main(String[] args) {
		ThisKeyword t1 = new ThisKeyword();
	}
}
