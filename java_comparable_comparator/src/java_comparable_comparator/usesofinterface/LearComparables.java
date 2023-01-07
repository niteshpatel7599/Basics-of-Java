package java_comparable_comparator.usesofinterface;

import java.util.ArrayList;
import java.util.Collections;

public class LearComparables {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Nitesh", "Software Emgineer", 30000));
		empList.add(new Employee("Ramesh", "Automation Tester", 50000));
		empList.add(new Employee("Suresh", "Junior Developer", 800000));
		empList.add(new Employee("Jagadeesh", "Software Emgineer", 25000));
		empList.add(new Employee("Soma", "Senior Devloper", 60000));
		empList.add(new Employee("Sneha", "Frontend Developer", 75000));
		empList.add(new Employee("Ooha", "Devops Emgineer", 100000));
		empList.add(new Employee("Mayank", "Architech Solution", 130000));
		
		Collections.sort(empList, new NameSortingComparator());
		
		empList.stream().forEach(c -> System.out.println(c));
		
	}
}
