package array;

import java.util.Arrays;
import java.util.*;

public class SortingArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many numbers you want to take: ");
		int number = scan.nextInt();
		int[] A = new int[number];

		for (int i = 0; i < number; i++) {
			System.out.printf("Enter your %d number: ", i + 1);
			A[i] = scan.nextInt();
		}
		System.out.print("Numbers are: ");
		for (int i = 0; i < number; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		Arrays.parallelSort(A);
		System.out.print("Ascending : ");
		for (int rearrange : A) {
			System.out.print(rearrange + " ");
		}
		System.out.println();

		System.out.print("Decending : ");
		for (int i = (number - 1); i >= 0; i--) { // here number-1= array's last index
			System.out.print(A[i] + " ");
		}

		System.out.println();
		int limit, i, j;
		System.out.print("How many names you want to take: ");
		limit = scan.nextInt();
		scan.nextLine();
		String[] name = new String[limit];

		for (i = 0; i < name.length; i++) {

			System.out.print("Enter your name: ");
			name[i] = scan.nextLine();
		}

		for (String output : name) {
			System.out.println("Names are: " + output);
		}
	}

}
