package dec_16_logical_fp;

public class RemainderOfThirtyTwo {
	public static void main(String[] args) {
		
		int n=32;
		for(int i=1; i<=n; i++) {
			if (n % i == 0)
				System.out.println(i);
			
		}
	}

}