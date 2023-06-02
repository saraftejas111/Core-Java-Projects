package dec_02;

public class SteelQuantity {
	// steel quantity for slab
	int m;
	int d;
	double s;
	int dm;
	int dd;

	double steelqm(int main, int dist, double spacingm, int diam) {
		double mb = (double) ((main / spacingm) + 1);
		m = main;
		d = dist;
		s = spacingm;
		dm = diam;
		System.out.println(mb + " total no of main bars");
		return mb;
	}
	// void display(double mb) {
	// double mb1= mb*
	// System.out.println(mb1);
	// }

	double steelqd(int main, int dist, double spacingd, int diad) {
		double db = (double) ((dist / spacingd) + 1);
		d = dist;
		s = spacingd;
		dd = diad;
		System.out.println(db + " total no of Dist bars");
		return db;
	}

	double mainsq(double D, double L) {

		double distsq = (double) (D * D) * L / 162;
		System.out.println(distsq+ " KG Main Steel");
		return distsq;

	}
	
	double distsq(double D, double L) {

		double distsq = (double) (D * D) * L / 162;
		System.out.println(distsq+ " KG Dist Steel");
		return distsq;

	}

	public double finalqnb(double mainb, double distb, double mainSqBar, double distsqbar) {
	
		double steelq=mainb*mainSqBar+distb*distsqbar;
		System.out.println(steelq+" Kg Total ");
		
		return 0;
	}
	
	

}
