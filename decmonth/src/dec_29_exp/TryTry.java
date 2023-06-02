package dec_29_exp;

public class TryTry {
	public static void main(String[] args) {

		try {
			System.out.println(1);
			// int b = 10/ 0; >>>> 1 , 6
			try {
				System.out.println(2);
				int a = 10 / 0;
				System.out.println(3);
			}
			catch (Exception e) {
				System.out.println(4);
			}
			    System.out.println(5);
			}
		    catch (Exception e) {
			   System.out.println(6);
	        }

}
}
