
// Take input from user

import java.util.Scanner;

class ScannerUserInput {

	public static void main(String[] args) {
	
		/*
		
		Scanner obj=new Scanner(System.in); //Object name "obj"
		
		
		int a=0,b=0,c,d;
		
		
		System.out.print("Enter a number=");
		a=obj.nextInt(); // take input from user
		System.out.print("Entered number is="+a);
		
		
		// Get the 2 numbers from the users and do addition & multiplication
		
		c = a+b;
		d = a*b;
		
		System.out.print("Enter first number=");
		a=obj.nextInt();
		System.out.print("Enter second number=");
		b=obj.nextInt();
		
		System.out.print("Sum of a and b is=" + c);
		System.out.println("Multiplication of a and b is=" + d);
		
		
		// Various DataTypes for Scanner objects
		
		float e;
		double f;
		String g;
		char h;
		
		System.out.println("Enter the values:");
		System.out.print("Enter float number=");
		e=obj.nextFloat();
		System.out.print("Enter double number=");
		f=obj.nextDouble();
		System.out.print("Enter String value=");
		g=obj.next();
		System.out.print("Enter character=");
		h=obj.next().charAt(3);
		
		
		
		System.out.println(h);
		*/
		
		// WAP to calculate the area of the circle
		
		Scanner scan1=new Scanner(System.in);
		
		//float pi=3.14f, r, area; // Remember to add "f" at the end of float value
		
		double pi=3.14, r, area;
		
		System.out.print("Enter the radius of circle=");
		r=scan1.nextFloat();
		area=pi*r*r;
		System.out.print("Area of the circle is=" + area);
			
	}
}