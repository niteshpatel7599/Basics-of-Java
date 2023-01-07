package com.oopspracticeproject.pankajsirpract1;

public class SelfEmployeed extends Person {

	private double taxPercentage;
	private double salary;
	
	
	public SelfEmployeed(double taxPercentage, double salary) {
		salary = salary -(salary *taxPercentage);
		System.out.println(salary);
	}
	
	public void calculateSalary () {
		System.out.println("Show Salary");
	}


	
	
}
