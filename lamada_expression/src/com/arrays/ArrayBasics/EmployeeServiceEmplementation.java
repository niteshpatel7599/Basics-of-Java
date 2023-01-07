package com.arrays.ArrayBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeServiceEmplementation implements EmployeeService {

	Employee e1 = new Employee();

	
	
	@Override
	public void displayEmployee(List<Object> list) {
System.out.println(list);
//		List<Object> l1 = twoDArrayToList(list);
		
//		System.out.println(twoDArrayToList(arr));
//		for (Object objects : list ) {
//			System.out.println(objects);
//		}
//		for (Object[] objects : arr) {
//			for (Object objects2 : objects) {
//				System.out.print(objects2 + " ");
//			}
//			System.out.println("\n");
//		}

	}
	public List<Object> twoDArrayToList(Object[][] arr) {
	    List<Object> list = new ArrayList<Object>();
	    for (Object[] array : arr) {
	        list.addAll(Arrays.asList(array));
	    }
	    return list;
	}

	@Override
	public void salaryIncrement(double increment) {
		if(e1.getEmployeeSalary() >= 80000) {
			increment = .25*(e1.getEmployeeSalary());
			System.out.println(increment);
		} else if(e1.getEmployeeSalary() >= 50000 && e1.getEmployeeSalary() < 60000) {
			increment = .20*(e1.getEmployeeSalary());
			System.out.println(increment);
		}else if(e1.getEmployeeSalary() <= 50000) {
			increment = .15*(e1.getEmployeeSalary());
			System.out.println(increment);
		}
	}


}
