package dec_23_2DArray;

public class SumOfRegion4578 {
	public static void main(String[] args) {

	int a[][] = { 
			{ 1, 2, 3 },  // 
			{ 4, 5, 6 },  // 4 5
			{ 7, 8, 9 }   // 7 8
			};
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			if (i >= 1 && j <=1)
				sum = sum + a[i][j];
       }
		
	}
	  System.out.println(sum); // 24  

}

}
