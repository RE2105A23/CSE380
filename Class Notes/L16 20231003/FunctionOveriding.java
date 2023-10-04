/*
Function Overriding

*/

class A {
	void show() {
		System.out.println("base class");
	}
}

class B extends A {
	void show() {
		System.out.println("derived class");
	}	
}

class FunctionOveriding {
	
	public static void main(String[] args) {
		B obj=new B();
		obj.show();
	}
}