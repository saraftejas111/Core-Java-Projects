package dec_26_String;

public class PallindromeNitin {
	public static void main(String[] args) {

		String ss = "NITIN";

		String rev = "";

		for (int i = 0; i < ss.length(); i++) {
			rev = ss.charAt(i) + rev;
		}
		if (ss.equals(rev)) {
			System.out.println(ss + "  << word is Pallindrome");
		} else {
			System.out.println(ss + "  <<word is not Pallindrome");
		}
	}
}