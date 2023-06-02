package dec_22_pattern;

public class pyramid {
	public static void main(String[] args) {
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 && i == 1) {
					System.out.println("A");
				} else if (i == 2 && j == 1 ) {
					System.out.println("B C");
				}else if (i== 3 && j==1) {
					System.out.println("D E F");
					
				}else if (i== 4 && j==1) {
					System.out.println("G H I J");
					
				}else if (i== 5 && j==1) {
					System.out.println("K L M N O");
					
				}

			}

		}
		System.out.println();
	}

}
