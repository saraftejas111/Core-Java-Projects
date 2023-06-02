package dec_16_logical.whileloop;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int n=125;
		int sum=0;
		while(n > 0) {
			int r= n % 10;          //5 >> 2 >> 1
			n= n / 10;             //12 >> 1 >> 0
			sum= sum + r;         // 0+5= 5+2+1===8
		}
		System.out.println(sum);
		}

	

}
