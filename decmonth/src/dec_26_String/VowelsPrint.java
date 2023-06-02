package dec_26_String;

public class VowelsPrint {
	public static void main(String[] args) {

		String ss = "The Man is Standing Outside";
		ss = ss.toLowerCase(); // this we use when the vowels is sometime in uppercase cant be missed

		System.out.println("Vowels present in the sentence");

		for (int j = 0; j < ss.length(); j++) {

			if (ss.charAt(j) == 'a' || ss.charAt(j) == 'e' || ss.charAt(j) == 'i' || ss.charAt(j) == 'o'
					|| ss.charAt(j) == 'u') {

				System.out.print(ss.charAt(j)+"-at-" +j+ "   ");

			}

		}

	}
}
