//Number is leap year or not?
/*
divisible by 4 and non-divisible by 100
or
divisible by 400
*/

import java.util.Scanner;

class LeapYear {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int year;
		
		System.out.print("Enter any year:");
		year=scan.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0)
			System.out.println("Leap year");
		else
			System.out.println("Non-Leap year");
	}
}
