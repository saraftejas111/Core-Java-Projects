package dec_16_logical.whileloop;

public class Pallidrome {
	public static void main(String[] args) {
		
		long n= 12345678987654321L;
		long num=n;
		long rev=0;
		while(n>0) {
			long r = n % 10;      //  1      >>    2        >>    3
			n = n/10;            // 1to432    >>  1to543     >>  1 to 654
			rev = rev * 10 + r; //  0*10+1=1  >>  1*10+2=12  >> 12*10+3= 123 
		}
		if (num==rev)
		System.out.println(num+" Is Pallidrome");
		else 
			System.out.println(num+" Is NOT Pallidrome");
			
		}
	

}
