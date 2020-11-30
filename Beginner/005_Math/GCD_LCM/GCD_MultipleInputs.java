import java.util.*;
public class MainClass_1118 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("How Many Numbers You Wanna Take: ");
		int limit = scanner.nextInt();
		int[] array = new int[limit];
		int n = array.length;

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("GCD: " + findGCD(array, n));
		scanner.close();
	}

	public static int gcd_Calculate(int num1, int num2) {

		if (num1 == 0)
			return num2;
		return gcd_Calculate(num2 % num1, num1);
	}

	public static int findGCD(int array[], int n) {
		int result = array[0];
		for (int i = 1; i < n; i++) {
			result = gcd_Calculate(array[i], result);
		}
		return result;

	}

}
