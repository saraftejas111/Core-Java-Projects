package primenumbers;

public class PrimeOnetoHundred {
	public static void main(String[] args) {
	
	
	
	for (int i=1; i<=100; i++) {
		
		int n = i;
		int cnt =0;
		for (int k=1; k<=n; k++) {
		if (n % k ==0) {
			cnt++;
			}
		}
		if (cnt == 2)
		System.out.println(n+" is prime nos");
		}
	}
}
