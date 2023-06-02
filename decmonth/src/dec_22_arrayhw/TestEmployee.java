package dec_22_arrayhw;

public class TestEmployee { 
	public static void main(String[] args) {
		
	
	
	Employee [] ee = new Employee [3];
	ee[0] = new Employee (1,  "Rajiv", 20000.00);
	ee[1] = new Employee (2,  "Osama", 40000.00);
	ee[2] = new Employee (3,  "Ambani",600000.00);
	
	System.out.println(ee[0]);
	System.out.println(ee[1]);
	System.out.println(ee[2]);
	

}
}