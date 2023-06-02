package dec_28_exception;

public class ExceptionIfNotOccurs {
	public static void main(String[] args) {

		int a = 10 * 5;
		{
			System.out.println("1. Gpay app = " + a);
		}

		try {
			System.out.println("2. bank app");
			int b = 20 / 2;
			System.out.println("3. connection = " + b);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("4. server"); // not printed becoz of not exception

		}

		int c = 12 + 21;
		{
			System.out.println("5. final payment c = " + c);
		}

	}

}
