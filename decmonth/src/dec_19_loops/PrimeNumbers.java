package dec_19_loops;

public class PrimeNumbers {
	public static void main(String[] args) {

		int n = 13;
		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				cnt++;
		}
		if (cnt == 2)
			System.out.println(n + " is Prime Number");
		else
			System.out.println(n + " is Not a Prime Number");
	
	}
}
