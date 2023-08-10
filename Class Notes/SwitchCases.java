/*
Switch Cases
switch(conditions)
syntax
switch(expression)
{
	case value1:
	...
	statement;
	break;
	case value2;
	...
	default:
}
*/
import java.util.Scanner;

class SwitchCases {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		/*
		int a;
		
		System.out.print("Enter any input=");
		a=scan.nextInt();
		
		switch(a)
		{
			case 1:
				System.out.println("Value passes as 1");
				break;
			case 2:
				System.out.println("Value passes as 2");
				break;
			case 3:
				System.out.println("Value passes as 3");
				break;
			default:
				System.out.println("Case for any other values");
			
		}
		*/
		char c;
		
		System.out.print("Enter any input=");
		c=scan.next().charAt(0);
		
		switch(c) {
			
			case 'a':
				System.out.println("Vowel");
				break;
			case 'e':
				System.out.println("Vowel");
				break;
			case 'i':
				System.out.println("Vowel");
				break;
			case 'o':
				System.out.println("Vowel");
				break;
			case 'u':
				System.out.println("Vowel");
				break;
			
			case 'A':
				System.out.println("Vowel");
				break;
			case 'E':
				System.out.println("Vowel");
				break;
			case 'I':
				System.out.println("Vowel");
				break;
			case 'O':
				System.out.println("Vowel");
				break;
			case 'U':
				System.out.println("Vowel");
				break;
				
			/*
			case 'a' OR 'e';
				System.out.println("Vowel");
				break;
			*/
			
			default:
				System.out.println("Consonant");
			
		}
	}		
}