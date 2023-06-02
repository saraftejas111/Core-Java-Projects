package dec_07;

public class Student {
	int id;
	String name;
	float per;
	
	Student (){
		
	}
	
	Student (int id, String name, float per ){
		this.id=id;
		this.name=name;
		this.per=per;
		
	}
	void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(per);
	}
	

}
