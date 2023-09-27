/*
Inheritance
we use keyword extends
*/

//Base class or Parent class
class A {
	int a=5,b=10;
	//a=5;b=10;
}
//Derived class or Child class
class B  extends A {
	
	int c;
	int sum(){
		c=a+b;
		return c;
	}
}

class Inheritance {
	
	public static void main(String[] args) {
		
		B obj1=new B();
		System.out.println("Sum is=" + obj1.sum());
		
	}	
}