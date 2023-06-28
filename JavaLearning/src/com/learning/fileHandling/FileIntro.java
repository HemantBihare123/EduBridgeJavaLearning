package com.learning.fileHandling;

import java.io.File;
import java.io.IOException;

public class FileIntro {

	public static void main(String[] args)  {
		// creating object of File
		File file = new File("D:\\filecreation2.txt");
		
		
		//check whether file created or not
        try {
			if(file.createNewFile()) {
				System.out.println("File creeated successfully");
			}else {
				System.out.println("Some error occured...");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
