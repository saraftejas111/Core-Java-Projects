package dec_22_pattern;

import java.util.Scanner;

public class Count {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the string: ");
	        String input = sc.nextLine();
	        System.out.println("Enter the character to count: ");
	        char c = sc.next().charAt(0);
	        int count = 0;

	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) == c) {
	                count++;
	            }
	        }

	        System.out.println("The character '" + c + "' appears " + count + " times in the string.");
	    }
	}






							
