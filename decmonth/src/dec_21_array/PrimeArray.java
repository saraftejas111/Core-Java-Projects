package dec_21_array;

public class PrimeArray {
	public static void main(String[] args) {

		int a[] = { 13, 4, 7, 15, 19, 45, 88, 89 };

		for (int i = 0; i < a.length; i++) {
			int cnt = 0;
			int n = a[i];
			for (int j = 1; j <=n; j++) {

				if (n % j == 0) {
					cnt++;
				}

				}if (cnt == 2)
					System.out.println(a[i] + " only prime num in array");
			

		}
	}
}
