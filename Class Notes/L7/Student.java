/*

Class in Java
Class ia OOPS concept, holding the property of encapsulation
(Wrapping of Data Members (variables) and member function(functions)
inside one class.
Class are accessed by object -> it is an instance of class

class Student {

	data member;
	.
	.
	.
	member function;
	.
	.
}

class ClassConcepts {

	public static void main(Strin[] args) {
		
		student obj=new Student();
		
	}
}

*/

import java.util.Scanner;

class Teacher {
	
	int contact;
	String subject;
	
}

class Student {

	//Instance variables are defined/declared before main function

	int rollno;
	String name;

	public static void main(String[] args) {

		Student obj=new Student();
		obj.rollno=10;
		obj.name="LPU";
		
		Teacher tea=new Teacher();
		tea.contact=12345;
		tea.subject="JAVA";
		
		System.out.println(obj.rollno + " " + obj.name);
		
		System.out.println(tea.contact + " " + tea.subject);
	
}}