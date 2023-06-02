package dec_30_arraylist;

import java.util.ArrayList;

public class A2 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList ();
		
		
		System.out.println("11 --> al.size "+ al.size());
		
		al.add(10);
		al.add(12);  // Integer type of data
		al.add("Raj");
		al.add(true);
		al.add('@');
		al.add(7.7);
		System.out.println("19 --> al.size "+ al.size());
		al.add(12);
		al.add("Raj");
		System.out.println("22 --> al.size "+ al.size());
		
		System.out.println("\nSimple For Loop");
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	       System.out.println("=============\nEnhance For Loop");
	   for (Object t : al ) {
		   System.out.println(t);
	   }
}
}
