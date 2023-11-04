import java.util.Scanner;

class ExceptionHandling3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 2 numbers: ");
		
		try {
			int a,b,c;
			//a=scan.nextInt();
			//b=scan.nextInt();
			//c=a/b;
			
			//System.out.println("Answer is: "+c);

			String s="abc";
			int i=Integer.parseInt(s);
			
			System.out.println(s.length());

		}
		
		//Exception is a super class
		//catch(Exception e) {
		catch(NumberFormatException e) {
			System.out.println("This is an exception "+e);
			System.out.println("This is an exception "+e.getMessage());
		}

		finally {
			System.out.println("This code is made by LAPTOP");
		}
	}
}