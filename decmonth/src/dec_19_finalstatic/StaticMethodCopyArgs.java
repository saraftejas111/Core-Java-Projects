package dec_19_finalstatic;

public class StaticMethodCopyArgs {
	public static void copyVariables(String str1, String str2) {
		
		str2= str1;
		
		System.out.println("First String arg is = "+str1);
		System.out.println("Second String arg is = "+str2);
	}
	public static void main(String[] args) {
		StaticMethodCopyArgs.copyVariables("PQR", "DEF");
		copyVariables("XYZ", "ABC");
	}

}
