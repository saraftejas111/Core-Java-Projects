package dec_07;

public class Customer {
	
	int id;
    String name;
    String items;
    double price;
    
    Customer(){
    	
    }
    Customer (int id, String name, String items, double price){
    	this.id=id;
    	this.name=name;
    	this.items=items;
    	this.price=price;
    	
    }
    void display() {
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(items);
    	System.out.println(price+"\n");
    }
}
