package Math;

import java.util.Scanner;
public class Fibbonacci {
	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first=0;
		int second=1;
		int fibo;
		System.out.print("How many number do you want ? = ");
		int num=input.nextInt();
		
		System.out.print(first+" "+second);
		
		for(int i=3;i<=num;i++){
			  fibo=first+second;
			  System.out.print(" "+fibo);
			  first=second;
			  second=fibo;
			  }
	}

}


