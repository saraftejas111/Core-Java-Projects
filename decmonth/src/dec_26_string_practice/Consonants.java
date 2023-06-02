package dec_26_string_practice;

public class Consonants {
	public static void main(String[] args) {
		
	
	
	String s = "computer applications";
	
	char ch;
	
	for (int i = 0 ; i < s.length(); i ++) {
		
		ch = s.toUpperCase().charAt(i);
		
		if(ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' &&ch != 'U') {
			System.out.print(s.charAt(i));
		}
		
	}

  }
}
