package dec_19_finalstatic;

public class Student {
	int a;
	static int b;
	
	Student (){
		b++;
	}
	public void showData() {
		System.out.println("Value of a = "+a);
		System.out.println("Value of b = "+b);
	}

}
