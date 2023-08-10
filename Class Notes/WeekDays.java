/*
How to use logical or relational operators in java?
*/

/*
How to use string in Swithcases
*/

import java.util.Scanner;

class WeekDays {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		String a;
		
		System.out.print("Enter any day: ");
		a=scan.next();
		
		switch(a)
		{
			case "Monday":
				System.out.println("it is day 1");
				break;
			case "Tuesday":
				System.out.println("it is day 2");
				break;
			case "Wednesday":
				System.out.println("it is day 3");
				break;
			case "Thursday":
				System.out.println("it is day 4");
				break;
			case "Friday":
				System.out.println("it is day 5");
				break;
			case "Saturday":
				System.out.println("it is day 6");
				break;
			case "Sunday":
				System.out.println("it is day 7");
				break;
			case "1.1":
				System.out.println("it is a float");
			default:
				System.out.println("NA");
		}
	}
}
			