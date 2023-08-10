/*
Check whether vowels or consonants
*/

import java.util.Scanner;

class VowelConsonants {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		char c;
		
		System.out.print("Enter any character:");
		c=scan.next().charAt(0);
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
		
	}
}