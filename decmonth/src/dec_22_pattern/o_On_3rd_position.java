package dec_22_pattern;

public class o_On_3rd_position {
	
	public static void main(String[] args) {
		
		for (int i =1 ; i <= 5 ; i++) {
			for (int j = 1 ; j <= 5 ; j++) {
				
				if(i == j) {
					System.out.print(" * ");
				}else {
					System.out.print(" - ");
				}
				
			}
			System.out.println();
		}
		System.out.println("\n\n");
		
		for (int i =1 ; i <= 5 ; i++) {
			for (int j = 1 ; j <= 5 ; j++) {
				
				if(i == j) {
					System.out.print(" o ");
				}else {
					System.out.print(" * ");
				}
				
			}
			System.out.println();
		}
		
	}

}
