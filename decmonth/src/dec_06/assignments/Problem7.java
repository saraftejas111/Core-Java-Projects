package dec_06.assignments;

public class Problem7 {
	double b;
	double h;
	
	void accept (double b1, double h1) {
	   b=b1;
	   h=h1;
   }
	void display() {
		double aa=(double) 1/2*(b*h);
		System.out.println(aa+" = area of Triangle");
	}

}
