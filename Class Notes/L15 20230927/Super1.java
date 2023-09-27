/*
super keyword in Java
*/

class A {

	String a="Hello";
	
	void show() {
		System.out.println(a); //Hello
	}
	
	A() {
		System.out.println(a);
	}
	
}

class B extends A {
	String a="World";
	
	super(); // Only super() is used for calling parent 

	void show() {
		//super.show();
		System.out.println(a); //World
		System.out.println(super.a); //Hello
	}
}

class Super1 {
	
	public static void main(String[] args) {
		
		B obj=new B();	
		obj.show();
		
	}
	
}