package dec_07;

public class TestGrocery {
	public static void main(String[] args) {
		
		Grocery g1= new Grocery();
		g1.id=23;
		g1.name= "Rina";
		g1.items= "sugar, oil, tea";
		g1.bill= 365.0f;
		g1.display();
		
		Grocery g2= new Grocery(24, "Sima", "soap, cream, powder", 245.76f);
		g2.display();
		
		Grocery g3= new Grocery(42, "Akash", "Gel, Face Wash, Serum", 498.12f);
		g3.display();
	}

}
