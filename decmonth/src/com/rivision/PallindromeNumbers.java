package com.rivision;

public class PallindromeNumbers {
	public static void main(String[] args) {
		
		int  n = 153;
		int num = n;
		int sum = 0;
		
		while (n>0) {
			int t = n % 10;
			n = n/10;
			sum = sum * 10 + t*t*t;
		}
			if (sum == num)
				System.out.println(num+" is Pallindrome");
			else 
				System.out.println(num+" is not Pallindrome");
		
	}

}
