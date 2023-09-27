/*
Create a painting class that holds the painting title, artist name, art value.
All paintings are valued at $400. Include a display function that displays all fields.
The FamousPainting subclass overrides the painting value and sets each painting's value
to $25,000. Write main() fucntion to prompt the user to enter the title and artist.
*/

import java.util.Scanner;

class Painting {

	String title,name;
	int value=400; //$400 dollars
	
	Scanner scan=new Scanner(System.in);
	
	void getData() {
		value=400;
		System.out.println("Enter Painting Title and Artist Name");
		title=scan.next(); name=scan.next();
	}
	
	void display() {
		
		System.out.println("Painting Title: "+title);
		System.out.println("Artist Name: "+name);
		System.out.println("Art Value: "+value);
	}	
}

class FamousPainting extends Painting {
	
	//int value=25000;
	
	public FamousPainting(){
		value=25000;
	}
	
	void display() {
		value=25000;
		System.out.println("Painting Title: "+title);
		System.out.println("Artist Name: "+name);
		System.out.println("Art Value: "+value);
	}	
}

class Scenario1 {
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);

		FamousPainting obj=new FamousPainting();
		
		/*
		System.out.println("Enter Painting Title");
		obj.title=scan.next();
		System.out.println("Enter Artist Name");
		obj.name=scan.next();
		*/
		obj.getData();
		obj.display();
		
	}
	
}