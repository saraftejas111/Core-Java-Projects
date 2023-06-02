package dec_08;

public class EmployeeInfo {
	int emp_id;
	String emp_nm;
	double sal;
	
	
    EmployeeInfo(int emp_id, String emp_nm, double sal){
    	this.emp_id=emp_id;
    	this.emp_nm=emp_nm;
    	this.sal=sal;
    	
    }	
    	EmployeeInfo() {
	
	}
		void display() {
    	
    	System.out.println("Employee id>> "+emp_id);
    	System.out.println("Employee name>> "+emp_nm);
    	System.out.println("Employee sal>> "+sal+"\n");
    	
    	
    	
    	
    }
}
