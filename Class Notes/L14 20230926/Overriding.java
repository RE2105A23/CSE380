/*
Overriding in Inheritance using Java
*/

class A {
	public show(){
		System.out.println("A class");
	}
}

class B extends A {
	public show(){
		System.out.println("B class");
	}
}

class C {

	public static void main(String[] args) {
	B obj=new B();
	obj.A::show();
	obj.show();
	}
}