package dec_21_array;

public class CharValue {
	public static void main(String[] args) {

		char a[] = { 'j', 'a', 'v', 'a' };

		for (char value : a) {
			System.out.print(value);
		}
		System.out.println("\n==================");
		
		// Alternate Method
		
		a[0] = 'j';
		a[1] = 'a';
		a[2] = 'v';
		a[3] = 'a';
		
        for (char value : a) {
        	System.out.print(value);
        }
        
	}
}