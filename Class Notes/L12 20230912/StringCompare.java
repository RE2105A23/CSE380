/*
String Comparison
*/

class StringCompare {

	public static void main(String[] args) {
		
		String s1="HELLO";
		String s2="hello";
		String s3="HELLO";
		String s4="BELLO";
		
		/*
		//equals
		System.out.println(s1.equals(s2)); //Output False
		//not equal or inverse of equals
		System.out.println(!s1.equals(s2)); //Output False
		System.out.println(s1.equals(s3)); //Output True
		
		//Ignore the case sensitivity of the letters
		//equalsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2)); //Output True
		
		
		// == operator in java for True or false
		System.out.println(s1==(s2)); //Output False
		System.out.println(s1==(s3)); //Output True
		System.out.println(s1!=(s2)); //Output False
		System.out.println(s1!=(s3)); //Output True
		
		
		// compareTo() -> 0 (if both are equal), positive for (s1>s2), negative for (s1<s2);
		System.out.println(s1.compareTo(s2)); // any negative value
		System.out.println(s1.compareTo(s3)); //0
		System.out.println(s1.compareTo(s4)); //0
		
		*/
		
		//Concatenation method for String
		String s5="hello",s6="Students",s7;
		System.out.println(s5+s6); //helloStudents
		s7=s4.concat(s6); 
		System.out.println(s7);
		String s8=String.join(" ",s5,s6);
		System.out.println(s8);
		
		
		//Substring methods
		//substring(0,0) -> (*starting index, *ending index)
		String s9="HELLO STUDENTS";
		System.out.println(s9.substring(1,8));
		
		//toUpperCase() and toLowerCase()
		System.out.println(s5.toUpperCase());
		System.out.println(s9.toLowerCase());
		
		//trim() -> delete white space before and after the string
		System.out.println(s8.trim()); // HELLO STUDENTS
		String s10="     hello    students      1";
		System.out.println(s10.trim());
		
		//charAt()
		System.out.println(s8.charAt(0)); //h
		
		//length()
		System.out.println(s8.length()); //14
		
		//replace() -> ("String to replace","New String")
		System.out.println(s8.replace("hello","HI"));
		
		
		
		
	}

}