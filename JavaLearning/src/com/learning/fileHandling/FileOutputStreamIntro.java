package com.learning.fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data ="this is writing operation";
		File file = new File("D:\\filecreation.txt");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			byte[] arr = new byte[100];
			for(int i=0; i<data.length(); i++) {
				arr[i] =(byte) data.charAt(i);
			}
			 fileOutputStream.write(arr);
			 System.out.println("Succesfully done");
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
