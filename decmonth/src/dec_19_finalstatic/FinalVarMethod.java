package dec_19_finalstatic;

public class FinalVarMethod {
	final int a=10;
	
	final void JBK() {
		
		for (int i = 0 ; i < 5 ; i++) {
			
			// compile time error final variable value can't be change..
			
			System.out.println("value of I+"+i);
		}
	}
	public static void main(String[] args) {
		FinalVarMethod finalEx = new FinalVarMethod ();
		finalEx.JBK();
		
		
	}

}
