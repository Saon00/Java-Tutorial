package Math;

import java.util.Scanner;

public class SumofDigits {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int sum=0,temp=0,r,num;
		System.out.print("Enter any number to sum: ");
		num = scanner.nextInt();
		
		temp = num;
		
		while(temp!=0) {
			
			r = temp % 10;
			sum = sum + r;
			temp = temp / 10;
		}
		System.out.println("The sum of digits: "+sum);
		if (num==sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
