/*
Instances - Instance initializer

Super
Instance
Child

super() is used to call constructor 

*/

class A {
	
	int a;
	A() {
		
		//System.out.println(a);
		System.out.println("This is constructor in A class");
	}
	
	
	//Instance Initializer
	{
		//a=100;
		System.out.println("This is instance initializer");
	}

}

class B extends A {
		
	B() {
		super();
		//System.out.println(a);
		System.out.println("This is xonstructor in B class");
	}
	/*
	{
		//a=100;
		System.out.println("This is instance initializer");
	}
	*/
}

class Instances {
	
	public static void main(String[] args) {
		B obj=new B();
		
	}
}