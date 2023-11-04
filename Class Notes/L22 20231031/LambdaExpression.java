/*
Aim is to prevent the overridden
It's used in the case of interfaces
1.Annonymous Class
2.Lambda expressions
*/

interface A {
	void show(); //abstract function
}


class LambdaExpression {
	
	public static void main(String[] args) {
	
		//Lamda Expression
		A obj = () -> {
			
			{
				
				System.out.println("This is annonymous class function");
				
			}
		};
		
		//Annonymous class function
		obj.show();
	}
}