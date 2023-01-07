package com.arrays.ArrayBasics;

public class Employee {

	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, String employeeDesignation, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public Object setEmployeeName(String employeeName) {
		return this.employeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public Object setEmployeeDesignation(String employeeDesignation) {
		return this.employeeDesignation = employeeDesignation;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public Object setEmployeeSalary(double employeeSalary) {
		return this.employeeSalary = employeeSalary;
	}
	
	
}
