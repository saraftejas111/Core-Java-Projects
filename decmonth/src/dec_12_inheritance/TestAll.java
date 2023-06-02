package dec_12_inheritance;

public class TestAll{
	

	public static void main(String[] args) {
		Employee e1= new Employee (23, "Gabbar", "Ramgad", "Leader", 200000);
		System.out.println(e1);
		System.out.println();
		
		Doctor d1=new Doctor(1122, "Dr. Subhash", "Nasik", "Orthopediac", 40000.65);
		System.out.println(d1);

	}
}
