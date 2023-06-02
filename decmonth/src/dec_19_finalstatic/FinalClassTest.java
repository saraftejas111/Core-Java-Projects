package dec_19_finalstatic;

public class FinalClassTest extends FinalClassDemo {
	
	// Here compile time error because final class cannot be extended
	
	public static void main(String[] args) {
	
		FinalClassDemo finalClass = new FinalClassDemo();
		
		finalClass.Show();
	}

}
