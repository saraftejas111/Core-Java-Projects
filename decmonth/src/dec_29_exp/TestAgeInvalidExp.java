package dec_29_exp;

public class TestAgeInvalidExp {
	public static void main(String[] args) {
		
	
	
	try {
		
		int age = -8;
		 if (age < 0)
			throw new AgeInvalidException(age);
		System.out.println(age);
	}
	catch (AgeInvalidException e) {
		e.printStackTrace();
		System.out.println(e.toString());
		
	}
}
}
