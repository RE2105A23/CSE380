/*
Declare a class "Student" and store the values of 5 students
for (Rollnumber, Name, and Address)
and print those values also
*/

import java.util.Scanner;

/*
class Student {
	
	int rollnumber;
	String name;
	String address;
	
	void getData() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Rollnumber, Name, Address");
		rollnumber=scan.nextInt();
		name=scan.nextLine();name=scan.nextLine();
		address=scan.nextLine(); address=scan.nextLine();
		
	}
	
	void printData() {
		
		System.out.println("Rollnumber:"+rollnumber);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
	}
	
}

class StudentData {
	
	
	public static void main(String[] args) {
		
		int n;
		
		Student s1=new Student();
		
		s1.getData();
		
		s1.printData();
		
		
	}	
}
*/

class StudentData {
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		int rollnumber[]=new int[5];
		String name[]=new String[5];
		String address[]=new String[5];
		
		for(int i=0;i<2;i++) {
			
			System.out.println("\nStudent "+(i+1)+" Data");
			System.out.print("Enter Rollnumber:");
			rollnumber[i]=scan.nextInt();
			System.out.print("Enter Name:");
			name[i]=scan.nextLine();
			name[i]=scan.nextLine();
			System.out.print("Enter Address:");
			address[i]=scan.next();
			
		}

		for(int i=0;i<2;i++) {
	
			System.out.println("\nStudent "+(i+1)+" Data");
			System.out.println("Rollnumber: "+rollnumber[i]);
			rollnumber[i]=scan.nextInt();
			System.out.print("Enter Name: "+name[i]);
			name[i]=scan.nextLine();
			//name[i]=scan.nextLine();
			System.out.print("Address: "+address[i]);
			address[i]=scan.next();
		}
	}
}
	