/*
FileHandling
Write to a File
FileReader for character by character
BufferReader for line by line
*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingWriter {
	
	
	public static void main(String[] args) {
		
		try {
			
			String file1="Q2.txt";
			FileWriter fileWriter=new FileWriter(file1, true);
			BufferedWriter b=new BufferedWriter(fileWriter);
			
			b.write("HELLO TEACHERS");
			b.newLine();
			b.write("This is JAVA class");
			b.close();
			
		}
	
		catch(IOException e) {
			
			System.out.println("File not found");
			
		}
		
	}
	
}
