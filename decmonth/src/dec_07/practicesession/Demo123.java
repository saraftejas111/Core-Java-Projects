package dec_07.practicesession;

public class Demo123 {
	int a,b,c;
	
	Demo123 (){
		System.out.println("default constructor");
	}
   
	Demo123(int x, int y){
		
		a=x;
		b=y;
		System.out.println("parameterized constructor with 2 parameters");
		
	}
	
	Demo123(int x, int y, int z){
		a=x;
		b=y;
		c=z;
		System.out.println("parameterized constructor with 3 parameters");
		
	}
    void display() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
}
}