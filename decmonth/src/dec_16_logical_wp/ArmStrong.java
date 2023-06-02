package dec_16_logical_wp;

public class ArmStrong {
	public static void main(String[] args) {
		
		int n = 1604 ; 
		
		int num = n, sum = 0 , cnt = 0 , temp = n; 
		
		while (temp > 0 ) {
			temp = temp / 10 ; 
			cnt ++ ;
		}
		while (n > 0 ) {
			int r = n % 10 ;
			n = n / 10 ; 
			sum = (int) (sum + Math.pow(r, cnt));
		}
		if (num == sum ) {
			System.out.println(num+" is Armstrong num");
		}else{
			System.out.println(num+" is not Armstrong num");
		}
		
	}

}
