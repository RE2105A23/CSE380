/*

WAP for finding the area of rectangle using classes

length and breadh

*/

import java.util.Scanner;

class Area {
	
	double length, breadh, area;
	
	
	void getArea() {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Length="); length=scan.nextDouble();
		System.out.print("Breadh="); breadh=scan.nextDouble();
		
	}
	
	void getArea(double l, double b) {
		
		area=l*b;
		
	}
	
	void print() {
		
		System.out.println("Area= "+area);
	}
}

/*
class RectangleArea {
	
	public static void main(String[] args) {
		
		Area obj=new Area();
		obj.getArea(); obj.print();
		
	}
}
*/

class RectangleArea {
	
	public static void main(String[] args) {
		
		double length,breadh;
		Scanner scan=new Scanner(System.in);
		System.out.print("Length="); length=scan.nextDouble();
		System.out.print("Breadh="); breadh=scan.nextDouble();
		
		Area obj=new Area();
		obj.getArea(length,breadh);
		obj.print();
	}
}
		