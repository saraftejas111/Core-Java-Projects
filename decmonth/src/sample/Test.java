package sample;

public class Test {

	public static void main(String[] args) {

		Product p1 = new Product();
		p1.id = 45;p1.name="pen";p1.price=20f;
		Product p2 = new Product();
		p2.id= 12 ;p2.name ="pencil";p2.price=10f;
		Product p3 = new Product();
		p3.id= 12 ;p3.name ="notebook";p3.price=100f;
		
		Bill bill = new Bill();
		
		Order t = bill.calBill(p1, p2, p3);
		
		System.out.println(t.id);
		System.out.println(t.items);
		System.out.println(t.total);
		System.out.println(t.discount);
		System.out.println(t.finalbill);
	}

}

