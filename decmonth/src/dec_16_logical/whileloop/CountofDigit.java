package dec_16_logical.whileloop;

public class CountofDigit {
	public static void main(String[] args) {
		
		int n=12345;
		int cnt=0;
		while(n > 0) {
			n= n / 10;
			cnt++;
			
	}
		System.out.println(cnt);
	}

}
