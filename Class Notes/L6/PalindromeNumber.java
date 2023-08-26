/*
Find out the given number is palindrome
*/

import java.util.Scanner;

class PalindromeNumber {
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		int n, remainder, y;
		System.out.print("Enter a number:");
		
		n=scan.nextInt();
		
		
		while(n>0){
			remainder=n%10;
			out=out*10+remainder;
			n=n/10;
		}
		
		if(out==temp)
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}
}