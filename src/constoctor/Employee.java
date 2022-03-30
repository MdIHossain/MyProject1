package constoctor;

public class Employee {
	public String empName;
	public int empId;
	public char empSex;
	public boolean fullTimeEmployee;

	public Employee() {
		System.out.println("This is defauld constructor ic Employee class");
	}

	public Employee(String empName) {
		this.empName = empName;
		System.out.println("This is the Employee Name: " + empName);
	}

	public Employee(String empName, int empId) {
		this.empName = empName;
		this.empId = empId;
		System.out.println("This is the Employee Name: " + empName + "Employee Id" + empId);
	}

	public Employee(String empName, int empId, char empSex) {
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		System.out.println("This is the Employee Name: " + empName + "Employee Id " + empId + "Employee Sex " + empSex);
	}

	public Employee(String empName, int empId, char empSex, boolean fullTimeEmployee) {
		this.empName = empName;
		this.empId = empId;
		this.empSex = empSex;
		System.out.println("This is the Employee Name: " + empName + "Employee Id " + empId + "Employee Sex " + empSex);
	}

}
