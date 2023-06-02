package dec_21_array;

import java.util.Scanner;

public class GenArraySumEven {
	public static void main(String[] args) {

		int sum = 0;
		int sumeven = 0;
		int sumodd = 0;
		Scanner sc = new Scanner(System.in);

		int a[] = new int[6];

		System.out.println("Enter any 6 elements>>");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		{
			System.out.println("Sum of Elements");
			System.out.println(sum);
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				sumeven = sumeven + a[i];

		}
		System.out.println("Sum of Even nos>>");
		System.out.println(sumeven);

		System.out.println("Sum of Odd nos>>");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0)
				sumodd = sumodd + a[i];

		}
		System.out.println(sumodd);
	}
}