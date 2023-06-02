package dec_26_string_practice;

public class CheckVowels {
	public static void main(String[] args) {
		
		String ss = "beautifool";
		ss = ss.toLowerCase();
		
		for (int i = 0 ; i < ss.length(); i ++) {
			
			int cc = ss.charAt(i);
			
			if (cc == 'a' || cc== 'e'|| cc=='i'||cc=='o'||cc=='u') {
				System.out.println("Vowels present in String  >> "+ss.charAt(i)+" ");
				
			}
			
		}
		
	}
}
