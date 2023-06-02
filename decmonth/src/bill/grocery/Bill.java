package bill.grocery;

public class Bill {
	
	Order calBill(Grocery g1, Grocery g2, Grocery g3) {
		
		Order o= new Order();
		o.billno= 101;
		o.items= g1.name+"="+g1.price+"\n"+g2.name+"="+g2.price+"\n"+g3.name+"="+g3.price;
		o.total= g1.price+g2.price+g3.price;
		o.discount= "14%";
		o.final_bill= o.total-(o.total/100)*14;
		
		return o;
		
	}
     

}
