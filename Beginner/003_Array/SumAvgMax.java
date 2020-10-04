package array;

import java.util.Scanner;

public class MainClass {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("How many Numbers you want to Store: ");
		int limit,num,n,i,max=0,sum=0;
		limit=input.nextInt();
		int[] number = new int[limit];
		System.out.print("How many numbers you want to take: ");
		num=input.nextInt();
		
		for(i=1;i<=num;i++) {
			System.out.print("Enter Number "+i+": ");
			number[i]=input.nextInt();
		}
		for(i=1;i<=num;i++) {
			sum=sum+number[i];
		}
		System.out.println("Sum is :"+sum);
		double avg=(sum/num);
		System.out.println("Average is : "+avg);
		
		for(i=1;i<=num;i++) {
			if(number[i]>max) {
				max=number[i];
			}
		}
		System.out.println("Max = "+max);
		
	}

}
