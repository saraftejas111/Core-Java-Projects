package com.rivision;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE DESIRED ALPHABET bet a to e");
		char f= sc.next().charAt(0);
		
		switch (f) {
		case 'a':
			System.out.println("<<**hello world**>>");
			break;
		case 'b':
			System.out.println("you are most welcome...");
			break;
		case 'c':
			System.out.println("hows you  doing??..");
			break;
		case 'd':
			System.out.println("you will learn java very easily..");
			break;
		case 'e':
			System.out.println("hope you are learning Scanner & switch..");
			break;
			default:
				System.out.println("You are out of range.. \nPlease try again");
			
		
		
	}
	}
}
