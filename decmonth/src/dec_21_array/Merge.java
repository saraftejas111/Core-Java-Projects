package dec_21_array;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int a [] = {10, 20, 30};
		int b [] = {101, 201, 301};
		int merge []= new int [a.length+b.length];
		
		for (int i = 0; i < a.length; i++) {
			merge[i]= a[i];
			
		}
		for (int i = 0; i < b.length; i++) {
			merge[i + a.length]= b[i];
			
		}
		System.out.println(Arrays.toString(merge));
	}

}
