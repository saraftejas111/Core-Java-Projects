package dec_16_logical.forloop;

public class EvenNo {
	public static void main(String[] args) {
		
		int n=50;
		for (int i=2; i <= n; i+=2) {
			System.out.println(i);
		}	
		System.out.println("===================");
	
		for(int i=2; i <= n; i++) {
			if (i%2==0)
			System.out.println(i);
			
		}
	}

}
