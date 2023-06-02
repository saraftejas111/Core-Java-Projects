package dec_16_logical_fp;

public class SumOfOddNos {
	public static void main(String[] args) {
		
		int n=100; 
		int sum=0;
		for (int i = 1; i<=n; i+=2) {
			if(i % 2 !=0)
				sum= sum + i;
		}
				System.out.println(sum);
			
		}
	

}
