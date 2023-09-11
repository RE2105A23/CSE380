/*
Arrays
Continued
Two Dimensional Array
*/

import java.util.Scanner;

class Array {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Size of Elements
		int n=9;
				
		int a[] = new int[5];
		int[][] b = new int[n][n]; // This is same as int b[][]
		int i,j,k=0;
		
		System.out.println("Enter " + n + " Elements");
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				//b[i][j]=k;
				//k++;
				b[i][j]=scan.nextInt();
			}
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
}
		
		