package logical;

public class PrimeArray {

	public static void main(String[] args) {

		int a[] = { 3, 4, 5, 6, 7, 11, 31 };

		for (int i = 0; i < a.length; i++) {
			int n = a[i];

			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				if (n % j == 0)
					cnt++;
			}
			if (cnt == 2) {
				System.out.println(n + " prime no in array");
			}
		}
	}
}