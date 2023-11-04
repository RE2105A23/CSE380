/*
Sum of 2 numbers using lambda expression
*/

interface A {
	
	int sum(int a, int b);

}

class SumLambdaExpression {
	
	public static void main(String[] args) {
		
		A obj=(a,b)-> {
			
			{
				int A=a; int B=b;
				//System.out.println(A+B);
				return (A+B);
			}
			
		};
		
		System.out.println(obj.sum(5,5));
		
	}
	
	
	
}