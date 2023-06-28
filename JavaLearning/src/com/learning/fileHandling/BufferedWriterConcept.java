package com.learning.fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/* 
 * BufferedWriter
 * 
 * Constructor
 * BufferedWriter bw = new BufferedWriter(writer w);
 * BufferedWriter bw = new BufferedWriter(writer w, int buffersize);
 * BufferedWriter bw = new BufferedWriter(writer w, int buffersize);
 * 
 * 
 * Method:-
 * 1 write(int ch)
 * 2 write(char[] ch)
 * 3 write(String s)
 * 4 flush()
 * 5 close()
 * 6 newLine()
 */
public class BufferedWriterConcept {

	public static void main(String[] args) {
			
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\TextWriterWithmobileNumber.txt",true));
			bw.newLine();
			bw.write("Hello");
			bw.flush();
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
