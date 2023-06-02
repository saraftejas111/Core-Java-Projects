package dec_02;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1= new Employee ();
		
		e1.empl(12, "Osama Bin Laden","Executive Engineer", 9);
		e1.display();
		System.out.println();
		
		Employee e2= new Employee();
		e2.empl(10, "Dawood Ibrahim", "Explosive Expert", 12);
		e2.display();
		System.out.println();
		
		Employee e3= new Employee();
		e3.empl(15, "Pablo Escobar", "Chemist & Drugist", 25);
		e3.display();
		System.out.println();
		
		Employee e4= new Employee();
		e4.empl(34, "Chhota Shakeel", "Passport Advisor", 6);
		e4.display();
		
		
	}

}
