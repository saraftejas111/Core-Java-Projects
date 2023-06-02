package dec_16_logical_fp;

public class PrimeNosCheck {
	public static void main(String[] args) {

		int n = 4;
		int cnt=0;

		for (int i = 1; i <= n; i++) { // prime no is only divisible by 1 or itself
		  if (n % i == 0) 
			  cnt ++;
		}
		  if (cnt == 2)
		  System.out.println(n + " is  Prime Number");
		else
			System.out.println(n + " is Not Prime Number");
	}
  
}
