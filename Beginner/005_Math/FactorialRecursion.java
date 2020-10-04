package Math;

public class FactorialRecursion {

	public static void main(String[] args) {

		FactorialRecursion faRe = new FactorialRecursion();
		int result = faRe.fact(4);
		System.out.println("Factorial of 4 is: "+result);
	}

	int fact(int num) {
		if (num == 1)
			return 1;
		else
			return num * fact(num - 1);
	}

}
