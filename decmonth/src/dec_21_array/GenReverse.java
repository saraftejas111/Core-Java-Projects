package dec_21_array;

public class GenReverse {
	public static void main(String[] args) {
		
		int a[]= {11, 22, 33, 44, 55, 66, 77, 88};
		int rev[]= new int [a.length];
		
		
		for (int i= a.length-1, k=0; i >=0; i--, k++) {
		 rev[k] = a[i];
			
		}
		for (int i=0; i<rev.length; i++) {
			System.out.println(rev[i]+" "+a[i]);
			
		}
	}

}
