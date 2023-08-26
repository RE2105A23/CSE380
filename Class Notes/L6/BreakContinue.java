/*
Break and Continue
*/

import java.util.Scanner;

class BreakContinue {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		//System.out.print("Enter a Number=");
		//int n=scan.nextInt();
		
		for (int i=0; i<10; i++) {
			
			if(i==6) {
				break;
			}
			System.out.println(i);
        }	
		
		for (int i=0; i<10; i++) {
		
			if(i==3) {
				System.out.println("Skipping the iteration at i="+i);
				continue;
			}
			System.out.println(i);
		}
	}
}