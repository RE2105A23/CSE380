/*
Reverse of a string
*/
/*
repalce the spaces of string with a specific character
replace character with character #
*/

import java.util.Scanner;

class StringReversal {
	
	
	public static void main(String[] args) {
		
		String s="ZOOM M E E TING S ",s2;
		char c[]={'z','o','o','m'};
		int n=s.length();
		
		/*
		for(int i=n-1;i>=0;i--) {
			
			System.out.println(s.charAt(i));
			
		}

		*/
		
		// using replace method
		System.out.println(s.replace(" ","#"));
			
	}
	
}