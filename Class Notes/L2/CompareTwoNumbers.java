
// Greatest values between 2 numbers

import java.util.Scanner;

class TwoNumbers {
	
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		
		double a,b;
		
		System.out.println("Enter the values for 2 numbers");
		a=obj.nextDouble();
		b=obj.nextDouble();
		
		if(a>b){
			System.out.println("A is greater");
		}
		else {
			System.out.println("B is greater");
		}
		
	}
}