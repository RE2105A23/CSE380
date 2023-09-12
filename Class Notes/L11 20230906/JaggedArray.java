/*
Jagged Array
*/

import java.util.Scanner;

class JaggedArray {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Size of Elements
		int n=5;
				
		int[][] a = new int[n][]; // This is same as int a[][]
		int i,j,k=0;
		
		a[0]=new int[5];
		a[1]=new int[3];
		a[2]=new int[4];
		a[3]=new int[6];
		a[4]=new int[8];
		
		for(i=0;i<n;i++) {
			for(j=0;j<a[i].length;j++) {
				a[i][j]=++k;
				//a[i][j]=scan.nextInt();
			}
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}