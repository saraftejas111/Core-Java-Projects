package dec_22_arrayhw;

public class Employee {
	int empcode;
	String name;
	double salary;
	
	
	public Employee() {
	}


	public Employee(int empcode, String name, double salary) {
		super();
		this.empcode = empcode;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empcode=" + empcode + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
