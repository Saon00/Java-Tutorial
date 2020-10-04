package Others;

public class EXceptionDemo {

	public static void main(String[] args) {

		try {
			int x = 10, y = 0;
			int result = x / y;
			System.out.println("Result: " + result);

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			System.out.println("Thanks for coding");

		}
	}

}
