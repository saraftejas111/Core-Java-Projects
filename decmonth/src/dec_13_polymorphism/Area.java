package dec_13_polymorphism;

public class Area {
	public static void main(String[] args) {
		
	Shape s= new Square();
	s.area(4.5);
	
	Shape r=new Rectangle();
	r.area2(12, 16);
	
	Shape c= new Circle();
	c.area(4);
	
	Shape t=new Triangle();
	t.area2(4.5, 8.3);
	
	
	
	
}	
}