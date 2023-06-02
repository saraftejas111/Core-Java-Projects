package dec_16_logical.forloop;

public class PrimeCheck {

	public static void main(String[] args) {
		
		int n=8;
		int cnt=0;
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0)   // here when 31 divide 31 rem = 0 ; ans is 1
				cnt ++;      // 1 + 1 = 2
		}
		if (cnt == 2)     // when condn satisfies cnt==2, will print prime or will print else 
			
			System.out.println(n+" is Prime Number");
		else
			System.out.println(n+" is Not Prime Number");

	}

}
