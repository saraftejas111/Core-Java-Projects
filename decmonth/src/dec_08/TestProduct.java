package dec_08;

public class TestProduct {
	public static void main(String[] args) {
		 
		// for the constructor we created
		
		Product p1= new Product (12, "Notebook", 5, 13);
		p1.display();
		p1.Calculate();
		
		// for default constructor
		
		 Product p2= new Product();
		 p2.pid= 23;
		 p2.pname= "Pen";
		 p2.qty= 10;
		 p2.cost= 30;
		 p2.display();
		 p2.Calculate();
	}

}
// find week days hw