/*
WAP to find out prime number

using

*/


import java.util.Scanner;

class PrimeNumber {
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter a Number=");
		int number=scan.nextInt();
		

		int flag=0;
        for (int i = 2; i <= number-1; i++) {
            if (number % i == 0) {     
				System.out.print("Non Prime Number");
				flag=1;
				break;
            }	
        }
		
		if (flag==0) { 		
			System.out.print("Prime Number");
		}	
	}
}