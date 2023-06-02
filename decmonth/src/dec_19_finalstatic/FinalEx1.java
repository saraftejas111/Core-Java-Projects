package dec_19_finalstatic;

public class FinalEx1 {
	
	FinalEx1() {
		System.out.println("This is a default constructer of FinalEx2");
		}
		final int a = 100;
		// this method we can not override
		void show() {
		System.out.println(a);
		}
		void welcome() {
		System.out.println("Welcome to java by kiran,Pune");
		}
		
	

       /* public class FinalExTest extends FinalEx1 {
		// compile time error because method cannot override
		void show () {
		System.out.println("This is method of FinalExTest");
		}
		public static void main(String[] args) {
		FinalEx1 finalEx1 = new FinalEx1();
		finalEx1.show();
		}*/

}
