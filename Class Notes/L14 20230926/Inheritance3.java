/*
Multi Level Inheritance
*/

import java.util.Scanner;

class A {
	
	int a,b;
	
	Scanner scan=new Scanner(System.in);
	void getData() {
		System.out.println("Enter 1st & 2nd numbers");
		a=scan.nextInt();
		b=scan.nextInt();
	}
	
}

class B extends A {
	
	int c,s;
	void sum(){
		s=a+b;
		System.out.println("Sum is="+s);
	}
	
	void getData1() {
		System.out.println("Enter 3rd number");
		c=scan.nextInt();
	}
	
}

class C extends B {
	
	int t;
	void total(){
		t=c+s;
		System.out.println("Total is="+t);
	}
}

class Inheritance3 {

	public static void main(String[] args) {
		
		C obj=new C();
		
		obj.getData();
		obj.sum();
		obj.getData1();
		obj.total();
		
	}
}