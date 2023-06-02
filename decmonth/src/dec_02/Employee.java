package dec_02;

public class Employee {
	int e_id;
	String e_name;
	String position;
	int salary;
	
	void empl(int a, String n, String p, int s) {
		e_id=a;
		e_name= n;
		position=p;
		salary=s;
	}
	
	 void display() {
		 
		 System.out.println("Employee id:"+e_id);
		 System.out.println("employee name:"+ e_name);
		 System.out.println("position :"+position);
		 System.out.println("Package :"+salary+"LPA");
		 
	 }

}
