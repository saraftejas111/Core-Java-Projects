package dec_02;

public class Player {
    String team;
	String name;
	String dob;
    int matches_played;
    int runs;
    float strike_rate;
    int jersey_no;
    
    void plyr(String t, String n, String d, int mp, int r, float sr, int jn) {
    	team=t;
    	name=n;
    	dob=d;
    	matches_played=mp;
    	runs=r;
    	strike_rate=sr;
    	jersey_no=jn;
    	
   }
    void display() {
    System.out.println("Team :"+team);
    System.out.println("Name :"+name);
    System.out.println("Born :"+dob);
    System.out.println("Matches :"+matches_played);
    System.out.println("Runs :"+runs);
    System.out.println("Strike Rate :"+strike_rate);
    System.out.println("Jersey No :"+jersey_no);
    
    }
    

}
