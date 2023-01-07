package com.oopspracticeproject.pankajsirpract1;

public class UnEmployeed extends Person{

	private double taxPercentage;
	private double salary;
	
	
	public UnEmployeed(double taxPercentage, double salary) {
		salary = salary -(salary *taxPercentage);
		System.out.println(salary);
	}
	public void calculateSalary () {
		System.out.println("Show Salary");
	}
	
	
}
