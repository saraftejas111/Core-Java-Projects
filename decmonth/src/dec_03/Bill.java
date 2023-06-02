package dec_03;

public class Bill {
	
	Order calBill(Grocery g1, Grocery g2, Grocery g3) {
		
		Order o= new Order();
		o.id=87;
		o.items= g1.name+", "+g2.name+", "+g3.name;
		o.total= g1.price+g2.price+g3.price;
		o.discount= "10%";
		o.finalbill= o.total - (o.total/100)*10;
		return o;
	
	
		
	}

}
//23,12,47 40,200,295