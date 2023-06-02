package dec_16_logical_wp;

public class PallindromeNumbers {
	
	public static void main(String[] args) {
		
		int a = 123454321, n = a , rev = 0 ;
		
		while (a>0) {
			int r = a % 10 ; 
			a =a /10 ;
			rev = rev * 10 + r ; 
		}
		if (n == rev) {
			System.out.println(n+" is pallindrome");
		}else {
			System.out.println(n+" is not pallindrome");
		}
	}

}
