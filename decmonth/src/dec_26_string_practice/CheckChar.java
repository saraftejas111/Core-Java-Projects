package dec_26_string_practice;

public class CheckChar {
	public static void main(String[] args) {
		
		String ss = "hd ^%&^I@33492382HELLO";
		
		for (int i = 0; i < ss.length(); i++) {
			char cc = ss.charAt(i);
			if (cc >'a' && cc < 'z'|| cc>'A' && cc<'Z') {
				System.out.println("Alphbets = "+cc);
			}
			else if (cc >'0' && cc < '9') {
				System.out.println("Digits = "+cc);
			}
			else {
				System.out.println("symbols = "+cc);
			}
			
		}
	}

}
