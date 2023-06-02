package dec_07;

public class TestCustomer {
	public static void main(String[] args) {
		
		Customer c1= new Customer();
		c1.id= 45;
		c1.name= "Rohit Sharma";
		c1.items= "Cricket Kit";
		c1.price= 42000.00;
		c1.display();
		
		Customer c2= new Customer(18, "Virat Kohli", "Puma Shoes", 56000.00);
		c2.display();
		
		Customer c3= new Customer(07, "Mahendra Singh Dhoni", "Royal Enfield 350", 180000);
		c3.display();
		
	}

}