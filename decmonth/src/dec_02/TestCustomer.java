package dec_02;

public class TestCustomer {
	public static void main(String[] args) {
		
		Customer c1= new Customer ();
		
		c1.cstmr(07, "Mahendra Singh Dhoni", "Ranchi,Bihar", 834001);
		c1.display();
		System.out.println();
		
		Customer c2= new Customer();
		c2.cstmr(2, "Ratan Tata", "Coloba, Mumbai", 400005);
		c2.display();
		System.out.println();
		
		
		Customer c3= new Customer();
		c3.cstmr(3, "Gautam Adani", "Gurgaon, Delhi", 110038);
		c3.display();
		
	}

}
