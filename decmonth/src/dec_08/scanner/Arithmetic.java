package dec_08.scanner;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		
		
		Scanner ss= new Scanner(System.in);
		System.out.println("Enter the Values >>>  ");
		double a=ss.nextInt();
		double b=ss.nextInt();
		System.out.println("Perform the Action >>>  \n1.Add \n2.Substract \n3.Multiply \n4.Divide");

		int choice = ss.nextInt();
		
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
	


