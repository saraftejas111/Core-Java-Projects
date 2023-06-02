package dec_12_inheritance;

public class Employee extends Person {
	String role;
	double sal;
	
	
		
	public Employee(int id, String name, String add, String role, double sal) {
		super(id, name, add);
		this.role=role;
		this.sal=sal;
		
	
		
	}



	@Override
	public String toString() {
		return "Emplpoyee [id=" + id + ", name=" + name + ", add=" + add +", role=" + role +", sal=" +  sal +"]";
	}
	
	

}
