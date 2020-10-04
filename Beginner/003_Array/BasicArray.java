package Practise;

import java.util.*;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int i, n, max = 0, sum = 0;
		System.out.print("how many input you want to take: ");
		int num = input.nextInt();

		int[] arr = new int[num]; // it is the best/preferred way

		for (i = 0; i < num; i++) { // taking inputs
			arr[i] = input.nextInt();
		}

		for (i = 0; i < num; i++) { // outputs
			System.out.print(arr[i] + " ");
		}
		for (i = 0; i < num; i++) {
			sum = sum + arr[i];
		}
		// for each loop
//		for( int hi : arr) {
//			System.out.println(hi);
//		}
		System.out.println();
		System.out.println("Sum : " + sum); // sum of taken numbers
		for (i = 0; i < num; i++) {

			if (arr[i] > max) {
				max = arr[i]; // max number shown
			}
		}
		System.out.println("Max: " + max);

//		Arrays.parallelSort(arr);
		Arrays.sort(arr);

		for (int hi : arr) {
			System.out.print(hi + " ");
		}

	}

}
