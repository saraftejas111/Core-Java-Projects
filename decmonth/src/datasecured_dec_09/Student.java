package datasecured_dec_09;

public class Student {
	private int id;
	private String name;
	private float per;
	
    Student(){
		// default constructor
	}
	
	Student(int i, String nm, float p) {
		id=i;
		name=nm; // parameterized constructor
		per=p;
}
	// getter setter method
	public int getid(int id) {
		return id;
	}
	public String getname(String name) {
		return name;
	}
	public float getper(float per) {
		return per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
}

