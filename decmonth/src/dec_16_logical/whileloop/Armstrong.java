package dec_16_logical.whileloop;

public class Armstrong {
	public static void main(String[] args) {

		int n = 153;

		int num = n, sum = 0;

		int cnt = 0, temp = n;

		while (temp > 0) {
			temp = temp / 10;
			cnt++;
		}

		while (n > 0) {

			int r = n % 10; // 4 >> 7 >> 4 >> 9

			n = n / 10; // 974 >> 94 >> 9 >> 0

			sum = (int) (sum + Math.pow(r, cnt));

		}
		if (num == sum)
			System.out.println(num + " is Armstrong Number");
		else
			System.out.println(num + " is Not Armstrong Number");
	}

}
