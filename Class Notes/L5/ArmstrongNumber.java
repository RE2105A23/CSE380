//WAP for to find if given number is Armstrong number or not?
/*

or

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
