package dec_28_exception;

public class ExceptionIfOccurs {
	public static void main(String[] args) {

		int a = 10 * 5;
		{
			System.out.println("1. Gpay app = " + a);
		}

		try {
			System.out.println("2. bank app");
			int b = 20 / 0;
			System.out.println("3. connection = " + b); // not printed becoz of exception

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("4. server");

		}

		int c = 12 + 21;
		{
			System.out.println("5. final payment c = " + c);
		}

	}
}
