package dec_07;

public class TestStudent {
	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.id=1;
		s1.name= "Akshay";
		s1.per= 73.26f;
		s1.display();
		
		Student s2= new Student(2, "Kajal", 87.7f);
		s2.display();
		
		}
	}


