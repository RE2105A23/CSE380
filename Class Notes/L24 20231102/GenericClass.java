/*
Declare one class with the name test 
Declare two variables a and b, that variables must be generic data type
Declare parameterized constructor -> test 
Provide the variable and 
Declare one function display() 
*/


class test <T extends Number,U extends Number> {
	
	T a; U b;
	
	test(T a, U b) {
		
		this.a=a; this.b=b;
		
	}
	
	void display() {
		
		System.out.println(a + " " + b);
		
		double c=a.getDouble()+b.getDouble();
		
		System.out.println(c);
		
	}
	
}

class GenericClass {
	
	public static void main(String[] args) {
		
		//test obj=new test(5,5);
		
		test <Integer,Integer> obj=new test<Integer,Integer>(3,5);
		
		obj.display();
		
	}
}