/*
create a class with name Person and 2 variable "id, name" and declare the values
of these variables using the constructor declare a class with name "employee"
and calculate the salary of person and print all three values by calling the base class
constructor using super keyword
*/
import java.util.Scanner;

class Person {
	int id;
	String name;
	
	Scanner sc=new Scanner(System.in);
	
	Person() {
		
		System.out.println("Enter ID and Name:");
		id=sc.nextInt();name=sc.next();
		//id=123; name="ABC XYZ";
	}
	
}

class Employee extends Person {
	
	int salary;
	Employee() {
		
		super();
		System.out.println("Enter Salary=");
		salary=sc.nextInt();
		
	}

	void getData() {
		
		System.out.println("Employee ID:"+id+"\nEmployee name:"+name+"\nEmployee Salary:"+salary);
		
	}
	
}

class Super2 {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.getData();
		
	
	}
	
}