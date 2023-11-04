/*
Sum of two numbers using GenericMethods
*/

import java.util.Scanner;

class GenericSum {
	
	public static <U extends String, T extends String> void sum(U a, T b) {
		
		String sum = a + b;
		
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		sum("a","5.5");
	}
	
	
}