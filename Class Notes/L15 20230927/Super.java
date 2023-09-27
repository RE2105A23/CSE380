/*
super keyword in Java
*/

class A {

	String a="Hello";
	
	void show() {
		System.out.println(a); //Hello
	}
	
}

class B extends A {
	String a="World";
	
	void show() {
		System.out.println(a); //World
		System.out.println(super.a); //Hello
	}
}

class Super {
	
	public static void main(String[] args) {
		
		B obj=new B();	
		obj.show();
		
	}
	
}