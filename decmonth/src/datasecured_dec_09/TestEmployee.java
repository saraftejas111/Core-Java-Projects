package datasecured_dec_09;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Employee e1= new Employee(25, "Mukesh Ambani");
		System.out.println(e1);
		e1.setAge(27);
		System.out.println(e1);
		e1.setAge(-7);
		System.out.println(e1);
		
		
	}

}
