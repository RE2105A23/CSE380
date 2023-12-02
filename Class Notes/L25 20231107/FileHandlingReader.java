/*
FileHandling
Read a File
FileReader for character by character
BufferReader for line by line
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingReader {
	
	
	public static void main(String[] args) {
		
		try {
			
			String file1="Q2.txt";
			FileReader fileReader=new FileReader(file1);
			BufferedReader bufferReader=new BufferedReader(fileReader);
			
			String l;
			while((l=bufferReader.readLine())!=null) {
				
				System.out.println(l);
				
			}
		
			bufferReader.close();
		}
	
		catch(IOException e) {
			
			System.out.println("File not found");
			
		}
		
	}
	
}