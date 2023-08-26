/*
Fibonacci Series
*/

import java.util.Scanner;

class FibonacciSeries {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter a Number=");
		int n=scan.nextInt();
		int a=-1,b=1, c=0;
		
		for (int i=0; i<n; i++) {
			
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
        }	
	}
}