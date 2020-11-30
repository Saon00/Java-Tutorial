import java.util.*;
public class MainClass_1118 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Two numbers: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("GCD: " + gcd_Calculate(num1, num2));
		System.out.println("LCM: " + lcm_Calculate(num1, num2));

		scanner.close();
	}

	public static int gcd_Calculate(int num1, int num2) {
		int a, b;
		a = (num1 > num2) ? num1 : num2; // a is greater
		b = (num1 < num2) ? num1 : num2; // b is smaller
		int result = 0;
		result = b;
		while (a % b != 0) {
			result = a % b;
			a = b;
			b = result;
		}

		return result;
	}

	public static int lcm_Calculate(int num1, int num2) {
		int a;
		a = (num1 > num2) ? num1 : num2; // a is greater
		while (true) {
			if (a % num1 == 0 && a % num2 == 0)
				return a;
			++a;
		}

	}
}
