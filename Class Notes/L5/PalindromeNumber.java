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
		
		/*
		while(n>0){
			remainder=n%10;
			y=remainder;
			System.out.println(y);
			n=n/10;
		}
		*/
		
		for(int i=0;n>0;i++){
			remainder=n%10;
			y=remainder;
			System.out.println(y);
			n=n/10;
		}
	}
}