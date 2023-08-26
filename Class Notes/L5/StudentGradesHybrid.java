/* Decalare a class with name Student
name, rollnumber, sub1, sub2, sub3 (input from user)
Calculate 5
>90 -> O
>80 -> A
>70 -> B
>60 -> C
<50 -> D
*/

import java.util.Scanner;

class StudentGrades {
	
	public static void main(String[] args) {

	String name;
	int rollnumber,sub1,sub2,sub3;
	
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter your name:");
	name=scan.next();
	System.out.println("Enter your rollnumber:");
	rollnumber=scan.next();
	System.out.println("Enter marks of 3 subjects:");
	sub1=scan.nextInt();
	
	
	}
}