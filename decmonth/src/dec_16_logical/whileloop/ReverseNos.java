package dec_16_logical.whileloop;

public class ReverseNos {
	public static void main(String[] args) {
		
		int n=123456;
		int rev=0;
		while(n > 0) {
			int r= n % 10;
			n = n / 10;
			rev= rev * 10 + r;
			
		}
		System.out.println(rev);
	}

}
