/*
Sum of n natural numbers
*/

import java.util.Scanner;

class SumNaturalNumbers {
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		int i, n, sum=0;
		
		System.out.print("Enter N Natural number:");
		n=scan.nextInt();
		
		for(i=0;i<n;i++){
			sum=sum+i;
		}
		System.out.println("Sum="+sum);
	}
}