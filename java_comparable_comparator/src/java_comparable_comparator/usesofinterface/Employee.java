package java_comparable_comparator.usesofinterface;

public class Employee {

	private String employeeName;
	private String employeeDesignation;
	private int employeeSalary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(String employeeName, String employeeDesignation, int employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}

//	@Override
//	public int compareTo(Employee o) {
//		return this.employeeSalary - o.employeeSalary;
//	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return employeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}


	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeDesignation=" + employeeDesignation
				+ ", employeeSalary=" + employeeSalary + "]";
	}

	
	

}
