package dec_30_arraylist;

import java.util.ArrayList;

public class StudentArray {
	public static void main(String[] args) {
		
		Student s1 = new Student (1 , "Raj");
		Student s2 = new Student (2, "Nisha");
		Student s3 = new Student (3, "Ravi");
		Student s4 = new Student ();
		s4.id=4;
		s4.name="Ram";
		
		
		ArrayList <Student> al = new ArrayList<>(); 
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4); 
		
		for(Object t : al) {
			System.out.println(t);
			
		}
	}

}
