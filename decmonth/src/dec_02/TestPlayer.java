package dec_02;

public class TestPlayer {
	public static void main(String[] args) {
		
		Player p1= new Player();
		p1.plyr("India", "Virat Kohli", "Nov 05 1988", 262, 12344, 92.84f, 18);
		p1.display();
		System.out.println();
		
		Player p2= new Player();
		p2.plyr("South Africa", "AB de Villiers", "Feb 17 1984", 228, 9577, 101.1F, 17);
		p2.display();
		System.out.println();
		
		Player p3= new Player();
		p3.plyr("India", "Sachin Tendulkar", "Apr 24 1973", 463, 18426, 86.24f, 10);
		p3.display();
		System.out.println();
		
		Player p4= new Player();
		p4.plyr("India", "Virendra Sehwag", "Oct 20  1978", 251, 8273, 104.34f, 44);
		p4.display();
		System.out.println();
		
		
		
	}

}
