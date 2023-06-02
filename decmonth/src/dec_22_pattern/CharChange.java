package dec_22_pattern;

public class CharChange {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 6; j++) {

				if (j <= 2)
					System.out.print(i + " ");
				else if (j <= 4)
					System.out.print("* ");
				else
					System.out.print("@ ");
		}
		System.out.println();
	}
	}
}
