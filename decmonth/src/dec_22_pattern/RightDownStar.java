package dec_22_pattern;

public class RightDownStar {
	
	public static void main(String[] args) {
		
		for (int i = 7 ; i >= 1 ; i--){
			for (int j  = 7; j >i ; j-- ) {
				
				System.out.print("   ");
			}
				for (int k = 1 ; k <= i ; k++) {
				
				System.out.print(" * ");
				}
				System.out.println("  ");
			}
		 
			
				
		}
	}


