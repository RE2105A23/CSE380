/*
Check whether a given integer is positive even
or negative even, positve odd or negative odd
*/

import java.util.Scanner;

class OddEvenNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a,b;
		
		System.out.print("Enter any number to check:");
		a=scan.nextInt();
		
		/*
		if((a>0) && (a%2==0))
			System.out.println("Even & Positive");
		else if((a>0) && (a%2!=0))
			System.out.println("Odd & Positive");
		
		if((a<0) && (a%2==0))
			System.out.println("Even & Negative");
		else if((a<0) && (a%2!=0))
			System.out.println("Odd & Negative");
		*/
		
		if(a>0)
			if(a%2==0)
				System.out.println("Even & Positive");
			else
				System.out.println("Odd & Positive");
		else if(a<0)
			if(a%2==0)
				System.out.println("Even & Positive");
			else
				System.out.println("Odd & Positive");
	}
}