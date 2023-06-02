package dec_02;

public class Student {
	int id ;
	String name;
	String stream;
	float per;
	
	void stndt(int a, String n, String s, float p ){
		id= a;
		name= n;
		stream= s;
		per= p;
		
		}
	
	void display() {
		System.out.println("student id:"+id);
		System.out.println("student name :"+name);
		System.out.println("branch/stream :"+stream);
		System.out.println("percentage :"+per);
	}

}
