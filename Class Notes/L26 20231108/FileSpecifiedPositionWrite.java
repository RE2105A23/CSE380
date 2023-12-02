/*
Writing the file at speciffied position
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;

class FileSpecifiedPositionWrite {
	
	
	public static void main(String[] args) {
		
		try {
			
			
			String file1="sample12.txt";
			FileReader f=new FileReader(file1);
			BufferedReader b=new BufferedReader(f);
			
			//Reading the content
			String str=b.readLine();
			
			//Insert at a speciffied position
			String updated=str.substring(0,7)+"ECE-Robotics"+str.substring(6);
			System.out.println(updated);
			//b.close();
			
			//Writing the content
			FileWriter writer=new FileWriter(file1);
			writer.write(updated);
			writer.close();
			
			/*
			FileInputStream obj=new FileInputStream("sample12.txt");
			int i=0;
			obj.skip(5);
			System.out.println("Reading after 5th character");
			
			while((i=obj.read())!=-1) {
				System.out.print((char)i);
			}
			
			obj.close();
			*/
			
		}
		catch(Exception e) {}
		
	}
	
}