package com.class_object.oopsconcepts;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.employeeId="ab1";
		emp1.employeeName="Mahesh shrivastav";
		emp1.employeeSalary = 55000;
		
		emp1.displayBonus();
		emp2.employeeId= emp2.employeeId;
		emp2.employeeName= emp2.employeeName;
		emp2.employeeSalary= emp2.employeeSalary;
		emp2.displayBonus();
		
	}
}
