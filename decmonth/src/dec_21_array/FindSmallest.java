package dec_21_array;

public class FindSmallest {
	public static void main(String[] args) {
		
		int a[]= {11, 2, 4,  7, 5, 3};
		int small= a[0];
		
		for (int i=0; i < a.length; i++) {
			if(a[i] < small )
			small = a[i];
	   }
		System.out.println(small);
	}

}
