package dec_06.assignments;

public class Problem8 {
	public static void main(String[] args) {
		
		int a= 10, b = 5, temp = 0;
		System.out.println("Before swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("\nAfter swap");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
}
