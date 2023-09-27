/*
Inheritance
we use keyword extends
Single Level Inheritance
*/

import java.util.Scanner;

//Base class or Parent class
class A {
	int a,b;
	//a=5;b=10;
	Scanner scan=new Scanner(System.in);
	
	a=scan.nextInt();
	b=scan.nextInt();
}
//Derived class or Child class
class B  extends A {
	
	int c;
	Scanner scan=new Scanner(System.in);

	void getData(){	
		System.out.println("Enter values for A & B");
		a=scan.nextInt();
		b=scan.nextInt();
	}
	
	void sum(){
		c=a+b;
		System.out.println("Sum is="+c);
	}
}

class Inheritance1 {
	
	public static void main(String[] args) {
		
		B obj1=new B();
		
		obj1.getData();
		
		obj1.sum();
		
	}
}