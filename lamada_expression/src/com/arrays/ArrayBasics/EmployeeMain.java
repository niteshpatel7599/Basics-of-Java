package com.arrays.ArrayBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeServiceEmplementation a = new EmployeeServiceEmplementation();
		Employee e1 = new Employee();
		Object[][] arr = {
				{ e1.setEmployeeName("Nitesh"), e1.setEmployeeDesignation("Support Engineer"),
						e1.setEmployeeSalary(50000) },
				{ e1.setEmployeeName("Mayank"), e1.setEmployeeDesignation("Software Developer"),
						e1.setEmployeeSalary(80000) },
				{ e1.setEmployeeName("Nitesh"), e1.setEmployeeDesignation("Automation Tester"),

						e1.setEmployeeSalary(60000) } };
		List<List<Object>> list = Arrays.stream(arr)
                .map(Arrays::asList)
                .collect(Collectors.toList());
		System.out.println(list);
//		Collections.sort(list);
		
		
	}

}
