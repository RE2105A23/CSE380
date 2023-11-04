/*
Exception handling

try () {//code that may contain exception}
catch (Exception e) {//to handle those exception}


Types of exaceptions

-ArrayIndexOutOfBoundsException
-NullPointerException
-NumberFormatException
-NullPointerException
-IOException

*/

import java.util.Scanner;

class ExceptionHandling1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		
		try {
			int a,b,c;
			//a=scan.nextInt();
			//b=scan.nextInt();
			//c=a/b;
			
			//System.out.println("Answer is: "+c);

			
			int d[]=new int[8];
			d[10]=30;
						
			

		}
		
		//Exception is a super class
		//catch(Exception e) {
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This is an exception "+e);
			System.out.println("This is an exception "+e.getMessage());
		}

		finally {
			System.out.println("This code is made by LAPTOP");
		}
	}
}