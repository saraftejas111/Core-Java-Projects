package dec_16_logical.forloop;

public class SumEven {
	public static void main(String[] args) {
		
		
		int n=50;
		int sum=0;
		for (int i=2; i <= n; i++) {
			if(i % 2 == 0)
			sum=sum + i;
		}
			System.out.println(sum);
		}	
		

	
}
