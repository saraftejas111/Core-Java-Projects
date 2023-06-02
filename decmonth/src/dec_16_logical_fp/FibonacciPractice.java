package dec_16_logical_fp;

public class FibonacciPractice {
	public static void main(String[] args) {
		
		int n=10;
		int n1= 0, n2= 1, n3= 0;
		for (int i=1; i < n; i++) {
			
			System.out.println(n1 + " ");
			n3 = n2 + n1;    // code for fibonacci
			n1 = n2;
			n2 = n3;
			
		}
	}

}
