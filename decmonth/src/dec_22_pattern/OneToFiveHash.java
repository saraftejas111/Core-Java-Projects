package dec_22_pattern;

public class OneToFiveHash {

	public static void main(String[] args) {
		
		int n = 5;    // number of rows in the pattern
		
		for (int i = 1; i <= n; i++) {
		
			for (int j = 1; j <= i; j++) {
			
				System.out.print(j+" ");
			
			}
			
			for (int k = 1; k <= n - i; k++) {
			
				System.out.print("# ");
			
			}
			
			System.out.println();
		}
	}
}
