package dec_02;

public class TestStudent {
     public static void main(String[] args) {
		Student s1= new Student();
		s1.stndt(1, "Tejas", "civil engineering", 85.23F);
		s1.display();
		System.out.println();
	
		Student s2= new Student();
		s2.stndt(2, "Disha", "Computer engineering", 82.56f);
		s2.display();
		System.out.println();
		
		
		Student s3= new Student ();
		s3.stndt(3, "Ranbir", "E&TC", 56.33f);
		s3.display();
		System.out.println();
		
		Student s4= new Student();
		s4.stndt(4, "Alia", "Mechanical engineering", 38.98f);
	    s4.display();
		System.out.println();
	}
}
