package java_comparable_comparator.usesofinterface;

import java.util.Comparator;

public class NameSortingComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}

	
	}


