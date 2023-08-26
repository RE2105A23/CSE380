/*
Reverse of a Number
*/

import java.util.Scanner;

class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter a Number=");
		int n=scan.nextInt();
		int rem, out=0;
		
		while(n>0) {
			rem=n%10;
			out=out*10+rem;
			n=n/10;
		}
		
		System.out.print("Reversed Number" + n);
		
		//int reversedNumber = reverseNumber(number);
		//System.out.print("Reversed Number" + reversedNumber);
	}


	public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
	
}
