/*
WAP to find out perfect number or not?

if 

*/


import java.util.Scanner;

class PerfectNumber {
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);

		System.out.print("Enter a Number=");
		int number=scan.nextInt();
		

		int sumOfDivisors = 0,sum=0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                //sumOfDivisors += i;
				sum = sum+i;
            }
        }
        
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
	}
}