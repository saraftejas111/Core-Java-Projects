package dec14_abstraction;

public class Circle extends Shape {

	void calArea() {
		System.out.println("Area of Circle  >>" +((Math.PI)*super.r*super.r));
	}

	void drawShape() {
		System.out.println("Circle is drawing  >>");
	}

	void fillShape() {
		System.out.println("Circle is filled  >>");
	}

	void m1() {
		System.out.println("Circle is ----m1");

	}

	void m2() {
		System.out.println("Circle is ----m2");
	}
}
