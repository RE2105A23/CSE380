/*
Declare 2 variables and get input from users
Whenever user press
-> '+' then it will add 2 numbers
-> '-' then it will substract 2 numbers
-> '*' then it will multiply 2 numbers
-> '/' then it will divide 2 numbers
*/

import java.util.Scanner;

class ArithmeticsCases {
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		/*
		int a,b;
		char symbol;
		
		System.out.print("Enter an operation (+,-,*,/):");
		symbol=scan.next().charAt(0);
		System.out.println("Enter 2 inputs:");
		a=scan.nextInt();
		b=scan.nextInt();
		
		switch(symbol) {
			
			case '+':
					System.out.println("Addition of a+b=" + (a+b));
					break;
			case '-':
					System.out.println("Subtraction of a-b="+(a-b));
					break;
			case '*':
					System.out.println("Multiplication of a*b="+(a*b));
					break;
			case '/':
					System.out.println("Division of a-b="+(a/b));
					break;
			default:
					System.out.println("Invalid operation!");
		*/
		
		int a,b; char c;
		
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.print("1. Press + for addition");
		System.out.print("2. Press - for substraction");
		System.out.print("3. Press * for multiplication");
		System.out.print("4. Press / for division");
		System.out.println("Now press input=");
		c=scan.next().charAt(0);
		
		
		switch(c) {
			
			case '+':
					int d=a+b;
					System.out.println("Addition of a+b="+d);
					break;
			case '-':
					int d=a-b;
					System.out.println("Subtraction of a-b="+d);
					break;
			case '*':
					int d=a*b;
					System.out.println("Multiplication of a*b="+d);
					break;
			case '/':
					int d=a/b;
					System.out.println("Division of a-b="+d);
					break;
			default:
					System.out.println("Invalid operation!");
			
		}
	}
}