package com.learning.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * BufferedReader
 * Constructor
 * BufferedReader br = new BufferedReader(Reader)
 * BufferedReader br = new BufferedReader(Reader, int size)
 * 
 * Methods:
 * 1 int read()
 * 2 int read(char[] ch)
 * 3 void close
 * 4 String readLine()
 */
public class BufferedReaderConcept {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("D:\\TextWriterWithmobileNumber.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line !=null) {
				System.out.println(line);
				line =br.readLine();
				
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
