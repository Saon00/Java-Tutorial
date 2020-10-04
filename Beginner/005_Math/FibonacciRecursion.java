
public class FibonacciRecursion {

	public static int fibo(int n) {

		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}

	}

	public static void main(String[] args) {

		int num = 10;
		for (int i = 0; i < num; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

}
