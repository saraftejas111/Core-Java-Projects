package dec_28_exception;

public class BB {
	
	public static void main(String[] args) {
		
	try {
		Class.forName("dec_28_exception.A");
		System.out.println("Class is Present");
	} 
	catch (ClassNotFoundException e) {
		e.printStackTrace();
		
	}
	System.out.println("\n");
	try {
		Class.forName("dec_28_exception.AAAAA");
		System.out.println("Class is not Present");
	} 
	catch (ClassNotFoundException e) {
		e.printStackTrace();
		
	}
	}
}
		
          
