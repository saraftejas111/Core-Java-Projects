package dec_16_logical_wp;

public class Pllll {
	public static void main(String[] args) {
		
		int n = 987656789;
		int num =n; 
		int rev=0;
		
		while (n > 0) {
			int r = n % 10;
			n = n/10;
			rev = rev * 10 + r ;
			
		}
		if (num == rev ) {
			System.out.println(num+"  is Pallindrome num");
		}else{
			System.out.println(num+"  is not Pallindrome num");
		}
	}

}
