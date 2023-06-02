package logical;

public class SwitchCase {
	public static void main(String[] args) {
		int a = 3;
		String s = switch (a) {
		case 1, 2, 3 -> "working";

		case 4, 5 -> "home";

		default -> "Invalid";
		};
	System.out.println(s);
	}
}
