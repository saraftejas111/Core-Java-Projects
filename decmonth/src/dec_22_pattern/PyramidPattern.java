package dec_22_pattern;

public class PyramidPattern {
	
	public static void main(String[] args) {
		
	  int t =1;
	
	for (int i = 1; i <=5; i++) {
		
		for(int j = 1; j <= t; j++) {
			System.out.print("* ");
			
			
		}
		System.out.println();
		
		if (i<3)
		t++;
		else 
			t--;
	}
	}
}
