import java.util.Scanner;

class ExceptionHandling2 {
	
	public static void main(SExceptionHandling2tring[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		
		try {
			int a,b,c;
			//a=scan.nextInt();
			//b=scan.nextInt();
			//c=a/b;
			
			//System.out.println("Answer is: "+c);

			String s=null;
			System.out.println(s.length());

		}
		
		//Exception is a super class
		//catch(Exception e) {
		catch(NullPointerException e) {
			System.out.println("This is an exception "+e);
			System.out.println("This is an exception "+e.getMessage());
		}

		finally {
			System.out.println("This code is made by LAPTOP");
		}
	}
}