package dec_22_arrayhw;

import java.util.Scanner;

public class GenerateEmployee {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Please Enter the Employee Details");
		
		Employee[] ee = new Employee [3];
		for (int i = 0; i < ee.length; i++) {
		ee[i] = new Employee (sc.nextInt(), sc.next(), sc.nextDouble());
		 
		System.out.println(ee[i]);
	
		}
		
	}
	 
}
