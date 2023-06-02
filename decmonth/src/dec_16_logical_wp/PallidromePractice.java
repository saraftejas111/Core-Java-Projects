package dec_16_logical_wp;

public class PallidromePractice {
	public static void main(String[] args) {
		int a = 1234321;
		int num = a;
		int rev = 0;
		
		while (a>0) {
			int r = a % 10;
			a = a/10;
			rev = rev * 10 + r;
		}
		if (num == rev) {
			System.out.println(num+" is Pallidrome");
		}else {
				System.out.println(num+" is not Pallidrome");
		}
		
	}

}
