import java.util.Random;	// Author: Saon Srabon 
import java.util.Scanner;	// fb: https://www.facebook.com/blackosra

public class RandomCharacter {
	static Random random = new Random();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("How Many words you want: ");
		int limit = scanner.nextInt();

		for (int i = 0; i < limit; i++) {
			System.out.println(randomWord(3)); // here 3 is the character Length
		}
	}

	static String randomWord(int charLength) {

		char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 
                            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r','s', 't', 'u',
                            'v', 'w', 'x', 'y', 'z' };
		String word = "";

		for (int i = 0; i < charLength; i++) {
			word += alphabets[random.nextInt(26)];
		}
		return word;
	}
}

/* Output:
How Many words you want: 3
rxj
dvd
iba
*/
