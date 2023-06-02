package dec_16_logical_wp;

public class A {
	public static void main(String[] args) {
		int n = 151;
		int num = n;
		int rev = 0;
		
		while (n > 0 ) {
			int r = n % 10; // 1 
			n = n/10 ;
			rev = rev * 10 + r;
		}
		if (num == rev) {
			System.out.println(num+" is Pallidrome");
		}else {
				System.out.println(num+" is not Pallidrome");
		}
	}

}
