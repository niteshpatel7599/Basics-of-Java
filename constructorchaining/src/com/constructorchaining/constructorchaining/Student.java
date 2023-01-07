package com.constructorchaining.constructorchaining;

public class Student {

	Student() {
	}

	Student(String address, int houseNo, String phoneNumber) {
		this();
		System.out.println(address + houseNo + phoneNumber);
		
	}

	public Student(String name) {
		this();
		System.out.println("Name of Student "+ name);
	}
	
	
	public Student(String name, int rollNo ) {
		this(name);
		System.out.println(name + " = " + rollNo);
		
	}

	public static void main(String[] args) {
		Student s = new Student("John", 76);
		Student c = new Student("LIG Vikas Nagar", 299, "9713069176");
	}
}
