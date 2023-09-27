/*
final keyword in java
*/

class A {
	//final int a=10;
	int a=10;
	final void show() {
		a=1000;
		System.out.println(a);
	}
}

final class B extends A {
	
	void show() {
		a=100;
		System.out.println(a);
	}
}

class C extends B {
	
	void show() {
		a=100;
		System.out.println(a);
	}
}

class Final {
	
	public static void main(String[] args) {
		
		A obj=new A();
		obj.show();
		
	}
}