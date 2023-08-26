/*
Nested continue or break
*/

import java.util.Scanner;

class NestedContinueLoop {
	
	public static void main(String[] args) {
		
		/*
		Scanner scan=new Scanner(System.in);

		//System.out.print("Enter a Number=");
		//int n=scan.nextInt();
		*/
		
		first:
		for (int i=0; i<5; i++) {
		
			second:
			for (int j=0; j<5; j++) {
				
				thirid:
				for (int k=0; k<5; k++) {
					if(i==1 && j==1) {
						continue first;
					}
					System.out.println(i+" "+j);
			}	
		}
	}
}