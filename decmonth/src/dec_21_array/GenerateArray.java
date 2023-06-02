package dec_21_array;

public class GenerateArray {
	public static void main(String[] args) {
		
	
	
	int a [] = {2, 3, 4};
	int b [] = new int [a.length];
	
	for (int i = 0; i < a.length ; i++ ) {
		b [i] = a[i]* a[i];
	}
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}

}
}