package String;

import java.util.*;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String: ");
		String string = scanner.next();
		StringBuffer sb = new StringBuffer(string);
		String newString = sb.reverse().toString();

		if (string.equalsIgnoreCase(newString)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

		System.out.println("Happy Coding");
	}

}
