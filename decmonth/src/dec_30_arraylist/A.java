package dec_30_arraylist;

public class A {
	public static void main(String[] args) {
		
		int a [] = new int [10];
		
		a [0] = 11;
		a [1] = 12;
		a [2] = 13;
		a [3] = 14;  // if not used full index, memory wastage
		a[11] = 333; // cannot add beyond index
		
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

}
