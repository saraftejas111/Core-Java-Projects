package dec_19_loops;

public class FibonacciClass {
	public static void main(String[] args) {
		
		int n=9;
	    int n1=0, n2=1, n3=0;
	    
	    for (int i=0; i<=n; i++) {
	    	
	    	System.out.println(n1+" ");
	    	n3= n2 + n1;
	    	n1=n2;
	    	n2=n3;
	    	
	    }
	}

}
