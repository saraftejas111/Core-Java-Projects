package dec_23_2DArray;

public class OnlyPrintEven {
	public static void main(String[] args) {
		
		
		
		int a [][] =  {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		 };
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if (a[i][j] % 2 == 0) 
				
					System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
