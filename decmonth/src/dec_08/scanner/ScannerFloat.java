package dec_08.scanner;

import java.util.Scanner;

public class ScannerFloat {
	public static void main(String[] args) {
		
		Scanner sf= new Scanner(System.in);
		System.out.println("Enter the Float Values >>");
		float a=sf.nextFloat();
		float b=sf.nextFloat();
		System.out.println("Perform the Action >>>  \n1.Add \n2.Substract \n3.Multiply \n4.Divide");

		int choice = sf.nextInt();
	
		switch(choice) {
		case 1:
			System.out.println(a+b+"= is the sum");
			break;
		case 2:
			System.out.println(a-b+"= is the substraction");
			break;
		case 3:
			System.out.println(a*b+"= is the multiplication");
			break;
		case 4:
			System.out.println(a/b+"= is the division");
			break;
			default:
				System.out.println("out of range");
		}
	}

}
