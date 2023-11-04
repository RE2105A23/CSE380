/*
Throw keyword in java for exception handling
throw exception_name

try {
	throw exception_name
}
catch(Exception e) {
	//handling exception
}

throws - for the compiler type exceptions

*/


public class ThrowCatchExceptions {
    
    public static void main(String[] args) {
        fun();
    }
	
	public static void fun() {
        try {
            throw new NullPointerException("This is null pointer exception");
            // The below line won't be reached due to the above throw statement
            // throw new ArithmeticException("This is arithmetic pointer exception");
        }
        catch (NullPointerException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}


	