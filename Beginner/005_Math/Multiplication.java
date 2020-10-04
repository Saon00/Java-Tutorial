package Math;
import java.util.Scanner;

public class Multiplication {
 static  Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter your Initial Number : ");
		int n=scanner.nextInt();
		System.out.print("Enter your Final Number : ");
		int m=scanner.nextInt();
		
		for(int i=n;i<=m;i++) {
			for(int j=1;j<=10;j++) {
				int mul=i*j;
				System.out.println(i+"x"+j+"="+mul);
				
			}
			System.out.println();
		}
		
	}

}
