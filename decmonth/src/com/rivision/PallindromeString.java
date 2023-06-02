package com.rivision;

public class PallindromeString {
	public static void main(String[] args) {
		
		String n = "NITIN";
		
		String rev = "";
		
		for (int i = 0; i < n.length(); i++) {
			rev = n.charAt(i)+ rev;
		}
		if (n.equals(rev)) {
			System.out.println(n +" is Pallindrome string");
		}else {
				System.out.println(n +" is not Pallindrome string");
		}
	}

}
