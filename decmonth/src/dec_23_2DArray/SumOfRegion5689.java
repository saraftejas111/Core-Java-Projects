package dec_23_2DArray;

public class SumOfRegion5689 {
	public static void main(String[] args) {

		int a[][] = { 
				{ 1, 2, 3 },  // 
				{ 4, 5, 6 },  // 5 6
				{ 7, 8, 9 }   // 8 9
				};
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i >= 1 && j >= 1)
					sum = sum + a[i][j];
           }
			
		}
		  System.out.println(sum); // 28

	}

}
