package dec_19_finalstatic;

public class StaticBlockEx {
	static int a, b;
	
	static {
		System.out.println("static block called");
		a=10;
		b=20;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("value of a = "+ a);
		System.out.println("value of b = "+ b);
	}

}
