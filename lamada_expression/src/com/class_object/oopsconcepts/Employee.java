package com.class_object.oopsconcepts;

public class Employee {

	/*
	 * Create employee class
	 * create class variable Employee Id, Employee Name, Employee salary
	 * create method to calculate and display employee bonus (20% of Employee salary)
	 * create Employee_main class with main method
	 * Create 2 objects of Employee class Employee_Main
	 * Assign values to variables and call the method from employee class 
	 * by using  object created in step 5
	 */
	String employeeId ="ax1";
	String employeeName = "Nitesh Patel";
	double employeeSalary = 40000;
	
	public void displayBonus() {
		double employeeBonus = (employeeSalary * 20)/100;
		double totalSalary = employeeBonus +employeeSalary;
		
		System.out.println("Employee Id : " + employeeId + "\n" +
		 "Employee Name : " + employeeName + "\n" +  "Employee Salary : " + employeeSalary+
		 "\n"+ "Employee Bonus  :" + employeeBonus + "\n" +"Total Salary of the "+ employeeName
		 + "is " + totalSalary);
	}
}
