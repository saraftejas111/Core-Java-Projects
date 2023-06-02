package dec_03;

public class Test {
      
	public static void main(String[] args) {
		
		Grocery g1= new Grocery();
		g1.id=23; g1.name="sugar"; g1.price=40;
		Grocery g2= new Grocery();
		g2.id=12; g2.name="Safola oil"; g2.price=200;
		Grocery g3= new Grocery();
		g3.id=47; g3.name="Red label tea"; g3.price=295;
		
		Bill bill= new Bill();
		Order t=bill.calBill(g1, g2, g3);
		
		System.out.println(t.id);
		System.out.println(t.items);
		System.out.println(t.total);
		System.out.println(t.discount);
		System.out.println(t.finalbill);
		
		
	}
}
