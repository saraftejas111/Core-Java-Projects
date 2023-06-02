package dec_07;

public class Employee {
	
	int id;
	String name;
	String position;
	double salary;
	
	Employee (){
		
	}
    
	Employee (int id, String name, String position, double salary){
		this.id=id;
		this.name=name;
		this.position=position;
		this.salary=salary;
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(position);
		System.out.println(salary+"\n");
	}
}
