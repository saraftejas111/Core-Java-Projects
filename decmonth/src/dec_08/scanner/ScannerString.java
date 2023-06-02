package dec_08.scanner;

import java.util.Scanner;

public class ScannerString {
	public static void main(String[] args) {
        
		 Scanner sc= new Scanner(System.in);
		 System.out.println("<<**Welcome to Shree Developers**>>\n\n");
	     System.out.println("Please help us by selecting your preference\nLocation\n\n1} Hinjewadi phase 3\n2} Wakad\n3} Baner");
	      int a=sc.nextInt();
	    
	    Scanner ss = new Scanner(System.in);
		
		System.out.println("Please help us by selecting your preference.\nWhat are you Looking for??\n\nA} 1BHK\nB} 2BHK\nC} 3BHK");
		String s= ss.next();

		switch (s) {
		case "A":
			System.out.println("450 sqft area, 1 bed , 1 hall, 1 kitchen and balcony\nwith gorgeous view\n\nfor more updates and site visit\nContact: 8329550895");
			break;
		case "B":
			System.out.println("610 sqft area, 1 hall, 1 kitchen and 2 bedrooms\n(1 master) with balcony which is \nhaving superb view and will make you feel alive\n\nfor more updates and site visit\nContact: 8329550895");
            break;
		case "C":
			System.out.println("720 sqft area, 1 hall, 1 kitchen and 3 bedrooms\n(2 masters) with balcony which is \nhaving superb view and will make you feel alive\n\nfor more updates and site visit\nContact: 8329550895");
		}
}	
}    
