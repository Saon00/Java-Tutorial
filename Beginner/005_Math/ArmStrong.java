package Math;

import java.util.*;

public class ArmStrong {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		// 153 will be arm strong if 1^3+5^3+3^3 = 153 ;
		
		int sum=0,temp=0,num,r;
		System.out.print("Enter a number " );
		num = scanner.nextInt();
		
		temp = num;
		
		while(temp!=0) {
			r = temp % 10;
			sum = sum + (r*r*r);
			temp = temp / 10;
			
		}
		
		if(sum==num) {
			System.out.println(num+" is an Arm Strong Number.");
		}
		else {
			System.out.println(num+" is not an Arm Strong Number.");
		}
		

	}

}
