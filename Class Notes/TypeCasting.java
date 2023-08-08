
// TypeCasting in Java
// 1. Implicit (Automatically) 
// Implicit -> try to store small data type into largerone
// byte is the smallest dataType in Java
// byte<-char<-int<-long<-float<-double

// 2. Explicit (User definied)

import java.util.Scanner;

class TypeCasting {
	public static void main(String[] args) {
	
	int a=8;
	double b=a; //Implicit Typecasting
	
	double c=8.8;
	String d=(int)c; //Explicit Typecasting
	
	System.out.println(b);
	System.out.println(d);
	}
}