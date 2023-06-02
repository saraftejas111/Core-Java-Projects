package dec_02;

public class TestSteelQuantity {

	// Steel quantity for Slab

	public static void main(String[] args) {
		double Dm = 10, Dd = 8;
		int l1 = 6, l2 = 15;
		SteelQuantity s1 = new SteelQuantity();
		double mainb = s1.steelqm(15, l1, .150d, 10);

		System.out.println();
		double distb = s1.steelqd(15, l1, .150d, 8);
		System.out.println();

		double mainSqBar = s1.mainsq(Dm, l1);

		System.out.println();

		double distsqbar = s1.distsq(Dd, l2);
		System.out.println();
		
		
		
		
		
		
		

		System.out.println();
		double finalQm = s1.finalqnb(mainb, distb, mainSqBar, distsqbar);

	}

}
