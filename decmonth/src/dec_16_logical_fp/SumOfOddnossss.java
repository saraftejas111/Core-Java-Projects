package dec_16_logical_fp;

public class SumOfOddnossss {

	public static void main(String[] args) {

		int n = 100;

		int sum = 0;

		for (int i = 0; i <= n; i++) {

			if (i % 2 != 0)

				sum = sum + i;

		}
		System.out.println(sum);

	}

}
