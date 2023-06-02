package dec_21_array;

public class DivisiblebyFiveAndSeven {
	
	public static void main(String[] args) {
		
		int a [] = {30, 35, 45, 70, 8, 2};
		
		for (int i =1; i < a.length; i++) {
			
			if (a[i] % 5 == 0 && a[i] % 7 == 0)
				System.out.println(a[i]);
			
			
		}
	}

}
