package dec_22_pattern;

public class PlusSignStar {
	
	public static void main(String[] args) {
		
		for (int i=1; i<=5; i++) {
			for(int j = 1; j<=5; j++)
				
				if (i == 3 || j == 3) {
					System.out.print(" * ");
				}else{
					System.out.print("   ");
				}
			System.out.println();
			
			
		}
		System.out.println("\n\n");
		
		for (int i=1; i<=5; i++) {
			for(int j = 1; j<=5; j++)
				
				if (i == 3 || j == 3) {
					System.out.print(" * ");
				}else{
					System.out.print(" o ");
				}
			System.out.println();
			
			
		}
	}
}

