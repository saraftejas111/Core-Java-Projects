package dec_29_exp;

public class NullPointerException {
	public static void main(String[] args) {
		
		String s = "hello";
		
		System.out.println(s.toUpperCase());
		
		try {s = null;
		
		System.out.println(s.toUpperCase());
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		System.out.println("Thanks");
	}

}
