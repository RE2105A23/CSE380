/*
Declare a class Employee (empid, empname)
Take two variable EmpID and EmpName

Take the input from user through member functions with the class concept,
call the member function "Print" to print both the variables
*/


import java.util.Scanner;


class EmployeeDetail {
	
	int eid;
	String ename;

	void getData() {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter any Emp ID= "); eid=obj.nextInt();
		System.out.print("Enter any Emp Name= "); ename=obj.nextLine();
		//ename=obj.nextLine();
		obj.close();
	}
	
	void print() {
		
		System.out.println("Emp ID is= " + eid);
		System.out.println("Emp Name is= " + ename);
		
	}
}

class Employee {
	
	public static void main(String[] args) {
		
		EmployeeDetail obj= new EmployeeDetail();
		
		obj.getData(); obj.print();
		
	}
}