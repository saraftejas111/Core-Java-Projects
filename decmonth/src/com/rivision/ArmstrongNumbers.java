package com.rivision;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		
		int a = 153 ;
		int num = a;
		int sum = 0;
		
		while (a > 0) {
			int t = a % 10;
			a = a / 10;
			sum = sum + t * t * t;
			
		}
		if (sum == num) {
			System.out.println(num+" num is Armstrong ");
		}
		else {
			System.out.println(num+" num is not Armstrong ");
		}
		
			
		
		
		
			
		

	}

}
