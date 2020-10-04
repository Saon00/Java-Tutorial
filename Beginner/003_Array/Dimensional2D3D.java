package array;

import java.util.*;

public class Dimensional2D3D {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int row,col,n,m,r,c;
		
		System.out.print("How many row: ");
		r=input.nextInt();
		System.out.print("How many col: ");
		c=input.nextInt();
		
		int[][] array = new int[r][c];
		
		for(row=0;row<r;row++) {
			for(col=0;col<c;col++) {
				System.out.printf("A[%d]B[%d]: ",row,col);
				array[row][col]=input.nextInt();
			}
		}
		
		for(row=0;row<r;row++) {
			for(col=0;col<c;col++) {
				System.out.print(array[row][col]+" ");
			}
		System.out.println();
		System.out.println();
		}
		
	}

}
