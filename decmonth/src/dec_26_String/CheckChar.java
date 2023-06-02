package dec_26_String;

public class CheckChar {
	public static void main(String[] args) {

		String ss = "hii aAzZ%V*&00765@HELLO";

		for (int i = 0; i < ss.length(); i++) {
			char c = ss.charAt(i);

			if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
				System.out.println("Alphabet = " + c + " ");
			} else if (c >= '0' && c <= '9') {
				System.out.println("Digit = " + c + " ");
			} else {
				System.out.println("Symbol = " + c + " ");
			}
		}
	}
}
