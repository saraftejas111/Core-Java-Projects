package dec_21_array;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
	
      
	Scanner sc= new Scanner (System.in);
	
	   int a[] = new int[3];
	   
	   System.out.println("Enter >>");
	   
	   for (int i=0; i < a.length; i++) {
		   a[i] = sc.nextInt();
	   }
	System.out.println("Print >>");
	
	for (int i =0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}