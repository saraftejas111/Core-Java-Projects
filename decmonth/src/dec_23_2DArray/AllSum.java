package dec_23_2DArray;

public class AllSum {
	public static void main(String[] args) {
		int a[][] = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
				};
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;

		System.out.print("Right Diagonal Elements are : ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i + j == 2) {
					sum1 = sum1 + a[i][j];
					System.out.print(a[i][j] + " ");

				}
			}
		}
		System.out.println("\nSum of Right Diagonal Elements is =  " + sum1);

		System.out.print("\n\nLeft Diagonal Elements are : ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					System.out.print(a[i][j] + " ");
					sum2 = sum2 + a[i][j];
				}

			}
		}
		System.out.println("\nSum of Left Diagonal Elements is =  " + sum2);

		System.out.print("\n\nUpper part elements are : ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i <= j) {
					System.out.print(a[i][j] + " ");
					sum3 = sum3 + a[i][j];
				}
			}
		}
		System.out.println("\nSum of Upper part elements is = " + sum3);

		System.out.print("\n\nLower part elements are : ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i >= j) {
					System.out.print(a[i][j] + " ");
					sum4 = sum4 + a[i][j];
				}
			}
		}
		System.out.println("\nSum of Lower part elements is = " + sum4);

	}
}
