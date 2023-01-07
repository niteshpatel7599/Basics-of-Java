package java_comparable_comparator.usesofinterface;

import java.util.Comparator;

public class SalarySortingComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		{
	        if (o1.getEmployeeSalary()== o2.getEmployeeSalary())
	            return 0;
	        else if (o1.getEmployeeSalary() < o2.getEmployeeSalary())
	            return 1;
	        else
	            return -1;
	    }
	}

}
