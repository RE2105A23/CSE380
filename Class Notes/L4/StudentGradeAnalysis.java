/*
WAP to create a class with a name student
Declare the variable Roll Number, Name, Marks of 3 Subjects
Calculate the percentage of Students
if (%>90) -> O
if (%>80) -> A
if (%>70) -> B
if (%>60) -> C
if (%<50) -> FAIL
*/

import java.util.Scanner;

class StudentGrades {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int rollNumber, s1,s2,s3;
		String name;

		
		System.out.print("Enter the Roll Number:");
		rollNumber=scan.nextInt();
		System.out.println("Enter the Name:");
		name=scan.next();
		System.out.println("Enter Marks for 3 subjects:");
		s1=scan.nextInt();
		if(s1>100)
			System.out.println("Enter valid marks!");
		s1=scan.nextInt();
		s2=scan.nextInt();
		if(s2>100)
			System.out.println("Enter valid marks!");
		s2=scan.nextInt();
		s3=scan.nextInt();
		if(s3>100)
			System.out.println("Enter valid marks!");
		s3=scan.nextInt();
		
		int sum=s1+s2+s3;
		double percentage= (sum/300)*100;
		
		if(percentage>90)
			System.out.println("O grade");
		else if(percentage>80 && percentage<90)
			System.out.println("A grade");
		else if(percentage>70 && percentage<80)
			System.out.println("B grade");
		else if(percentage>60 && percentage<70)
			System.out.println("C grade");
		else if(percentage<60)
			System.out.println("Fail");
	}
}