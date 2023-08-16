

// Conditional Statements
// if, if else, nested if else, switch

import java.util.Scanner;

class Conditional1 {
	public static void main(String[] args) {
	
		/*
		int a=10;
		if(a<0) {
			System.out.println("Negative number");
		}
		else
			System.out.println("Positive number");
		*/
		
		// Take the input values from user
		
		int b;
		
		Scanner obj=new Scanner(System.in);
		
		System.out.print("Enter a negative value=");
		b=obj.nextInt();
		if(b<0) {
			System.out.println("Negative number");
			System.out.println("Inside if block");
		}
		else {
			System.out.println("Positive number");	
		}	
		
	}
}