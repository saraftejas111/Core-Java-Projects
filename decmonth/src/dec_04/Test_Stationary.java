package dec_04;

public class Test_Stationary {
	public static void main(String[] args) {
		
		Stationary s1= new Stationary();
		s1.id=23; s1.name="Scale"; s1.price=20;
		Stationary s2= new Stationary();
		s2.id=12; s2.name="Books"; s2.price=160;
		Stationary s3= new Stationary();
		s3.id=34; s3.name="Eraser"; s3.price=20;
		
		stationarybill bill= new stationarybill();
		
		Order t= bill.calBill(s1, s2, s3);
		System.out.println(t.id);
		System.out.println(t.name);
		System.out.println(t.total);
		System.out.println(t.discont);
		System.out.println(t.finalbill);
   
	}
}
