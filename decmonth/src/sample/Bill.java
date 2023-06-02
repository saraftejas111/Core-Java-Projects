package sample;

public class Bill {

	Order calBill(Product p1,Product p2,Product p3) {
		Order o = new Order();
		o.id = 4;
		o.items = p1.name+" "+p2.name+" "+p3.name;
		o.total = p1.price + p2.price+p3.price;
		o.discount = 10;
		o.finalbill = o.total -  (o.total/100)*10;
		return o;
	}
	

}
