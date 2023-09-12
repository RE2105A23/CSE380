/*
String in Java
Immutable
*/

class Strings {

	public static void main(String[] args) {
		
		String s="HELLO";
		char s1[]={'h','e','l','l','o'};
		
		String s2=new String(s1);
		
		s.concat("STUDENT");
		System.out.println(s); //Output HELLO
		
		s=s.concat("STUDENT");
		System.out.println(s); //Output HELLOSTUDENTS
		
		System.out.println(s2); //Output HELLO
	}
}
