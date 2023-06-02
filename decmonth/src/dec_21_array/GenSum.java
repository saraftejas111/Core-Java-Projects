package dec_21_array;

import java.util.Scanner;

public class GenSum {
	
	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner (System.in);
		int a[] = new int [7];
		
		System.out.println("enter any 7 elements");
		for (int i =0 ; i < a.length; i++) {
			
			a [i]= sc.nextInt();
			
		}
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			
		}
		System.out.println(sum);
	}

}
