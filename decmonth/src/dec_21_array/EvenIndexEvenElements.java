package dec_21_array;

public class EvenIndexEvenElements {

	public static void main(String[] args) {
		
		int a[]= {30, 35, 45, 70, 8, 2};
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && i % 2 == 0)
			System.out.println(a[i]);
		}
      
       

	}

}
