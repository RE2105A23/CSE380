/*
Function Overloading also known as Method Overloading

Ambiguity error - If the same function name are used in multiple class with same parameters
*/

class S {
	
	int Add(int a, int b) {
		
		int c=a+b;
		
		//System.out.println(a+b);
		
		return c;
	}
	
	double Add(double a, double b) {
		
		double c=a+b;
		//System.out.println(a+b);
		
		return c;
	}
	
}

class FunctionOverloading {
	
	public static void main(String[] args) {
		S obj=new S();
		System.out.println(obj.Add(5,6));
		System.out.println(obj.Add(5.5,6.6));
		System.out.println(obj.Add(0.0,0.0));
	}
}