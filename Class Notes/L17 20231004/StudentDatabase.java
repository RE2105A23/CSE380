/*

*/

import java.util.Scanner;

abstract class Person {
	
	int id,max=3; String name,s1,s2,s3,s4,s5;
	//String[] course=new String[5];
	
	abstract void Enrollable();
	abstract void Unenrollable();
	void get() {}; void set() {};
}

class Student extends Person {
	
	int count;
	String course[]=new String[max];
	
	Scanner scan=new Scanner(System.in);
	
	void get() {
		
		System.out.println("Enter your Name:");
		name=scan.next();
		System.out.println("Enter your Student ID:");
		id=scan.nextInt();
		
	}
	
	void Enrollable () {
		
		int choice;
		
		System.out.println("Select Courses to Enroll[1-3]:");
		System.out.println("1.Java\n2.C++\n3.Python,4.DBMS\n);
		
		choice=scan.nextInt();
		
		for(int i=0; i<choice;i++) {
			
			System.out.println("Enter your opted course "+i+": ");
			course[i]=scan.next();
			count++;
			
		}
		
		
	}
	
	void Unenrollable () {
		
		
		
	}
	
	
	
}