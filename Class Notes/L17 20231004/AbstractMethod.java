/*
Abstract Methods
Abstract Class
1. Abstract class
2. Interfaces

Abstract class
1. class must be started with abstract keyword
2. it can store abstract method and non-abstract methods
3. not able to create object
4. can contain constructors, static method too
5. can contain final method too

In C++
We use virtual function and pure virtual functions to achieve Abstractions in CPP

*/


abstract class A {
	
	abstract void add();
	
	void sub() {}
	
	abstract void show();
	
}

class B extends A {
	
	void add() {
		
	}
	
	void show() {
		System.out.println("Hello");
	}
	
}


class AbstractMethod {
	
	
	public static void main(String[] args) {
		
		A obj=new B(); //runtime polymorphism
		obj.show();
		
	}
}

