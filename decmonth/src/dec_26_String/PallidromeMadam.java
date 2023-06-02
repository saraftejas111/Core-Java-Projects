
package dec_26_String;

public class PallidromeMadam {
	
	public static void main(String[] args) {
		
		String a = "MADAM";
	   
		String rev = "";
		for (int i = 0 ; i < a.length(); i++) {
           rev = a.charAt(i) + rev;
           
		}
		if (a.equals(rev)) {
			System.out.println("Pallindrome = "+a);
		}
		else {
			System.out.println("NOT Pallindrome = "+a);
		}
	       System.out.println("====================");
	}

}
