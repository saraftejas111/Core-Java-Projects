package dec_07;

public class TestBank {
	
	public static void main(String[] args) {
		
		Bank b1= new Bank();
		b1.acc= 2233;
		b1.name= "Rahul Ganesh Patil";
		b1.add= "Warje, Pune";
		b1.amount= 5000.00f;
		b1.display();
		
		Bank b2= new Bank(1144, "Raj Sonar", "Mumbai", 10000.00f);
		b2.display();
		
		Bank b3= new Bank(5599, "Neha Gite", "Nasik", 3000.00f);
		b3.display();
		
	}

}
