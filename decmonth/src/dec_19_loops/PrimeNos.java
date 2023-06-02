package dec_19_loops;

public class PrimeNos {
	public static void main(String[] args) {
		int n=100, n2= 1;
		 while (n2 <= n) {
	      int cnt = 0;
		for (int i = 1; i <= n2; i++) { 
			if (n2 % i == 0)
				cnt++;
		}
			 if (cnt == 2) {
				 System.out.print(n2+", ");
			 } 
	          n2++;
	}

	
	}
}
