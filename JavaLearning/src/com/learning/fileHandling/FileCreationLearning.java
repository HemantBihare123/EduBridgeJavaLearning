package com.learning.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *   File methods
 *   boolean	file.exists()
 *   boolean	file.createNewFile();
 *   boolean	file.mkdir();
 *   boolean	file.isFile();
 *   boolean	file.isDirectory();
 *   String[] 	file.list();
 *   long 		file.lenght();  
 *   boolean 	file.delete();
 */



/*
 *  FileWriter
 *   Constructor
 *   1	FileWriter fw = new FileWriter(String fname);
 *   2	FileWriter fw = new FileWriter(file reference);
 *   3	FileWriter fw = new FileWriter(String fname, boolean append);
 *   4	FileWriter fw = new FileWriter(file reference, boolean append);
 *   
 *   
 *   Methods:-
 *   1	write(int ch) 	--- to write a single character to the file
 *   2	flush()
 *   3	close()			--- to give the guarantee that total data including last 
 *   						character written properly to the file.
 *   
 *   Problem line separator
 *   \n is not treated as \n in some compiler
 *   
 *   
 *   
 *   Method
 *   1 int read()					--- unicode value of character
 *   2 int read(char[] ch)			--- to read array of character
 *   3 void close()					--- to close
 */


/*
 *  FileReader
 *  Constructor
 *  1	FileReader fr = new FileReader(String filename)
 *  2	FileReader fr = new FileReader(File reference)
 *  
 *  
 *  Problem
 *  we can read data char by char
 */
public class FileCreationLearning {

	public static void main(String[] args) {
		
		//File object created using this line
		File file = new File("D:\\TextWriterWithmobileNumber.txt");
		System.out.println(file.exists());
		if(file.exists()==false) {
			try {
				file.createNewFile();
				System.out.println("File created successfully");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}else {
			System.out.println("File already present");
		}
		
		try {
			FileWriter fw = new FileWriter("D:\\TextWriterWithmobileNumber.txt");
			fw.write("Hello");
			fw.flush();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		try {	
		FileWriter fw2 = new FileWriter(file, true);
		     fw2.write("Boss");
		     fw2.flush();
		     fw2.close();
		     
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	    try {
			FileReader fr = new FileReader(file);
			char[] ch = new char[(int) file.length()];
			fr.read(ch);
			System.out.println("File length: "+file.length());
			for(char ch1 :ch) {
				System.out.print(ch1);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	
	}

}
