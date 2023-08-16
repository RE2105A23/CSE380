/*
Find out the factorial number of any number
N = N*N-1
*/

import java.util.Scanner;

class FactorialNumber {
	
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		int n,factorial=1;
		
		System.out.print("Enter any number:");
		n=scan.nextInt();
		
		factorial=++factorial;
		
		/*
		
		for(int i=1;i<=n;++i){
			factorial=factorial*i;
		}
		
		
		for(int i=n;i>=1;i--){
			factorial=factorial*i;
		}
		*/
		
		System.out.println("Factorial of given number:"+factorial);
			
	}
}