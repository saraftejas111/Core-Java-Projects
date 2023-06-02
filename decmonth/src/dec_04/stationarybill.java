package dec_04;

public class stationarybill {
    Order calBill(Stationary s1, Stationary s2, Stationary s3) {
		
	Order o= new Order();
	o.id=45;
	o.name= "Scale  Books  Eraser";
	o.total= s1.price+s2.price+s3.price;
	o.discont= "18%";
	o.finalbill= o.total - (o.total/100)*18;
	
	return o;
	}
	
	

}
