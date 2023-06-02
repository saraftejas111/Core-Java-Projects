package dec14_abstraction;

public class TestAllShapes {

	void runshapes(Shape s) {
		
		s.drawShape();
		s.fillShape();
		s.m1();
		s.m2();
	}

	public static void main(String[] args) {

		TestAllShapes tc1 = new TestAllShapes();
		Circle c1 = new Circle();
		c1.r=4;
		c1.calArea();
		tc1.runshapes(c1);

		System.out.println("=====================");

		TestAllShapes ts1 = new TestAllShapes();
		Shape s1 = new Square();
		s1.a=5;
		s1.calArea();
		ts1.runshapes(s1);

		System.out.println("=====================");

		TestAllShapes tr1 = new TestAllShapes();
		Shape r1 = new Rectangle();
		r1.a=6;
		r1.b=7;
		r1.calArea();
		tr1.runshapes(r1);

	}

}
