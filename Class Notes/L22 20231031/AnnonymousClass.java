/*
Aim is to prevent the overridden
It's used in the case of interfaces
1.Annonymous Class
2.Lambda expressions
*/

interface A {
	void show(); //abstract function
}

//class B implements B {
class AnnonymousClass {
	
	public static void main(String[] args) {
	
		//Annonymous class
		A obj = new A() {
			
			public void show() {
				
				System.out.println("This is annonymous class function");
				
			}
		};
		
		//Annonymous class function
		obj.show();
	}
}