package dec_16_logical.forloop;

public class Fibonacci {

	public static void main(String[] args) {

		int n = 9;      // here we put the no for how many time we want to run loop
		int n1 = 0, n2 = 1, n3 = 0;    // for calc of fibonacci
		for (int i = 0; i < n; i++) {  // for loop calc change for n

			System.out.println(n1 + " ");
			n3 = n2 + n1;    // code for fibonacci
			n1 = n2;         // code for fibonacci
			n2 = n3;         // code for fibonacci

		}
	}

}
