package com.learning.fileHandling;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is new line";
		File file = new File("D:\\filecreation3.txt");
		FileOutputStream output;
		try {
			output = new FileOutputStream(file);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(output);
			outputStreamWriter.write(str);
			outputStreamWriter.close();
			System.out.println("Writing done successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
