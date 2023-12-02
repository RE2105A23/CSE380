/*
Writing the file at speciffied position
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileInputStream;

import java.util.Scanner;

class FileHandler1 {
	
	
	public static void main(String[] args) {
		
		String Name;
		int RollNumber;
		
		try {
			
			
			String file1="students.txt";
			FileReader fr=new FileReader(file1);
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter(file1,true);
			BufferedWriter bw=new BufferedWriter(fw);
			
			//bw.write("Name,RollNumber");
			//bw.newLine();
			
			Scanner scan=new Scanner(System.in);
			
			int n;
			
			System.out.println("How many entry?");n=scan.nextInt();
			
			System.out.println("Enter students Name and Roll Number");
			
			for(int i=0;i<n;i++) {
				
				Name=scan.next();
				RollNumber=scan.nextInt();
				
				bw.write(Name+","+RollNumber+"\n");
				//bw.newLine();
				
			}
			

			
			
			
			bw.close();
			
			//Reading the content
			String str=br.readLine();
			System.out.println(str);
			
			
		}
		catch(Exception e) {}
		
	}
	
}