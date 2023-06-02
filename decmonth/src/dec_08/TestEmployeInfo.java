package dec_08;

public class TestEmployeInfo {
	public static void main(String[] args) {
		
		EmployeeInfo e1= new EmployeeInfo();
	   e1.emp_id= 21;
	   e1.emp_nm= "Tejas";
	   e1.sal= 50000.00;
	   e1.display();
	   
	
	
	EmployeeInfo e2= new EmployeeInfo(22, "Nisha", 80000.65);
	e2.display();
	
		   
	   
	
	}
}
