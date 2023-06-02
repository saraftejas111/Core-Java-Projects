package dec_30_arraylist;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist  {
	
	public static void main(String[] args) {
		
	List<Integer> al = new LinkedList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(Object t : al) {
			System.out.println(t);
		}
		
		
	}

}
