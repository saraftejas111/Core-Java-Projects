package dec_28_exception;

import java.io.Console;

public class A {
	public static void main(String[] args) {
		
		
		Console cns = System.console();
		System.out.println("username");
		String usn = cns.readLine(); 
		
		
		System.out.println("password");
		char [] pwd = cns.readPassword();
		
		System.out.println("entered");
		System.out.println("user name : "+ usn);
		System.out.println("password : "+ new String (pwd));
	}

}
