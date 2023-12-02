/*
Reading the file at speciffied position
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileInputStream;

class FileSpecifiedPosition {
	
	
	public static void main(String[] args) {
		
		try {
			
			/*
			String file1="sample12.txt"
			FileReader f=new FileReader(file1);
			BufferedReader b=new BufferedReader(f);
			*/
			
			FileInputStream obj=new FileInputStream("sample12.txt");
			int i=0;
			obj.skip(7);
			System.out.println("Reading after 5th character");
			
			while((i=obj.read())!=-1) {
				System.out.print((char)i);
			}
			
			obj.close();
			
		}
		catch(Exception e) {}
		
	}
	
}