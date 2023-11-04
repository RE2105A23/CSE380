/*
Exception handling with multiple catch block
try {}
catch() {}
finally {}
*/

import java.util.Scanner;

class MultipleCatchBlocks {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		
		try {
			
			try {
				//int a,b,c;
				//a=scan.nextInt();
				//b=scan.nextInt();
				//c=a/b;
				
				//System.out.println("Answer is: "+c);

				String s="abc";
				int i=Integer.parseInt(s);
				
			}
			catch(NumberFormatException e) {
			System.out.println("This is an exception "+e);
			System.out.println("This is an exception "+e.getMessage());
			}
			
			try {
				//int a,b,c;
				//a=scan.nextInt();
				//b=scan.nextInt();
				//c=a/b;
				
				//System.out.println("Answer is: "+c);
				
				int a=10,b=0; System.out.println(a/b);
			}
			catch(ArithmeticException e) {
				System.out.println("This is arithmetic expression "+e);
				System.out.println("This is arithmetic expression "+e.getMessage());
			}

		}
		
		//Exception is a super class
		/*
		catch(Exception e) {
			System.out.println("This is an exception "+e);
			System.out.println("This is an exception "+e.getMessage());
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This is an exception "+e);
			System.out.println("This is an exception "+e.getMessage());
		}
		*/
		catch(NullPointerException e) {
			System.out.println("This is an exception "+e);
			System.out.println("This is an exception "+e.getMessage());
		}


		finally {
			System.out.println("This code is made by LAPTOP");
		}
	}
}