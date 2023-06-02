package datasecured_dec_09;

public class Employee {
	int age;
	String name;
	
	Employee(int age, String name){
		this.age=age;
		this.name=name;
		
	}
	void setAge(int age) {
		if (age>0)
		this.age=age;
		else
			System.out.println(age+" Invalid Age");
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
}
