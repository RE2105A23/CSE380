/*
Hierarchical Inheritance
*/

import java.util.Scanner;

class A {
	
	int a,b;
	
	Scanner scan=new Scanner(System.in);
	
	void getData() {
		
		a=scan.nextInt();
		b=scan.nextInt();
	}
	
}

class B extends A {
	
	void sum() {
		System.out.println("Sum is="+(a+b));
	}
	
}

class C extends A {
	
	void mul() {
		System.out.println("Multiplication is="+(a*b));
	}
	
}

class Inheritance4 {
	
	public static void main(String[] args) {
		
		B obj1=new B();
		C obj2=new C();
		
		obj1.getData();
		obj1.sum();
		
		obj2.getData();
		obj2.mul();
		
	}
}