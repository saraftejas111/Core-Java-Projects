package dec_21_array;

public class SquareOfElements {
	public static void main(String[] args) {
		
		int a []= {3, 5, 4, 7, 8, 2};
		int sqr = a[0];
		
		for (int i =0; i < a.length; i++) {
			
			sqr = a[i] * a[i];
			System.out.println(sqr);
		}
		
	}

}
