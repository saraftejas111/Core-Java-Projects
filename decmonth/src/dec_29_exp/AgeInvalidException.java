package dec_29_exp;

public class AgeInvalidException extends Exception {

	int age;
	String msg = "Age should not be less than 0";

	public AgeInvalidException() {
		System.out.println("AgeInvalidException raised >>");
	}

	public AgeInvalidException(int age) {
		this.age = age;
		System.out.println("AgeInvalidException raised >>");
	}

	@Override
	public String toString() {
		return "AgeInvalidException [age=" + age + ", msg=" + msg + "]";
	}

}
