package dec_22_pattern;

public class AlphaINDIA {

	public static void main(String[] args) {

		String s = "INDIA";

		for (int i = 0; i < s.length(); i++) {

			System.out.println(s.substring(0, i + 1));
		}
	}
}