package array;

import java.util.*;

public class AddArray {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pr("How many Row: ");
		int row_num = scan.nextInt();
		pr("How many Coloumn: ");
		int col_num = scan.nextInt();
		System.out.println();
		int[][] A = new int[row_num][col_num];
		int[][] B = new int[row_num][col_num];
		int[][] C = new int[row_num][col_num];
		
		// Input of Matrix A
		for(int i=0;i<row_num;i++) {
			for(int j=0;j<col_num;j++) {
				System.out.printf("A[%d]A[%d]: ",i,j);
				A[i][j]=scan.nextInt();
			}

		}
		System.out.println();
		System.out.println("A= ");
		// Output of Matrix A
		for(int i=0;i<row_num;i++) {
			for(int j=0;j<col_num;j++) {
				pr(A[i][j]+" ");
			}
			System.out.println();
		}
		
		// Input of Matrix B
		for(int i=0;i<row_num;i++) {
			for(int j=0;j<col_num;j++) {
				System.out.printf("B[%d]B[%d]: ",i,j);
				B[i][j]=scan.nextInt();
			}

		}
		System.out.println();
		System.out.println("B= ");
		// Output of Matrix A
		for(int i=0;i<row_num;i++) {
			for(int j=0;j<col_num;j++) {
				pr(B[i][j]+" ");
			}
			System.out.println();
		}
		
		// addding A+B 
		System.out.println();
		System.out.println("A+B = ");
		for(int i=0;i<row_num;i++) {
			for(int j=0;j<col_num;j++) {
				System.out.print(A[i][j]+B[i][j]+"  ");;
			}
			System.out.println();
		}
		
	}
	
	
	static void pr(Object anyObject) {
		System.out.print(anyObject);
	
		
	}

}
