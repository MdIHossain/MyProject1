package constoctor;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emploee1 = new Employee();
		Employee emploee2 = new Employee("Ismail");
		Employee emploee3 = new Employee("Ismail  ",100);
		Employee emploee4 = new Employee("Ismail  ",100,  'M', true);

	}

}
