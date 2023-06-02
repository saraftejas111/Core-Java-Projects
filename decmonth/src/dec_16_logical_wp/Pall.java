package dec_16_logical_wp;

public class Pall {
	
	public static void main(String[] args) {
		int b = 45674654;
		int num = b;
		int rev = 0;
		
		while (b>0) {
			int r = b % 10;
			b = b/10;
			rev = rev * 10 + r;
		}
		
		if (num == rev) {
			System.out.println(num+" is Pallidrome");
		}else {
				System.out.println(num+" is not Pallidrome");
		}
	}

}
