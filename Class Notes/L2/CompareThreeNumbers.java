
// Greatest values between 3numbers

import java.util.Scanner;

class ThreeNumbers {
	
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		double a,b,c;
		
		System.out.println("Enter the values for 3 numbers");
		a=obj.nextDouble();
		b=obj.nextDouble();
		c=obj.nextDouble();
		obj.close();
		
		if(a>c) {
			if (a>b) {
				System.out.println("A is greater");
			}
			else
				System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}
		
		/*
		if ((a>b) && (a>c)) {
			System.out.println("A is greater");
		}
		else if ((b>a) && (b>c)) {
			System.out.println("B is greater");
		}
		else
			System.out.println("C is grater");		
		*/
	}
}

