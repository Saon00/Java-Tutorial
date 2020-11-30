import java.util.Scanner;
public class MainClass_1012 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		int no1 = scanner.nextInt();
		int no2 = scanner.nextInt();
		System.out.println("GCD: " + gcd(no1, no2));
	}

	// Euclidean Algorithm
	static int gcd(int no1, int no2) {
		if (no1 == 0 || no2 == 0)
			return 0;
		if (no1 == no2)
			return no1;
		if (no1 > no2)
			return gcd(no1 - no2, no2);
		else
			return gcd(no1, no2 - no1);
	}

}
