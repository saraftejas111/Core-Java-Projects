package dec14_abstraction;

public class Rectangle extends Shape {

	void calArea() {
		System.out.println("Area of Rectangle  >>"+super.a*super.b);
	}

	void drawShape() {
		System.out.println("Rectangle is drawing  >>");
	}

	void fillShape() {
		System.out.println("Rectangle is filled  >>");
	}

	void m1() {
		System.out.println("Rectangle is ----m1");

	}

	void m2() {
		System.out.println("Rectangle is ----m2");
	}

}
