package dec_26_string_practice;

public class Compare {
	public static void main(String[] args) {
		String s1 = "AAAAAAAAAAA"; // ASCII value 65
	
		String s2 = "TTTTTTTTT";  // ASCII value 84
		
		int k = s1.compareTo(s2);
		
		System.out.println(k);     // 65 - 84 = -19
		
	
	}
}
