package dec14_abstraction;

public class Square extends Shape {

	void calArea() {
		System.out.println("Area of Square  >>"+super.a*super.a);
	}

	void drawShape() {
		System.out.println("Square is drawing  >>");
	}

	void fillShape() {
		System.out.println("Square is filled  >>");
	}

	void m1() {
		System.out.println("Square is ----m1");

	}

	void m2() {
		System.out.println("Square is ----m2");
	}

}
