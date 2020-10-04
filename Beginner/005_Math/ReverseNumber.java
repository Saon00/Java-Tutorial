package Math;

import java.util.Scanner;

public class ReverseNumber {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		int sum=0,temp=0,r,num;
		System.out.print("Emter any number to reverse: ");
		num=scanner.nextInt();
		temp=num;
		
		while(temp!=0) {
			r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		System.out.println("("+num+")'s Reverse number is : "+sum);
		
		if(num==sum) {
			System.out.println(num+" is a palindrome number.");
		}
		else {
			System.out.println(num+" is not a palindrome number.");
		}

	}

}
