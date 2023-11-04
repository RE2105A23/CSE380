/*
Exception handling

try () {//code that may contain exception}
catch (Exception e) {//to handle those exception}

Types of exaceptions

*/

import java.util.Scanner;

class ExceptionHandling {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		
		try {
			int a,b,c;
			a=scan.nextInt();
			b=scan.nextInt();
			
			c=a/b;
			
			System.out.println("Answer is: "+c);
		}
		
		//Exception is a super class
		//catch(Exception e) {
		catch(ArithmeticException e) {
			System.out.println("This is arithmetic exception "+e);
			System.out.println("This is arithmetic exception "+e.getMessage());
		}

		finally {
			System.out.println("This code is made by LAPTOP");
		}
	}
}