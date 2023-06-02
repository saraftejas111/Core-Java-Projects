package dec_23_2DArray;

public class SumOfRegionFirstFour {
	public static void main(String[] args) {

		int a[][] = { 
				{ 1, 2, 3 },   // 1 2
				{ 4, 5, 6 },   // 4 5
				{ 7, 8, 9 } 
				};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i <=1 && j<=1)
					sum = sum + a[i][j];
           }
			
		}
		  System.out.println(sum);

	}

}



