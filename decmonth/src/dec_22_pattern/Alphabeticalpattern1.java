package dec_22_pattern;

public class Alphabeticalpattern1 {

	public static void main(String[] args) {

		char ch = 'A';

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(ch+" ");
				
				
			}
			System.out.println();
			ch++;
		}
		
		System.out.println("=================");
		
		char a = 'A';
		for (int s = 1; s <= 5; s++) {
			for (int d = 1; d <= s; d++) {
				System.out.print(a + " ");
				a++;
			}
			System.out.println();
		}

	}

}
