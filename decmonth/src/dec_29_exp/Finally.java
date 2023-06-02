package dec_29_exp;

public class Finally {
	public static void main(String[] args) {
		
		 try {
			 System.out.println("1. try start");
			 int a = 10 / 0;
			 System.out.println("2. try end");
		 
		 }
		 catch(Exception e) {
			 System.out.println("3. catch");
			//  System.exit(0);  // terminate code will not print finally block
	    }
		 finally {
			 System.out.println("file closed");
		 }
			 
		 
}

}
