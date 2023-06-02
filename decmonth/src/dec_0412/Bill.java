package dec_0412;

public class Bill {
	Order calBill(Medicine m1, Medicine m2, Medicine m3) {
		Order o= new Order();
		o.bill_no= 87;
		o.name= m1.name+", "+m2.name+", "+m3.name;
		o.totalbill= m1.price+m2.price+m3.price;
		o.discount="14%";
		o.finalbill= o.totalbill - (o.totalbill/100)*14;
		
		return o;
	}
	

}
