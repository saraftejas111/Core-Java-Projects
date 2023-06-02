package dec_16_logical_fp;

public class FactorialOfSeven {
	public static void main(String[] args) {
		
		int n=7;
		int fact=1;
		
		for(int i=1; i<=n; i++) {
			fact= fact *i;
		}
		System.out.println("Factorial of 1 X 2 X 3 X 4 X 5 X 6 X 7 = "+fact);
	}

}
