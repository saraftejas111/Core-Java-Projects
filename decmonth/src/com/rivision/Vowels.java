package com.rivision;

public class Vowels {
        public static void main(String[] args) {
			
        	String ss = "beautifool";
        	
        	for (int i = 0; i < ss.length(); i ++) {
        	int cc = ss.charAt(i);
        	
        	if (cc == 'a' || cc == 'e' || cc=='i' || cc == 'o' || cc=='u') {
        		System.out.println("vowels prsnt in string are = "+ss.charAt(i));
        		
        	}
        	}
        	
		}
}
