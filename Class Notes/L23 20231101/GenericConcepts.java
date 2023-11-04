/*
Like Templates in CPP
Generic Class, Variable, Methods, Interfaces
*/

class GenericConcepts {
	
	//public static void fun(int a, int b) {
	
	public static <T,U> void fun(T a, U b) {
		System.out.println(a+ " " +b);
	}
	
	public static void fun(String a, String b) {
		System.out.println(a+ " " +b);
	}
	
	public static void main(String[] args) {
			
			fun(5,6);
			fun("g","h");
			fun(5,6.7);
			
			// Explicit type parameter (Note: use Integer and Double instead of int and double)
			GenericConcepts.<Integer, Integer>fun(5, 6);
	}
	
}
