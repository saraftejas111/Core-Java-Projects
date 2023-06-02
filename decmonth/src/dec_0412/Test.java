package dec_0412;

public class Test {
	public static void main(String[] args) {
		 Medicine m1= new Medicine();
		 m1.id=13; m1.name="Paracetamol"; m1.price=250;
		 Medicine m2= new Medicine();
		 m2.id=17; m2.name="Pan-D"; m2.price=127;
		 Medicine m3= new Medicine();
		 m3.id=32; m3.name="Vicks"; m3.price=164;
		 
		 Bill bill= new Bill();
		 Order t=bill.calBill(m1, m2, m3);
		 System.out.println(t.bill_no);
		 System.out.println(t.name);
		 System.out.println(t.totalbill);
		 System.out.println(t.discount);
		 System.out.println(t.finalbill);
	}

}
